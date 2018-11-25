package com.example.premier.service;

import com.example.premier.model.Child;
import com.example.premier.model.ChildCircle;
import com.example.premier.model.Game;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class PremierApplication {

	private static Logger logger = LoggerFactory.getLogger(PremierApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PremierApplication.class, args);
		System.out.println("Please set values for K and N( Cmd + d / Ctrl+ d to exit)");
		System.out.print("Enter value for K :");
		Game childCircle = new ChildCircle();
		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNextLine()) {
				Integer k = Integer.parseInt(scanner.nextLine().trim());
				System.out.print("Enter number of children (n) :");
				Integer n = Integer.parseInt(scanner.nextLine().trim());
				logger.info(" These are the values for K and N. K :"+k+" N :"+n);
				Child winner = GameExecuteService.executeGame(n, k,childCircle);
				System.out.println("Winner's : id " +winner.getId() + " and Name : " + winner.getName());
				System.out.println("Continue with a new value for K :");
			}

		} catch (Exception e) {
			logger.error("Error while running the application :"+e.getMessage()+". Program terminated !");
		}
	}
}
