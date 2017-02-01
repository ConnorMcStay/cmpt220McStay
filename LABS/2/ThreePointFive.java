import java.util.Scanner;
public class ThreePointFive {
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);	
		System.out.print("Enter todays date: "); 	
		int day = input.nextInt();	
		System.out.print("Enter the number of days elapsed since today:" );
		 int day1 = input.nextInt();
		 int day2 = (day + day1) % 7;
		switch (day) {	
		case 0: System.out.println("Today is Sunday the future date is "); break ;
		case 1: System.out.println("Today is Monday the future date is "); break ;
		case 2: System.out.println("Today is Tuesday the future date is " ); break ;
		case 3: System.out.println("Today is Wednesday the future date is "); break ; 
		case 4: System.out.println("Today is Thursday the future date is "); break ; 
		case 5: System.out.println("Today is Friday the future date is "); break ; 
		case 6: System.out.println("Today is Saturday the future date is "); break ; 
		}
		switch (day2) {
		case 0: System.out.println("Sunday"); break ;
		case 1: System.out.println("Monday " ); break ;
		case 2: System.out.println("Tuesday"); break ;
		case 3: System.out.println("Wednesday "); break ; 
		case 4: System.out.println("Thursday"); break ; 
		case 5: System.out.println("Friday "); break ; 
		case 6: System.out.println("Saturday"); break ; 
		}
	}
}
