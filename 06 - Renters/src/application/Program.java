package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Renter;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented?");
		int rentedRooms = sc.nextInt();
		
		Renter[] renters = new Renter[10];
		for(int i = 0; i < rentedRooms; i++) {
			System.out.println("Rent #" + (i + 1));
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("E-mail: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			renters[room] = new Renter(name, email, room);
		}
		System.out.printf("Busy rooms: %n");
		for(int i = 0; i < renters.length; i++) {
			if (renters[i] != null) {
				System.out.printf("%d: %s, %s %n",renters[i].getRoom(), renters[i].getName(),renters[i].getEmail());
			}

		}
		sc.close();
	}

}
