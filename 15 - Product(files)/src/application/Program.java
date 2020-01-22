package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<OrderItem> orderItems = new ArrayList<>();
		
		System.out.print("CSV file path: ");
		String strPath = input.nextLine();
		File path = new File(strPath);
		String folderPath = path.getParent();
		new File(folderPath + "\\out").mkdir();

		try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
		
			String line = br.readLine();
			while(line != null) {
				String data[] = line.split(",");
				String name = data[0];
				double price = Double.parseDouble(data[1]);
				int quantity = Integer.parseInt(data[2]);
				
				Product product = new Product(name, price);
				OrderItem orderItem = new OrderItem(product, quantity);
				orderItems.add(orderItem);
				line = br.readLine();
				}

			try(BufferedWriter bw = new BufferedWriter(new FileWriter(folderPath + "\\out\\Summary.csv"))){
				for(OrderItem orderItem: orderItems) {
					bw.write(orderItem.toString());
					bw.newLine();
				}
			}
			catch(IOException error) {
				System.out.println(error.getMessage());
			}
				
		}
		catch(IOException error){
			System.out.println(error.getMessage());
		}
		
		input.close();
	}

}
