import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0, diff = 0;
		double quot = 0, prod = 0;
		
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
			if(i == 0) {
				sum = num[i];
				diff = num[i];
				prod = (double)num[i];
				quot = (double)num[i];
			} else {
				sum += num[i];
				diff -= num[i];
				prod *= (double)num[i];
				quot /= (double)num[i];
			}
			
		}
		System.out.println();
		System.out.println("Sum:\t " + sum);
		System.out.println("Diff:\t" + diff);
		System.out.println("Prod:\t " + prod);
		System.out.println("Quot:\t " + quot);
	}
}
