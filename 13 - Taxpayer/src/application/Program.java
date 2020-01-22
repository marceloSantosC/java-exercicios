package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Person;
import entities.Taxpayer;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter the number of tax payers: ");
		int numberOfTaxPayers = sc.nextInt();
		List<Taxpayer> taxpayers = new ArrayList<>();
		
		for(int i = 1; i <= numberOfTaxPayers; i++) {
			System.out.printf("Enter the tax payer %d data: ",i);
			System.out.print("Person or Company(p/c): ");
			char personalOrCompany = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			if(personalOrCompany == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				taxpayers.add(new Company (name,annualIncome,numberOfEmployees));
			}
			else {
				System.out.print("Health expenditures: ");
				double healthSpending = sc.nextDouble();
				taxpayers.add(new Person(name,annualIncome,healthSpending));
			}
		}
		System.out.println();
		System.out.println("Taxes paid: ");
		double totalTax = 0.0;
		for(Taxpayer taxpayer: taxpayers) {
			System.out.println(taxpayer);
			totalTax += taxpayer.tax();
		}
		System.out.printf("Total tax: $%.2f",totalTax);
		sc.close();
	}

}
