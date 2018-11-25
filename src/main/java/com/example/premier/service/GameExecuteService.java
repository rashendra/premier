package com.example.premier.service;

import com.example.premier.model.Child;
import com.example.premier.model.ChildCircle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GameExecuteService {

	private static Logger logger = LoggerFactory.getLogger(GameExecuteService.class);

	public static Child executeGame(int n, int k) {
		logger.info("Executing the game");
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
