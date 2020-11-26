import java.util.Scanner;

public class Cold {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valueCount = Integer.parseInt(sc.nextLine());
		String valueString = sc.nextLine();
		String[] values = valueString.split("\\s+");

		int negativeCount = 0;

		for(String value: values) {
			if(Integer.parseInt(value) < 0) {
				negativeCount++;
			}
		}


		System.out.println( negativeCount );	
	}
}