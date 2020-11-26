import java.util.Scanner;

public class ANewAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toLowerCase();

		String[] newLetter = new String[]{"@","8","(","|)","3","#","6","[-]","|","_|","|<","1","[]\\/[]",
										"[]\\[]","0","|D","(,)","|Z","$","']['","|_|","\\/","\\/\\/","}{",
										"`/","2"};

		String newWord = "";
		for(int i=0; i<input.length(); ++i) {
			int letter = input.charAt(i);

			if(97 <= letter && letter <= 122) {
				newWord += newLetter[letter-97];
			} else {
				newWord += input.charAt(i);
			}
		}

		System.out.println( newWord );
	}
}
