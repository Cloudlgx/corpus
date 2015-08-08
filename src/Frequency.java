import java.util.ArrayList;

public class Frequency {

	 private ArrayList<Phrase> phaseList = new ArrayList<Phrase>(100000);
	 public Frequency() {
	 phaseList.add(new Phrase("", ""));
	 }
	
	 public void Add(Phrase phase) {
	 for (int i = 0; i < phaseList.size(); i++) {
	 if (phaseList.get(i).getPhrase().equals(phase.getPhrase())) {
	 phaseList.get(i).addFrequency();
	 break;
	 }
	 }
	 phaseList.add(phase);
	 }
	
	 public ArrayList<Phrase> getPhaseList() {
	 return phaseList;
	 }
	
	 public void setPhaseList(ArrayList<Phrase> phaseList) {
	 this.phaseList = phaseList;
	 }
//	private Phrase[] phrases;
//	private int position = 0;
//
//	public Frequency(int size) {
//		phrases = new Phrase[size];
//	}
//
//	public void Add(Phrase phrase) {
//		if (position == 0) {
//			phrases[position++] = phrase;
//		} else {
//			for (int i = 0; i < position; i++) {
//				if (phrases[i].getPhrase().equals(phrase.getPhrase())) {
//					phrases[i].addFrequency();
//					break;
//				}
//			}
//			phrases[position++] = phrase;
//		}
//	}
//
//	public Phrase[] getPhrases() {
//		return phrases;
//	}
//
//	public void setPhrases(Phrase[] phrases) {
//		this.phrases = phrases;
//	}
//
//	public int getPosition() {
//		return position;
//	}
//
//	public void setPosition(int position) {
//		this.position = position;
//	}

}