import java.util.Scanner;
import java.util.ArrayList;

public class QuickBrownFox {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> missingLetters = new ArrayList<String>();
		int lines = Integer.parseInt(sc.nextLine());

		for(int j=0; j<lines; ++j) {
			String input = sc.nextLine().toLowerCase();

			/* Fyll i alfabetet */
				char[] newLetter = new char[26];
				for(int i=97; i<123; ++i) {
					newLetter[i-97] = (char) i; 
				}
			/* -- */

			String inLetters = "";
			for(int i=0; i<newLetter.length; ++i) {
				if(!input.contains( "" + newLetter[i] )) {
					inLetters += newLetter[i];
				}
			}
			if(inLetters.equals("")) {
				inLetters = "pangram";
			} else {
				inLetters = "missing " + inLetters;
			}

			missingLetters.add( inLetters );
		}

		for(String missing: missingLetters) {
			System.out.println( missing );	
		}

	}
}
