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


	}


}
