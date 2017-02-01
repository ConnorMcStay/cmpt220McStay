import java.util.Scanner;

public class FourPointThirteen {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter a letter and only a letter: ");
		
		char letter = input.next().charAt(0);
		
		if (letter < 'a' || letter > 'Z' ) {
			System.out.print("That is an invalad charecter");
			System.exit(1);
		}
		
		if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'Y' || letter == 'a' || letter == 'e' || letter == 'i' ||
				letter == 'o' || letter == 'u' || letter == 'y') {
			System.out.println(letter + " is a vowel");
		} else { 
			System.out.println(letter + " is a consinante");
				
		}
	}

}
