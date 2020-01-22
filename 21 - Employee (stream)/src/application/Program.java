package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {
	/**
	 * Fazer um programa para ler os dados (nome, email e salário) de funcionários a
	 * partir de um arquivo em formato .csv. Em seguida mostrar, em ordem
	 * alfabética, o email dos funcionários cujo salário seja superior a um dado
	 * valor fornecido pelo usuário. Mostrar também a soma dos salários dos
	 * funcionários cujo nome começa com a letra 'M'.
	 **/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Enter the file path: ");
		String path = input.nextLine(); // C:\\Temp\funcionarios.csv
		List<Employee> employees = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] date = line.split(",");

				employees.add(new Employee(date[0], date[1], Double.parseDouble(date[2])));
				line = br.readLine();
			}
		} catch (IOException error) {
			System.out.println(error.getMessage());
		}

		System.out.print("Salary: ");

		int filter = input.nextInt();
		List<String> filteredNames = employees.stream().filter(p -> p.getSalary() > filter).map(p -> p.getEmail())
				.sorted().collect(Collectors.toList());

		double sum = employees.parallelStream().filter(p -> p.getName().toUpperCase().charAt(0) == 'M')
				.map(p -> p.getSalary()).reduce(0.0, (x, y) -> x + y);

		System.out.println("Email of people whose salary is more than 2000.00: ");
		filteredNames.forEach(System.out::println);
		System.out.println("Sum of salary of people whose name starts with 'M': " + sum);

		input.close();
	}
}
