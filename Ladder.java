import java.util.Scanner;
import java.lang.Math;

public class Ladder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     	String input = sc.nextLine();
		String[] values = input.split("\\s+");

		int height = Integer.parseInt(values[0]);
		int angle = Integer.parseInt(values[1]);
		
		double ladderLengthDBL = height / Math.sin(Math.toRadians(angle));
		double ladderLengthDBL2 = Math.ceil(ladderLengthDBL);
		Long ladderLengthLONG = Math.round( ladderLengthDBL2 );
		int ladderLength = Integer.parseInt( ""+ ladderLengthLONG );

		System.out.println( ""+ ladderLength );
	}
}