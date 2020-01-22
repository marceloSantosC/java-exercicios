
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		/***
		 * Fazer um programa para ler um conjunto de produtos a partir de um arquivo em
		 * formato .csv (suponha que exista pelo menos um produto). Em seguida mostrar o
		 * preço médio dos produtos. Depois, mostrar os nomes, em ordem decrescente, dos
		 * produtos que possuem preço inferior ao preço médio.
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter full file path: ");
		String path = input.nextLine(); // C:\\Temp\products.csv
		List<Product> products = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] data = line.split(",");
				products.add(new Product(Double.parseDouble(data[1]), data[0]));
				line = br.readLine();
			}
		} catch (IOException error) {
			System.out.println(error.getMessage());
		}

		Comparator<String> comparator = (string1, string2) -> string1.toUpperCase().compareTo(string2.toUpperCase());
		Double avg = products.stream()
				.map(p -> p.getPrice())
				.reduce(0.0, (x, y) -> x + y) / products.size();
		
		System.out.printf("Average price: %.2f %n", avg);
		
		List<String> productsName = products.stream()
				.filter(x -> x.getPrice() < avg)
				.map(p -> p.getName())
				.sorted(comparator.reversed()).collect(Collectors.toList());
		productsName.forEach(System.out::println);
		input.close();
	}

}
