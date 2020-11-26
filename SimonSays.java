import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SimonSays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numRows = Integer.parseInt(sc.nextLine());

		List<String> strings = new ArrayList<String>();

		for(int i=0; i<numRows; ++i) {
			String inValue = sc.nextLine();
			String lookFor = "Simon says ";

			if( inValue.length() >= lookFor.length() ) {
				if( inValue.substring(0, lookFor.length()).equals(lookFor) ) {
					strings.add( inValue.substring(lookFor.length()) );
				}
			}
		}

		for(String value: strings) {
			System.out.println( value );
		}
	}
}