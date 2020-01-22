package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.Paypal;

public class Program {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		int number = input.nextInt();
		System.out.print("Date: ");
		Date date = dateFormat.parse(input.next());
		System.out.print("Contract Value: ");
		double value = input.nextDouble();
		System.out.print("Enter the number of installments: ");
		int installmentsNumber = input.nextInt();
		
		Contract contract = new Contract(number, date,value);
		
		ContractService contractService = new ContractService(new Paypal());
		
		contractService.processContract(contract, installmentsNumber);
		
		System.out.println("Installments:");
		for (Installment x : contract.getInstallments()) {
			System.out.println(x);
		}
		
		input.close();
		
		
		
	}
}
