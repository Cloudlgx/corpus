import java.util.ArrayList;

public class StopList {
	private final static String s1 = "'s";
	private final static String s2 = "he";
	private final static String s3 = "of";
	private final static String s4 = "to";
	private final static String s5 = "a";
	private final static String s6 = "and";
	private final static String s7 = "in";
	private final static String s8 = "that";
	private final static String s9 = "for";
	private final static String s10 = "is";
	private final static String s11 = "it";
	private final static String s12 = "on";
	private final static String s13 = "as";
	private final static String s14 = "at";
	private final static String s15 = "was";
	private final static String s16 = "he";
	private final static String s17 = "by";
	private final static String s18 = "with";
	private final static String s19 = "from";
	private final static String s20 = "be";
	private final static String s21 = "are";
	private final static String s22 = "but";
	private final static String s23 = "an";
	private final static String s24 = "n't";
	private final static String s25 = "its";
	private final static String s26 = "or";
	private final static String s27 = "will";
	private final static String s28 = "they";
	private final static String s29 = "would";
	private final static String s30 = "which";
	private final static String s31 = "his";
	private final static String s32 = "had";
	private final static String s33 = "this";
	private final static String s34 = "about";
	private final static String s35 = "were";
	private final static String s36 = "i";
	private final static String s37 = "their";
	private final static String s38 = "not";
	private final static String s39 = "up";
	private final static String s40 = "who";
	private final static String s41 = "been";
	private final static String s42 = "than";
	private final static String s43 = "we";
	private final static String s44 = "also";
	private final static String s45 = "if";
	private final static String s46 = "when";
	private final static String s47 = "could";
	private final static String s48 = "out";
	private final static String s49 = "you";
	private final static String s50 = "because";
	private final static String s51 = "into";
	private final static String s52 = "such";
	private final static String s53 = "so";
	private final static String s54 = "over";
	private final static String s55 = "she";
	private final static String s56 = "no";
	private final static String s57 = "any";
	private final static String s58 = "what";
	private final static String s59 = "her";
	private final static String s60 = "them";
	private final static String s61 = "did";
	private final static String s62 = "him";
	private final static String s63 = "while";
	private final static String s64 = "these";
	private final static String s65 = "just";
	private final static String s66 = "then";
	private final static String s67 = "'re";
	private final static String s68 = "'ve";
	private final static String s69 = "'em";
	private final static String s70 = "'ll";
	private final static String s71 = "'m";
	private final static String s72 = "'d";
	private final static String[] stoplist = new String[] { s1, s2, s3, s4, s5,
			s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19,
			s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s31, s32,
			s33, s34, s35, s36, s37, s38, s39, s40, s41, s42, s43, s44, s45,
			s46, s47, s48, s49, s50, s51, s52, s53, s54, s55, s56, s57, s58,
			s59, s60, s61, s62, s63, s64, s65, s66, s67, s68, s69, s70, s71,
			s72 };

	public static ArrayList<Phrase> check(ArrayList<Phrase> lists) {
		for (int i = 0; i < lists.size(); i++) {
			String a = lists.get(i).getPhrase1(), b = lists.get(i)
					.getPhrase2();
			for (int j = 0; j < stoplist.length; j++) {
				if (a.equals(stoplist[j])
						|| b.equals(stoplist[j])) {
					lists.remove(i--);
					break;
				}
			}
		}
		lists.remove(0);
		return lists;
	}
	
//	public static ArrayList<Phrase> check1(Frequency freq){
//		ArrayList<Phrase> phraseList = new ArrayList<Phrase>();
//		int position = freq.getPosition();
//		Phrase[]
//		for (int i = 0; i < phrases.size(); i++) {
//			String a = phrases.get(i).getPhrase1(), b = phrases.get(i)
//					.getPhrase2();
//			for (int j = 0; j < stoplist.length; j++) {
//				if (a.equals(stoplist[j])
//						|| b.equals(stoplist[j])) {
//					phrases.remove(i--);
//					break;
//				}
//			}
//		}
//		return phraseList;
//	}
}
