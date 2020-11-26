import java.util.Scanner;

public class Aaah {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

     	String row1 = sc.nextLine();
     	String row2 = sc.nextLine();

     	if(row1.length() >= row2.length()) {
     		System.out.println( "go" );
     	} else {
     		System.out.println( "no" );
     	}
	}
}