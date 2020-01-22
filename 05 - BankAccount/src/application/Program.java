package application;

import java.util.Locale;

import java.util.Scanner;

import entities.BankAccount;

public class Program {
	// Criar uma classe de uma conta de banco com operações de banco e um atributo para taxa

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		BankAccount bankAccount;
		
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holderName = sc.nextLine();
		
		
		System.out.println("Is there an initial deposit? (y/n)");
		char initialDepositAnswer = sc.nextLine().charAt(0);
		
		if(initialDepositAnswer == 'y') {
			System.out.println("Enter the initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bankAccount = new BankAccount(accountNumber, holderName, initialDeposit);
		} 
		else {
			bankAccount = new BankAccount(accountNumber, holderName);
		}
		
		System.out.println(bankAccount.toString());
		
		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		bankAccount.deposit(deposit);
		System.out.println(bankAccount.toString());
		
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		bankAccount.withdraw(withdraw);
		System.out.println(bankAccount.toString());
		
		sc.close();
	}

}
