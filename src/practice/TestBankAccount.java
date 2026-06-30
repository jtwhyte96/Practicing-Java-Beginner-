package practice;

public class TestBankAccount {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(1000);
		
		System.out.println(account.getBalance());
		
		account.deposit(500);
		System.out.println("Your new account balance is: " + account.getBalance());
		
		account.deposit(200);
		System.out.println("Your new account balance is: " + account.getBalance());
		
		account.withdraw(300);
		System.out.println("Your new account balance is: " + account.getBalance());
		
		BankAccount account2 = new BankAccount(0);
		
		System.out.println("Your new account balanceM is: " + account2.getBalance());
		
		
		

	}

}
