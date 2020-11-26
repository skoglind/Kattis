import java.util.Scanner;

public class Bijele {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String valueString = sc.nextLine();
		String[] values = valueString.split("\\s+");

		String outString = "";

		for(int position = 0; position<6; position++){
			int count = Integer.parseInt(values[position]);
			int diff = 0;

			switch(position) {
				case 0: //1
				case 1: // 1
					diff = 1 - count;
					break;
				case 2: // 2
				case 3: // 2
				case 4: // 2
					diff = 2 - count;
					break;
				case 5: // 8
					diff = 8 - count;
					break;
			}

			if(position == 5) {
				outString += diff;
			} else {
				outString += diff + " ";
			}
		}


		System.out.println( outString );	
	}
}