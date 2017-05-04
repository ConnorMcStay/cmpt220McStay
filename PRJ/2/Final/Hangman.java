import java.util.*;

public class Hangman {
	
	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		Random random = new Random();

			// *** Enter desired word between brackets ***
		String[] guess = { "hello" , "goodbye", "eat", "drink" , "water" , "phone", "mouse" , "car" , "pants", "shirt", "yellow" , "hope" , "computer" , "man" };
		
			//tell user that the minus sign will exit the game 
		System.out.println("Welcome to the game! press '-' to exit at any time!");
		
			// are we playing? if true then begin 
		boolean weArePlaying = true; 
		
		if (weArePlaying) {
			
					// GAME GOES HERE
			
		char[] randomWordToGuess = guess[random.nextInt(guess.length)].toCharArray();
		
			// since tries deplete even if letter guessed correctly and true hang man gives 6 tries then tries= word + 6 
		int ammountOfGuess = randomWordToGuess.length + 6;  
		
		char[] playerGuess = new char[randomWordToGuess.length ]; // _ _ _ _ _
		
			for (int i = 0 ; i < playerGuess.length; i++) {
				playerGuess[i] = '_';
			}
			
			boolean wordIsGuessed = false;
			
			int tries = 0;
			
				while (!wordIsGuessed && tries != ammountOfGuess) {
					
						// tell user how long the word is 
					System.out.println("The word is " + randomWordToGuess.length + " characters long");
					
						//Tell user how many correct guesses they have
					System.out.println("Current correct guesses: ");
					
						//prints the _ 
					System.out.println(playerGuess);
					
						//tells how many tries they have left
					System.out.printf("You have %d tries left. \n" , ammountOfGuess - tries);
					
						//prompt user to enter next guess
					System.out.println("Enter a single character:"); 
					
					char c = input.nextLine().charAt(0);
					
					tries++;		
					
					if (c == '-') {
							// exit the game 
						System.out.println("It apperes that you pressed the minus sighn to end the game, I hope you did not mean that :'(");
						
						weArePlaying = false;
						wordIsGuessed = true; 
						
					} else { 
								// contiue the game 
							for (int i = 0 ; i < randomWordToGuess.length; i++) {
								if (randomWordToGuess[i] == c) {
									playerGuess[i] = c; 
							}
						}
							
							if (isTheWordGuessed(playerGuess)) {
								wordIsGuessed = true;
								System.out.println("Congragulation you won! ");
							}
							
							if (ammountOfGuess - tries == 0) {
								
									//looks messed up but when played the formatting is correct
								System.out.println("Game Over");
								System.out.println("	_____________");	
								System.out.println("	|	   |");	
								System.out.println("	o	   |");	
								System.out.println("      / | )        |");	
								System.out.println("	|	   |");	
								System.out.println("       / )	   |");	
								System.out.println("		___|_");  	  		
							}
						}
					}		
				}
			} 
	
	public static void printArray(char[] array) {
		for (int i = 0 ; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}
	
	public static boolean isTheWordGuessed(char[] array) {
		for (int i = 0 ; i < array.length; i++) {
			if (array[i] == '_') return false;
		} 
		
		return true;
		
	} 
}

