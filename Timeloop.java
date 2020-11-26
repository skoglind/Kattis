import java.util.Scanner;

public class Timeloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     	int value = sc.nextInt();

		for(int i = 1; i<value+1; i++) {
			System.out.println( i + " Abracadabra" );
		}
	}
}