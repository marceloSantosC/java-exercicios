package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		/** Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
		sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
		o instante do sistema: new Date() **/
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter the client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Birth date (dd/mm/yyyy): ");
		String date = sc.next();
		Client client01 = new Client(name, email,dateFormat.parse(date));
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.next();
		Date momment = new Date();;
		Order order = new Order(momment, OrderStatus.valueOf(status.toUpperCase()),client01);
		
		System.out.print("How many items to this order?");
		int numberOfItems = sc.nextInt();
		for(int i = 1; i <= numberOfItems; i++) {
			System.out.printf("Enter the product #%d data %n", i);
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			Product product = new Product(productName, price);
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(quantity, price, product);
			order.addItem(orderItem);
		}
		System.out.println(order);
		sc.close();
	}

}
