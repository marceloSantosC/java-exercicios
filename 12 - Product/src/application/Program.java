package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int numberOfProducts = sc.nextInt();
		sc.nextLine();
		boolean isProductTypeValid = false;		
		
		List <Product > products = new ArrayList<>();
		
		for(int i = 1; i <= numberOfProducts; i++) {
			System.out.printf("Enter the product #%d data%n", i);
			System.out.print("Commom, used or imported(c/u/i)? ");
			char productType = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: $");
			double price = sc.nextDouble();
			String  manufactureDateEnter;
			double customFee;
			do {
				if(productType == 'c') {
					isProductTypeValid = true;
					products.add(new Product(name, price));
				} 
				else if (productType == 'u') {
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					manufactureDateEnter = sc.next();
					Date manufactureDate = dateFormat.parse(manufactureDateEnter);
					
					products.add(new UsedProduct(name, price, manufactureDate));
					isProductTypeValid = true;
				}
				else if(productType == 'i'){
					System.out.print("Custom fee: $");
					customFee = sc.nextDouble();
					products.add(new ImportedProduct(name,price,customFee));
					isProductTypeValid = true;
				} 
				else {
					System.out.println("Invalid value!");
					System.out.print("Commom, used or imported(c/u/i)? ");
					productType = sc.next().toLowerCase().charAt(0);
				}
			} while(isProductTypeValid == false);
		}
		for(Product product: products) {
			System.out.println(product.pricetag());
		}
		sc.close();
	}

}
