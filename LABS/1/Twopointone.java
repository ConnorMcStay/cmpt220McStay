package lab1;

import java.util.Scanner;

public class Twopointone {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a tempeture in Fahrenheit: ");
		int number = input.nextInt();
		
		System.out.println( 9.0 / 5 * number + 32 );
		
		int targetNumber = (int) (Math.random()* 10);
		

	}

}
