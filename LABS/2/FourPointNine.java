import java.util.Scanner;

public class FourPointNine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Charecter: ");
		char number = input.next().charAt(0); 
		
		System.out.print("The Unicode for the character "+ number + " is " +(int) number); 

	}

}
