package com.example.premier.service;

import com.example.premier.model.Child;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PremierApplication {

	public static void main(String[] args) {
		SpringApplication.run(PremierApplication.class, args);
		System.out.println("Enter the list of share prices below ( Cmd + d / Ctrl+ d to exit)");
		System.out.print("Enter value for K :");
		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNextLine()) {
				Integer k = Integer.parseInt(scanner.nextLine().trim());
				System.out.print("Enter number of children (n) :");
				Integer n = Integer.parseInt(scanner.nextLine().trim());
				Child winner = GameExecuterService.executeGame(n, k);
				System.out.println("Winner's : id " +winner.getId() + " and Name : " + winner.getName());
				System.out.println("Continue with a new value for K :");
			}

		}
	}
}
