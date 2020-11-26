import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class T9Spelling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputLines = Integer.parseInt(sc.nextLine());
		List<String> inputs = new ArrayList<String>();

		for(int i=0; i<inputLines; ++i) {
			inputs.add(sc.nextLine());
		}

		for(int i=0; i<inputs.size(); ++i) {
			List<String> letters = new ArrayList<String>();
			String outString = "";

			for(int j=0; j<inputs.get(i).length(); ++j){
				letters.add(""+inputs.get(i).charAt(j));
			}

			for(int j=0; j<letters.size(); ++j) {
				String addToOut = "";

				if(letters.get(j).equals("a")) { addToOut = "2"; }
				if(letters.get(j).equals("b")) { addToOut = "22"; }
				if(letters.get(j).equals("c")) { addToOut = "222"; }
				if(letters.get(j).equals("d")) { addToOut = "3"; }
				if(letters.get(j).equals("e")) { addToOut = "33"; }
				if(letters.get(j).equals("f")) { addToOut = "333"; }
				if(letters.get(j).equals("g")) { addToOut = "4"; }
				if(letters.get(j).equals("h")) { addToOut = "44"; }
				if(letters.get(j).equals("i")) { addToOut = "444"; }
				if(letters.get(j).equals("j")) { addToOut = "5"; }
				if(letters.get(j).equals("k")) { addToOut = "55"; }
				if(letters.get(j).equals("l")) { addToOut = "555"; }
				if(letters.get(j).equals("m")) { addToOut = "6"; }
				if(letters.get(j).equals("n")) { addToOut = "66"; }
				if(letters.get(j).equals("o")) { addToOut = "666"; }
				if(letters.get(j).equals("p")) { addToOut = "7"; }
				if(letters.get(j).equals("q")) { addToOut = "77"; }
				if(letters.get(j).equals("r")) { addToOut = "777"; }
				if(letters.get(j).equals("s")) { addToOut = "7777"; }
				if(letters.get(j).equals("t")) { addToOut = "8"; }
				if(letters.get(j).equals("u")) { addToOut = "88"; }
				if(letters.get(j).equals("v")) { addToOut = "888"; }
				if(letters.get(j).equals("w")) { addToOut = "9"; }
				if(letters.get(j).equals("x")) { addToOut = "99"; }
				if(letters.get(j).equals("y")) { addToOut = "999"; }
				if(letters.get(j).equals("z")) { addToOut = "9999"; }
				if(letters.get(j).equals(" ")) { addToOut = "0"; }

				if(outString.length() > 0) {
					if(outString.substring(outString.length()-1).equals( addToOut.substring(0,1) )) {
						outString += " ";	
					}
				}
				outString += addToOut;

			}

			System.out.println( "Case #" + (i+1) + ": " + outString );
		}
	}
}