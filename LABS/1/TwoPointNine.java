package lab1;

import java.util.Scanner;

public class TwoPointNine {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter v0, v1, and t: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		System.out.println("The average acceleration is " + (number1 - number2) / number3 ); // JA: It should be (number2 - number1) / number3

	}

}
