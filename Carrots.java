import java.util.Scanner;

public class Carrots {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iteration = 0;
		int myReturnValue = 0;

     	while (sc.hasNextLine()) {
			String value = sc.nextLine();
			if(iteration == 0) {
				String[] splitArray = value.split("\\s+");

				myReturnValue = Integer.parseInt(splitArray[1]);
			}

			if(value.equals("")) { break; }

			iteration++;
		}	

		System.out.println( myReturnValue );	
	}
}