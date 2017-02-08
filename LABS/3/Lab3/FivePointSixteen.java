import java.util.Scanner;

/*   (Find the factors of an integer) Write a program that 
 * reads an integer and displays all its smallest factors in 
 * increasing order. For example, if the input integer is 120,
 *  the output should be as follows: 2, 2, 2, 3, 5. */
public class FivePointSixteen {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 
		System.out.println("Enter an integer: ");
		
		int n = input.nextInt();
		for(int i=2; i<=n; i++){
			while(n%i==0){
				System.out.println(i);
				n = n/i;
			}
		}
		
	}

}
