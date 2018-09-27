import java.util.Scanner;

public class PhraseOMatic_r0 {
	public static void printOut(String inputSentence) {
		System.out.println(inputSentence);
	}
	public static int getInt(String inputDescription) {
		Scanner scannerObj = new Scanner(System.in);
		printOut(inputDescription);
		int returnVal = scannerObj.nextInt();
		scannerObj.close();
		return returnVal;
	}
	public static String getString(String inputDescription) {
		Scanner scannerObj2 = new Scanner(System.in);
		printOut(inputDescription);
		String returnVal = scannerObj2.next();
		scannerObj2.close();
		return returnVal;
	}
	public static void main(String[] args) {
    	final int NUMOFPHRASES = 5;  // Number of phrases to generate
    	
		// Word list arrays
		String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B",
			"win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma",
			"critical-path", "dynamic"};
		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", 
			"distributed", "clustered", "branded", "outside-the-box", "positioned",
			"networked","focused", "leveraged", "aligned", "targeted", "shared",
			"cooperative", "accelerated"};
		String[] wordListThree = {"process", "tipping-point", "solution", "architecture",
			"core competency","strategy", "mindshare", "portal", "space", "vision"};

		// Number of words in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		for (int j = oneLength - 1; j >= 0; j--) {
			int stringLength = wordListOne[j].length();
			printOut("Item #" + j + " = " + wordListOne[j]);
			printOut("Length: " + stringLength);
		}
		// generate and display phrases
		for (int i = 0; i < NUMOFPHRASES; i++) {
			int rand1 = (int) (Math.random() * oneLength);
			int rand2 = (int) (Math.random() * twoLength);
			int rand3 = (int) (Math.random() * threeLength);       
			String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + 
				wordListThree[rand3];
			printOut("What we need is a " + phrase);
       	} // generate and display phrases 
		int testGetIntInt = getInt("Enter something... anything! ");
		printOut(Integer.toString(testGetIntInt));
		String str = getString("Enter a string");
    } // end main()  
} // end PhraseOMatic