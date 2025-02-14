import java.util.Scanner;

public class DuplicateChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		boolean isDuplicate = false;
		
		System.out.println("Enter " + num.length + " integers.");
		for(int i = 0; i < num.length; i++) {
			System.out.print("Enter #" + (i + 1) + ":\t");
			int currentNumber = scan.nextInt();
			if(i > 0) {
				for(int j = 0; j <= i; j++) {
					if(currentNumber == num[j]) {
						currentNumber = 0;
						isDuplicate = true;
						break;
					}
				}
			}
			num[i] = currentNumber;
		}
		System.out.println();
		if(isDuplicate) {
			for(int i = 0; i < num.length; i++) {
				if(num[i] == 0) {
					continue;
				} else {
					System.out.print(num[i] + " ");
				}
			}
		} else {
			System.out.println("No duplicate is found.");
			for(int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
			}
		}
	}
}
package DASTRUC;

import java.util.Scanner;

public class DuplicateChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		boolean isDuplicate = false;
		
		System.out.println("Enter " + num.length + " integers.");
		for(int i = 0; i < num.length; i++) {
			System.out.print("Enter #" + (i + 1) + ":\t");
			int currentNumber = scan.nextInt();
			if(i > 0) {
				for(int j = 0; j <= i; j++) {
					if(currentNumber == num[j]) {
						currentNumber = 0;
						isDuplicate = true;
						break;
					}
				}
			}
			num[i] = currentNumber;
		}
		System.out.println();
		if(isDuplicate) {
			for(int i = 0; i < num.length; i++) {
				if(num[i] == 0) {
					continue;
				} else {
					System.out.print(num[i] + " ");
				}
			}
		} else {
			System.out.println("No duplicate is found.");
			for(int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
			}
		}
	}
}
