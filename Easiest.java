import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Easiest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> retVal = new ArrayList<Integer>();

     	while (sc.hasNextInt()) {
			int value = sc.nextInt();
			if(value == 0) { break; }

			/* SOLVE */
				String word = String.valueOf(value);
				int wordSum = 0;

				for (int i = 0; i<word.length(); ++i){
					wordSum += Integer.parseInt( "" + word.charAt(i) );
				}

				for(int j=11; j<1000; ++j) {
					String testWord = String.valueOf( (value * j) );
					int testWordSum = 0;

					for (int i = 0; i<testWord.length(); ++i){
						testWordSum += Integer.parseInt( "" + testWord.charAt(i) );
					}

					if(testWordSum == wordSum) {
						retVal.add(j);
						break;
					}
				}
			/* - - - - */
		}

		for(int i = 0; i<retVal.size(); ++i) {
			System.out.println( ""+ retVal.get(i) );
		}
	}
}