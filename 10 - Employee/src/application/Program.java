package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsorcedEmployee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employee> employees = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++) {
			System.out.printf("Employee %d data: %n",i);
			System.out.print("Outsorced (y/n): ");
			char isOutSorced = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(isOutSorced == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				employees.add(new OutsorcedEmployee(name,hours,valuePerHour,additionalCharge));
			} else {
				employees.add(new Employee(name,hours,valuePerHour));
			}
		}
		System.out.println();
		System.out.println("Payments");
		for(Employee emps: employees) {
			System.out.println(emps);
		}
		sc.close();
	}
}
