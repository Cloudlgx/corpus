import java.util.ArrayList;

public class Puntation {

	private static final String p1 = ",";
	private static final String p2 = ".";
	private static final String p3 = "``";
	private static final String p4 = "''";
	private static final String p5 = ":";
	private static final String p6 = "(";
	private static final String p7 = ")";
	private static final String p8 = "?";
	private static final String p9 = "--";
	private static final String p10 = "-";
	private static final String p11 = ";";
	private static final String p12 = "&amp;";
	private static final String p13 = "{";
	private static final String p14 = "}";
	private static final String p15 = "...";
	private static final String p16 = "";
	private static final String[] puns = new String[] { p1, p2, p3, p4, p5, p6, p7,
			p8, p9, p10, p11, p12, p13, p14, p15, p16,};

	public static ArrayList<String> check(ArrayList<String> res) {
		for (int i = 0; i < res.size(); i++) {
			for (int j = 0; j < puns.length; j++) {
				if (res.get(i).equals(puns[j])) {
					res.remove(i--);
					break;
				}
			}
		}

		return res;
	}

}
