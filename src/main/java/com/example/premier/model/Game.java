package com.example.premier.model;

/**
 * Game interface
 */
public interface Game {

	/**
	 * @param numberOfShifts
	 */
	void removeChild(int numberOfShifts);

	/**
	 * @return the current id of the current child
	 */
	int getCurrentChildId();

	/**
	 * @return the winning child
	 */
	Child getWinner();

	/**
	 * @return the current index of the list of children
	 */
	int getCurrentIndex();

	/**
	 * @return number of Children of the Game
	 */
	int getNumberOfChildren();

	/**
	 * @return true if the game has a winner
	 */
	boolean hasAWinner();

	/**
	 * @param numberOfChildren
	 */
	void initializeChildren(Integer numberOfChildren);
}
