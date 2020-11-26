import java.util.Scanner;

public class Oddities {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     	int numberOfLoops = sc.nextInt();
     	int[] nums = new int[numberOfLoops];

     	for(int i=0;i<numberOfLoops;++i) {
     		int value = sc.nextInt();
     		nums[i] = value;
     	}

     	for(int onNum : nums) {
     		if(onNum % 2 == 0) {
     			System.out.println( onNum + " is even" );
     		} else {
     			System.out.println( onNum + " is odd" );
     		}
     	}
	}
}