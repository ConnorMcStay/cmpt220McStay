import java.util.Scanner;

public class SevenPointTen {


	    static int number = 10; //int 

	    public static void main(String[] args) {

	        double[] numbers = new double[number];

	        Scanner input = new Scanner(System.in); // scanner 

	        System.out.print("enter " + number + " numbers: "); // prompt user 

	        for (int i = 0; i < numbers.length; i++) 
	        numbers[i] = input.nextDouble();

	        System.out.println("the index of the smallest number is: " + indexElement(numbers)); // return result to user
	    }
	  
	    public static int indexElement(double[] array) { // array 

	        int index = 0;

	        double low = array[index];

	        for (int num = 0; num < array.length; num++) { //increment 

	            if (low > array[num]) {

	                low = array[num];

	                index = num;
	            }
	        }
	        return index;
	    }

	} 
