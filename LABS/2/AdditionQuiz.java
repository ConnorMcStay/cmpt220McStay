package selections;

import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		int number1 = (int)(System.currentTimeMillis() % 10); //way of getting a number between 0-9 that changes all the time
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		int number3 = (int)(System.currentTimeMillis() / 4 % 10);
		
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "?");
		
		int answer = input.nextInt();
		
		System.out.println(number1 + " + " + number2 + " + " + number3 +  " = " + answer + " is " + (number1 + number2 + number3 == answer ));
	}

}
