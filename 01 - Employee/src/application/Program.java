package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.println("Enter the employee data: ");
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		System.out.println("Which percentage to increase salary?");
		double percentageToIncreaseSalary = sc.nextDouble();
		employee.IncreaseSalary(percentageToIncreaseSalary);
		
		System.out.println("Updated data: " + employee);
		
		sc.close();
	}

}
