package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Course;
import entities.Instructor;
import entities.User;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Course A = new Course("Programação", new Instructor("Alex"));
		Course B = new Course("Enfermagem", new Instructor("Alex"));
		Course C = new Course("Biologia", new Instructor("Alex"));
		
		System.out.println("How many students for this course A?");
		int numberOfStudents = input.nextInt();
		for(int i = 1; i <= numberOfStudents; i++) {
			System.out.println("Student number " + i + " code: ");
			int code = input.nextInt();
			A.setStudent(new User(code));
		}
		
		System.out.println("How many students for this course B?");
		numberOfStudents = input.nextInt();
		for(int i = 1; i <= numberOfStudents; i++) {
			System.out.println("Student number " + i + " code: ");
			int code = input.nextInt();
			B.setStudent(new User(code));
		}
		
		System.out.println("How many students for this course C?");
		numberOfStudents = input.nextInt();
		for(int i = 1; i <= numberOfStudents; i++) {
			System.out.println("Student number " + i + " code: ");
			int code = input.nextInt();
			C.setStudent(new User(code));
		}
		
		
		Set <User> totalStudents = new HashSet<>( A.getStudent());
		totalStudents.addAll(B.getStudent());
		totalStudents.addAll(C.getStudent());
		
		System.out.println("Number of students: " + totalStudents.size());
		
		input.close();
	}

}
