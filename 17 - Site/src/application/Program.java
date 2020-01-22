package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import entities.Log;

public class Program {
	public static void main(String[] args) throws ParseException {
		/**
					Problema exemplo
		Um site de internet registra um log de acessos dos usu�rios. Um
		registro de log consiste no nome de usu�rio (apenas uma palavra) e o
		instante em que o usu�rio acessou o site no padr�o ISO 8601,
		separados por espa�o, conforme exemplo. Fazer um programa que leia
		o log de acessos a partir de um arquivo, e da� informe quantos usu�rios
		distintos acessaram o site. 
		**/
		

		Set<Log> set = new HashSet<>();
		try (BufferedReader br = new BufferedReader(new FileReader ("c:\\Temp\\siteUsers.txt"))){
			String line = br.readLine();
			System.out.println(line);
			while(line != null) {
				String[] split = line.split(" ");
				String name = split[0];
				Date acessTime = Log.dateFormat.parse(split[1]);
				set.add(new Log(name, acessTime));
				line = br.readLine();
			}
			System.out.println(set.size());
		}
		catch(IOException error) {
			System.out.println("Error:" + error.getMessage());
		}

	}
}
