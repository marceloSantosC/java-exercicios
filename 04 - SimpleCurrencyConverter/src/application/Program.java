package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
	public static void main(String[] args) {
		// Ler a cotação dolar e depois um valor de uma compra em reais. Informar quantos reais serão gastos pelo preço do dolar e IOF
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("What is the dollar price ?");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double dollars = sc.nextDouble();
		double amountInReais = CurrencyConverter.Converter(dollars, dollarPrice);
		System.out.printf("Amount to be paid in reais: %.2f", amountInReais);

		
		sc.close();
	}
}
