package com.example.premier.service;


import com.example.premier.model.Child;

public class GameExecuteService {

	public static Child executeGame(int n, int k) {
		ChildCircle childCircle = new ChildCircle(n);

		// number of times which will execute n-1
		while (!childCircle.hasAWinner()) {
			childCircle.removeChild(getIndexOffset(k, childCircle));
		}
		return childCircle.getWinner();
	}

	private static int getIndexOffset(int k, ChildCircle childCircle) {
		int numberOfChildren = childCircle.getNumberOfChildren();
		return (k >= numberOfChildren) ? (k - (numberOfChildren % k)) : (k % numberOfChildren);
	}

}
