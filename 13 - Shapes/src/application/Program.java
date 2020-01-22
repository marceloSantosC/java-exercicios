package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Colors;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter the number of shapes: ");
		int numberOfShapes = sc.nextInt();
		List<Shape> shapes = new ArrayList<>();
		for(int i = 1; i <= numberOfShapes; i++) {
			System.out.printf("Shape %d data: %n",i);
			System.out.print("Rectangle or circle (r/c)? ");
			char rOrC = sc.next().toLowerCase().charAt(0);
			System.out.print("Color(Black/Blue/Red): ");
			Colors color = Colors.valueOf(sc.next().toUpperCase());
			if(rOrC == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				shapes.add(new Circle(color, radius));
			} 
			else {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				shapes.add(new Rectangle(color,width, height));
			}
		}
		System.out.println();
		System.out.println("Shape areas:");
		for(Shape shape: shapes) {
			System.out.printf("Area: %.2f%n", shape.area());
		}
		sc.close();
	}

}
