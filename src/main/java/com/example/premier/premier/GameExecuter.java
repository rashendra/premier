package com.example.premier.premier;

import java.util.Scanner;

public class GameExecuter {

	public static Child executeGame(int n, int k) {
		ChildCircle childCircle = new ChildCircle(n);

		int indexOffset;
		// number of times which will execute n-1
		while (!childCircle.hasAWinner()) {
			indexOffset = getIndexOffset(k, childCircle);
			childCircle.removeChild(indexOffset);
		}
		return childCircle.getWinner();
	}

	public static int getIndexOffset(int k, ChildCircle childCircle) {
		int indexOffset;
		int numberOfChildren = childCircle.getNumberOfChildren();
		if (k >= numberOfChildren) {
			indexOffset = k - (numberOfChildren % k);
		} else {
			indexOffset = k % numberOfChildren;
		}
		return indexOffset;
	}

	public static void main(String[] args) {

		System.out.println("Enter the list of share prices below ( Cmd + d / Ctrl+ d to exit)");
		System.out.print("Enter value for K :");
		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNextLine()) {
				Integer k = Integer.parseInt(scanner.nextLine().trim());
				System.out.print("Enter number of children :");
				Integer n = Integer.parseInt(scanner.nextLine().trim());
				System.out.println("K and n " + k + " & " + n);
				Child winner = executeGame(n, k);
				System.out.println("Winner's : id " +
						winner.getId() + " and Name : " + winner.getName());
				System.out.println("Continue with a new value for K :");

			}

		}


	}


}
