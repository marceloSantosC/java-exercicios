package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.printf("How many employees will be registered ?");
		int numberOfEmplyees = sc.nextInt();
		List<Employee> employees = new ArrayList<>();
		
		for(int i = 0; i < numberOfEmplyees; i++) {
			System.out.println();
			System.out.println("Employee #"+ (i+1));
			System.out.print("Id: ");
			sc.nextLine();
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Salary: ");
			Double salary = sc.nextDouble();
			employees.add(new Employee(id,name,salary));
		}
		System.out.println("Enter the employee id that will have salary increase: ");
		int idForIncrease = sc.nextInt();
		Employee employeToIncreaseSalary = employees.stream().filter(x -> x.getId() == idForIncrease).findFirst().orElse(null);
		if (employeToIncreaseSalary == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double quantity = sc.nextDouble();
			employeToIncreaseSalary.salaryIncrease(quantity);
		}
		for (Employee emp: employees) {
			System.out.println(emp);
		}
		sc.close();
	}

}
