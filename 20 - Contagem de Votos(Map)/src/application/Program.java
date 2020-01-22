package application;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Path: ");
		String path = input.nextLine();
		Map <String, Integer> votes = new HashMap<>();

		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] values = line.split(",");
				String name = values[0];
				Integer votesInThisLine = Integer.parseInt(values[1]);
				
				if(votes.containsKey(name)) {
					int votesForThisPerson = votes.get(name);
					votes.put(name, votesInThisLine + votesForThisPerson);
				}
				else {
					votes.put(name, votesInThisLine);
				}
				line = br.readLine();
			}
			for(String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
		}
		catch(IOException error) {
			System.out.println("Error: " + error.getMessage());
		}
	
		input.close();
	}
}
