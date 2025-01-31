import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int vowelCount = 0, consonantCount = 0;
		
		System.out.print("Enter a text: ");
		String user = scan.nextLine();
		
		for(int i = 0; i < user.length(); i++) {
			char check = user.charAt(i);
			if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
				vowelCount++;
			} else {
				consonantCount++;
			}
		}
		System.out.println();
		System.out.println("Vowel count:\t " + vowelCount);
		System.out.println("Consonant count: " + consonantCount);
	}

}
