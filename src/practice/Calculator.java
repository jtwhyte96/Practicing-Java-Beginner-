package practice;
import java.util.Scanner;

public class Calculator {
	
	public static void calc(Scanner input) {
		
		double number1;
		double number2;
		String operation;
		double result = 0;
		
		System.out.println("Enter your first number");
		number1 = input.nextDouble();
		
		System.out.println("Enter your second number");
		number2 = input.nextDouble();
		
		System.out.println("Type in one of these operators: *, +, -, /, ^");
		
		operation = input.next();
		
		switch (operation) {
		case "*":
			result = number1 * number2;
			break;
		case "+":
			result = number1 + number2;
			break;
		case "-":
			result = number1 - number2;
			break;
		case "/":
			if (number2 == 0) {
				System.out.println("Cannot divide by zero");
				return;
			} else {
				result = number1 / number2;
			}
			break;
		case "^":
			result = Math.pow(number1, number2);
			break;
		default:
			System.out.println("Type in a valid operator");
		}
		
		System.out.println("Your first number was " + number1);
		System.out.println("Your second number was " + number2);
		System.out.println("Your operator was " + operation);
		
		System.out.println("The result is " + result);
		
		

	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String replay;
		
		do {
			calc(input);
			System.out.println("Would you like another calculation? (Y/N)");
			replay = input.next();
			
		} while(replay.equalsIgnoreCase("y"));
		
		input.close();
	}
	
}