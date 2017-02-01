package lab1;

import java.util.Scanner;

public class TwoPointFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate:  ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		System.out.print("The gratuity is " + number2 / 10.0 + " and total is " + number2 / 10.0 + number1 );
		

	}

}

