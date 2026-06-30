package practice;

public class BankAccount {

	private double balance;
	
	public BankAccount(double balance) {
		if (balance < 0) {
			this.balance = 0;
		} else {
			this.balance = balance;
		}
	}
		
	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("Amount must be positive.");
		} else {
			balance = amount + balance;
		}
		
	}
	
	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient funds");
		} else if (amount < 0) {
			System.out.println("Amount must be positive.");
		} else {
			balance = balance - amount;
		}
		
	}
	
	public double getBalance() {
		return balance;
	 
	}
	
	public void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		}
		
	}

	

}
