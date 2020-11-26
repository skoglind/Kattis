import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Trik {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		List<String> moves = new ArrayList<String>();

		for (int i = 0; i<input.length(); ++i){
			moves.add(""+input.charAt(i));
		}

		int inCup = 1;

		for(int i=0; i<moves.size(); ++i) {
			if(moves.get(i).equals("A")) {
				if(inCup==1) { inCup = 2; } 
				else if(inCup==2) { inCup = 1; }
			}
			else if(moves.get(i).equals("B")) {
				if(inCup==2) { inCup = 3; } 
				else if(inCup==3) { inCup = 2; }
			}
			else if(moves.get(i).equals("C")) {
				if(inCup==1) { inCup = 3; } 
				else if(inCup==3) { inCup = 1; }
			}
		}

		System.out.println( inCup );
	}
}