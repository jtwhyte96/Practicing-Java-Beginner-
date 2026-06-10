package practice;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	
	public static void numberGuessingGame(Scanner input, int level) {
		
		Random random = new Random();		
		int guesses = 0;
		int secretNumber = random.nextInt(100) + 1; // 1 to 100
		int numberGuessed;
		int count = 0;
		
		final int EASY = 1;
		final int MEDIUM = 2;
		final int HARD = 3;
		
		if (level == EASY) {
			guesses = 10;
		} else if (level == MEDIUM) {
			guesses = 7;
		} else if (level == HARD) {
			guesses = 5;
		}  else {
			System.out.println("Invalid difficulty level.");
		    return;
		}
		
		System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Can you guess it?");
        
        do {
        	
        	System.out.println("Enter your guess");
        	numberGuessed = input.nextInt();
        	count++;
        	
        	if (numberGuessed < secretNumber) {
        		System.out.println("Too low!");
        		System.out.println("Guesses remaining: " + (guesses - count));
        	} else if (numberGuessed > secretNumber) {
        		System.out.println("Too high!");
        		System.out.println("Guesses remaining: " + (guesses - count));
        	} else { 
        		System.out.println("Congratulation! You guessed the number.");
        		System.out.println("It took you " + count + " guesses.");
        	}
        	
        
        } while (numberGuessed != secretNumber && count < guesses);   
        
        if (numberGuessed != secretNumber) {
    	    System.out.println("You're out of guesses!");
    	    System.out.println("The number was " + secretNumber);
    	}
       
}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String replay;
		int level;
		
		System.out.println("Welcome to Number Guessing game");
		
		

		do {
			System.out.println("Type '1' for Easy");
			System.out.println("Type '2' for Medium");
			System.out.println("Type '3' for Hard");
			
			level = input.nextInt();
		    
			numberGuessingGame(input, level);

		    System.out.println("Would you like to play again? (Y/N)");
		    replay = input.next();

		} while (replay.equalsIgnoreCase("Y"));

		System.out.println("Thank you for playing!");
		
		input.close();
	

	}

}
