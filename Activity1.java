import java.util.Scanner;

public class Activity1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int evenCount = 0, oddCount = 0, zeroCount = 0, negativeCount = 0, positiveCount = 0;
		int[] num = new int[5];
		
		for(int i = 0; i < num.length; i++) {
			while(true) {
				try {
					System.out.print((i + 1) + "\tEnter an integer: ");
					String temp = scan.nextLine();
					num[i] = Integer.parseInt(temp);
					break;
				} catch (NumberFormatException e) {
					System.out.println("\tERROR: Should be an integer.");
				}
			}
			if(num[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			} if(num[i] == 0 ) {
				zeroCount++;
			} else if(num[i] < 0) {
				negativeCount++;
			} else {
				positiveCount++;
			}
		}
		System.out.println();
		System.out.println("Even numbers\t: " + evenCount);
		System.out.println("Odd numbers\t: " + oddCount);
		System.out.println("Zero numbers\t: " + zeroCount);
		System.out.println("Negative numbers: " + negativeCount);
		System.out.println("Positive numbers: " + positiveCount);
	}
}
