package entities;

public class BankAccount {
	private int accountNumber;
	private String holderName;
	private double balance;
	private final double tax = 5;
	
	public BankAccount(int accountNumber, String holderName, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		deposit(initialDeposit);
	}

	public BankAccount(int accountNumber, String holderName) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
	}
	
	public BankAccount(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	
	public String getHolderName() {
		return holderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double quantity) {
		this.balance += quantity;
	}
	
	public void withdraw(double quantity) {
		this.balance -= quantity + tax;
	}
	
	public String toString() {
		return String.format("Account data:%n") + "Account number: " + accountNumber + ", Holder: " + holderName + String.format(", Balance: U$ %.2f", balance);
	}
	
}
