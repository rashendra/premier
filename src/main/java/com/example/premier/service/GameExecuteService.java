package com.example.premier.service;

import com.example.premier.model.Child;
import com.example.premier.model.Game;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GameExecuteService {

	private static Logger logger = LoggerFactory.getLogger(GameExecuteService.class);

	public static Child executeGame(int n, int k, Game game) {
		logger.info("Executing the game");
		game.initializeChildren(n);

		// number of times which will execute n-1
		while (!game.hasAWinner()) {
			game.removeChild(getIndexOffset(k, game));
		}
		return game.getWinner();
	}

	private static int getIndexOffset(int k, Game childCircle) {
		int numberOfChildren = childCircle.getNumberOfChildren();
		return (k >= numberOfChildren) ? (k - (numberOfChildren % k)) : (k % numberOfChildren);
	}

}
