package com.example.premier.model;

public interface Game {

	void removeChild(int numberOfShifts);

	int getCurrentElementId();

	Child getWinner();

	int getCurrentIndex();

	int getNumberOfChildren();

	boolean hasAWinner();

	void initializeChildren(Integer numberOfChildren);
}
