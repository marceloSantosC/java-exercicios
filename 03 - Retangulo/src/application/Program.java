package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
	// Ler largura e altura de um triangulo. E mostrar sua área, perímetro e diagonal
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter the rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("Area: %.2f %n", rectangle.area());
		System.out.printf("Perimeter: %.2f %n", rectangle.perimeter());
		System.out.printf("Diagonal: %.2f %n", rectangle.diagonal());
		
		sc.close();		
	}

	

}
