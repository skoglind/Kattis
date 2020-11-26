import java.util.Scanner;
import java.lang.StringBuilder;

public class ReverseBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inDec = sc.nextInt();
		String inBin = Integer.toBinaryString(inDec);
		StringBuilder outBin = new StringBuilder(inBin).reverse();
		int outDec = Integer.parseInt(""+outBin, 2);

		System.out.println( outDec );
	}
}