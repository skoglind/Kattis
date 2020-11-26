import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Pot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     	int rowCount = Integer.parseInt(sc.nextLine());

     	List<Integer> values = new ArrayList<Integer>();

		for(int i=0; i<rowCount; ++i) {
			String input = sc.nextLine();
			int number = Integer.parseInt(input.substring(0, input.length()-1));
			int power = Integer.parseInt(input.substring(input.length()-1));
			Long value = Math.round(Math.pow(number, power));
			int myValue = Integer.parseInt( ""+value );

			values.add( myValue );
		}

		int sum = 0;
		for(int i=0; i<values.size(); ++i) {
			sum += values.get(i);
		}

		System.out.println( sum );
	}
}