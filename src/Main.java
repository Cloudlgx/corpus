
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public ArrayList<String> corpusArrayList = new ArrayList<String>(10000);

	/**
	 * 功能：Java读取txt文件的内容 步骤：1：先获得文件句柄 2：获得文件句柄当做是输入一个字节码流，需要对这个输入流进行读取
	 * 3：读取到输入流后，需要读取生成字节流 4：一行一行的输出。readline()。 备注：需要考虑的是异常情况
	 * 
	 * @param filePath
	 */
	public static ArrayList<String> readTxtFile(String filePath) {
		Main main = new Main();
		try {
			String encoding = "UTF-8";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);// 考虑到编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				String[] temp;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					temp = lineTxt.split(" ");
					for (int i = 0; i < temp.length; i++) {
						main.corpusArrayList.add(temp[i]);
					}
				}
				read.close();
			} else {
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}
		return main.corpusArrayList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ArrayList<String> corpus;
		String filePath = "corpus.txt";
		// "res/";
		double time1 = 0;
		double time2 = 0;
		corpus = readTxtFile(filePath);
		time2 = System.currentTimeMillis();
		System.out.println(corpus.size()+"time: "+(time2-time1));

		corpus = Puntation.check(corpus);
		time1 = System.currentTimeMillis();
		System.out.println(corpus.size()+"time: "+(time1-time2));

		
		
		
		time1 = System.currentTimeMillis();
		Frequency frequency = new Frequency();
		for (int i = 0; i < corpus.size() - 1; i++) {
			Phrase phase = new Phrase(corpus.get(i), corpus.get(i + 1));
			frequency.Add(phase);
		}
		time2 = System.currentTimeMillis();
		System.out.println("done  " + frequency.getPhaseList().size()+"time: "+(time2-time1));

		frequency.setPhaseList(StopList.check(frequency.getPhaseList()));
		time1 = System.currentTimeMillis();
		System.out.println("done  " + frequency.getPhaseList().size()+"time: "+(time1-time2));

		int maxf = 0;
		int pos = 0;
		for (int i = 0; i < frequency.getPhaseList().size(); i++) {
			if (maxf < frequency.getPhaseList().get(i).getFrequency()) {
				maxf = frequency.getPhaseList().get(i).getFrequency();
				pos = i;
			}
		}
		System.out.println(maxf + ": " + pos + ": "
				+ frequency.getPhaseList().get(pos).getPhrase());
	}

}
