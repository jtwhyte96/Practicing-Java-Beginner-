package practice;
import java.util.Scanner;

public class ATMSimulator {
	
	static double balance = 100000;
	
	public static double checkBalance() {
		return balance;
	}
	
	public static void deposit(Scanner input) {
		System.out.println("How much do you want to deposit?");
		double deposit = input.nextDouble();
		if (deposit <= 0) {
		    System.out.println("Deposit amount must be positive.");
		    return;
		} else {
			balance += deposit;
			System.out.println("Your new account balance is $" + balance);
		}
		
	}
	
	public static void withdraw(Scanner  input) {
		
		System.out.println("How much do you want to withdraw?");
		double amount = input.nextDouble();
		
		if (amount <= 0) {
		    System.out.println("Withdrawal amount must be positive.");
		    return;
		}
		else if (amount <= balance) {
			balance -= amount;
			System.out.println("Your new account balance is $" + balance);
		} else {
			System.out.println("Insufficient funds!");
		}
		
	}
	
	public static void main(String[] args) {
		
		
		
		int choose;
		Scanner input = new Scanner(System.in);	
		
		
		do {
			System.out.println("Welcome to the ATM");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			choose = input.nextInt();
			if (choose == 1) {
				System.out.println("Your account balance is $" + checkBalance());
			} else if (choose == 2 ) {
				deposit(input);
			} else if (choose == 3) {
				withdraw(input);
			} else if (choose > 4){
				System.out.println("Invalid option!!");
			}
			
		} while (choose != 4);
		System.out.println("Thank you for using the ATM");
		
		input.close();
	}

}
