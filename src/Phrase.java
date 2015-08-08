
public class Phrase {
	private String phrase1 = "";
	private String phrase2 = "";
	private int frequency = 0;

	public String getPhrase(){
		return new String(this.phrase1+" "+this.phrase2);
	}
	public String getPhrase1() {
		return phrase1;
	}
	public void setPhrase1(String phrase1) {
		this.phrase1 = phrase1;
	}
	public String getPhrase2() {
		return phrase2;
	}
	public void setPhrase2(String phrase2) {
		this.phrase2 = phrase2;
	}
	public int getFrequency() {
		return frequency;
	}
	public void addFrequency(){
		this.frequency++;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public Phrase(String a, String b) {
		this.phrase1 = a;
		this.phrase2 = b;
		this.frequency = 1;
	}
}
