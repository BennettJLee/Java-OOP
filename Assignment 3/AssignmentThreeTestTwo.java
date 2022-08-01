public class AssignmentThreeTestTwo {

	public static void main(String[] args){

		OddWords oddWords = new OddWords();

		System.out.println("\nINPUT_FILE_SMALL.TXT");
		oddWords.processFile("input_file_small.txt");

		System.out.println("\nINPUT_FILE_MEDIUM.TXT");
		oddWords.processFile("input_file_medium.txt");
	}
}

// Expected output:
// INPUT_FILE_SMALL.TXT
// the INSERTED
// the quick INSERTED
// the quick brown INSERTED
// the quick brown fox INSERTED
// the quick brown fox jumped INSERTED
// the quick brown fox jumped over INSERTED
// the DELETED
// quick brown fox jumped over lazy INSERTED
// quick brown fox dog INSERTED

// LEXICON:
// brown
// dog
// fox
// jumped
// lazy
// over
// quick

// INPUT_FILE_MEDIUM.TXT
// green INSERTED
// green eggs INSERTED
// green eggs and INSERTED
// green ham INSERTED
// green eggs and by INSERTED
// green eggs and by doctor INSERTED
// green ham seuss INSERTED
// green ham seuss i INSERTED
// green eggs and am INSERTED
// green ham seuss i sam INSERTED
// green ham seuss i DELETED
// green eggs and am DELETED
// green ham seuss sam DELETED
// green ham seuss sam INSERTED
// green ham seuss sam i INSERTED
// green eggs and am INSERTED
// green ham seuss that INSERTED
// green ham seuss sam DELETED
// green ham seuss i DELETED
// green eggs and am DELETED
// green ham seuss that DELETED
// green ham seuss sam INSERTED
// green ham seuss sam i INSERTED
// green eggs and am INSERTED
// green ham seuss sam i DELETED
// green eggs and by doctor do INSERTED
// green ham seuss sam not INSERTED
// green ham seuss sam not like INSERTED
// green ham seuss that INSERTED
// green ham seuss sam DELETED
// green ham seuss not like i INSERTED
// green eggs and am DELETED
// green eggs and by doctor do DELETED
// green ham seuss that would INSERTED
// green ham seuss that would you INSERTED
// green ham seuss not like DELETED
// green DELETED
// ham eggs DELETED
// ham and DELETED
// ham DELETED
// i DELETED
// not by doctor do INSERTED
// not DELETED
// seuss by doctor like INSERTED
// seuss that would them INSERTED
// seuss by doctor like sam INSERTED
// seuss by doctor like i INSERTED
// seuss by am INSERTED
// seuss by doctor like i DELETED
// seuss by doctor do DELETED
// seuss by doctor like sam not INSERTED
// seuss by doctor like DELETED
// seuss by doctor sam not green INSERTED
// seuss by doctor sam not green eggs INSERTED
// seuss by am and INSERTED
// seuss by doctor sam not green ham INSERTED
// seuss that would DELETED
// seuss that you DELETED
// seuss by doctor sam not green ham like INSERTED
// seuss that them DELETED
// seuss by doctor sam not green ham like here INSERTED
// seuss by doctor sam not or INSERTED
// seuss that there INSERTED
// seuss by doctor sam not green ham like here i INSERTED
// seuss that there would INSERTED
// seuss by doctor sam not DELETED
// seuss by doctor sam or green ham like DELETED
// seuss that there them INSERTED
// seuss by doctor sam or green ham here DELETED
// seuss by doctor sam or DELETED
// seuss that there DELETED
// seuss by doctor sam green ham i DELETED
// seuss that would DELETED
// seuss by doctor sam green ham not INSERTED
// seuss by doctor sam green ham not like INSERTED
// seuss that them DELETED
// seuss by am and anywhere INSERTED
// seuss by doctor sam green ham not like i INSERTED
// seuss by doctor do INSERTED
// seuss by doctor sam green ham not DELETED
// seuss by doctor sam green ham like DELETED
// seuss by doctor sam green DELETED
// seuss by doctor sam ham eggs DELETED
// seuss by am and DELETED
// seuss by doctor sam ham DELETED
// seuss by doctor sam i DELETED
// seuss by doctor do DELETED
// seuss by doctor sam not INSERTED
// seuss by doctor sam not like INSERTED
// seuss that them INSERTED
// seuss by doctor sam DELETED
// seuss by doctor not like i INSERTED
// seuss by am DELETED

// LEXICON:
// anywhere
// by
// doctor
// i
// like
// not
// seuss
// that
// them