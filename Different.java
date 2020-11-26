import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;

public class Different {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<BigInteger> diffs = new ArrayList<BigInteger>();

		while(sc.hasNextLine()) {
			String rowData = sc.nextLine();
			String[] valuesString = rowData.split("\\s+");
			BigInteger[] values = new BigInteger[2];

			values[0] = new BigInteger(valuesString[0]);
			values[1] = new BigInteger(valuesString[1]);

			if(values[0].compareTo(values[1]) == 0) {
				diffs.add( BigInteger.valueOf(0) );
			} else if(values[0].compareTo(values[1]) > 0) {
				diffs.add( values[0].subtract(values[1]) );
			} else {
				diffs.add( values[1].subtract(values[0]) );
			}
		}

		for(BigInteger diff: diffs) {
			System.out.println( ""+diff );
		}
	}
}