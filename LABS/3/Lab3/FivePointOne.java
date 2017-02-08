import java.util.Scanner;

public class FivePointOne {

	public static void main(String[] args) {
	 
		Scanner input = new Scanner(System.in);
		
		int positive = 0 , negitive = 0 , average = 0 , sum = 0 , total = 0  ; 

		System.out.println("Enter an integer, the input ends if it is 0: ");
		
		int number; 
		
		
		
			while ((number = input.nextInt()) != 0) {
				total += number;
	            sum++;
			 if (number > 0 ) {
				positive++; 
			} else if (number < 0) {
				negitive++;
			}
}
				average = total / sum ; 
				
				System.out.println("The number of positves are: " + positive);
				System.out.println("The number of negitives are: " + negitive);
				System.out.println("The average is: " + average);
				System.out.println("the sum off all the numbers is: " + total);
			
	

	}

}
 
		
      /*  Scanner input = new Scanner(System.in);

        int positive = 0, negative = 0, total = 0, count = 0;

        double average;

        System.out.println("Enter the number: ");
        int number;

        while ((number = input.nextInt()) != 0) {
            total += number;
            count++;
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            }
        }
        average = (double) total / count;
        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + total);
        System.out.printf("The average is: " + average);
    }
} */