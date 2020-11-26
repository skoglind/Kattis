import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Modulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];
		List<Integer> modNums = new ArrayList<Integer>();
	
		for(int i = 0; i<10; ++i) {
			int mod42 = 0;

			numbers[i] = sc.nextInt();
			mod42 = numbers[i] % 42;

			if(!modNums.contains(mod42)) {
				modNums.add(mod42);
			}
		}

		System.out.println( modNums.size() );
	}
}