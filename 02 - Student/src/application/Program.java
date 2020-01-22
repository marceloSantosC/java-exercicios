package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	public static void main(final String[] args) {
		Locale.setDefault(Locale.US);
		final Scanner sc = new Scanner(System.in);

		final Student student = new Student();
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.print("First trimester grade: ");
		student.firstTrimester = sc.nextDouble();
		System.out.print("Second trimester grade: ");
		student.secondTrimester = sc.nextDouble();
		System.out.print("Third trimester grade: ");
		student.thirdTrimester = sc.nextDouble();

		System.out.println("Final grade: " + student.finalGrade());
		System.out.println(student.finalResult());
		sc.close();
	}
}
