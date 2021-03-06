package com.example.premier.model;

import com.example.premier.model.Child;

import java.util.ArrayList;
import java.util.List;

public class ChildCircle implements  Game{

	private List<Child> children = new ArrayList<>();

	private int currentIndex = 0;

	public ChildCircle() {
	}

	public void initializeChildren(Integer numberOfChildren) {
		for (int i = 1; i <= numberOfChildren; i++) {
			this.children.add(new Child(i, "Name_" + i));
		}
	}

	public void removeChild(int numberOfShifts) {
		setIndexToRemove(numberOfShifts);
		this.children.remove(this.currentIndex);
		this.currentIndex = this.currentIndex + 1 > children.size() ? 0 : this.currentIndex;
	}

	private void setIndexToRemove(int numberOfShifts) {
		int indexToRemove = this.currentIndex + numberOfShifts;
		this.currentIndex = indexToRemove > getNumberOfChildren() ? (indexToRemove - 1) % getNumberOfChildren() : indexToRemove - 1;
	}

	public int getCurrentChildId() {
		return this.children.get(this.currentIndex).getId();
	}

	public Child getWinner() {
		return this.children.get(0);
	}

	public int getCurrentIndex() {
		return this.currentIndex;
	}

	public int getNumberOfChildren() {
		return this.children.size();
	}

	public boolean hasAWinner() {
		return this.children.size() == 1;
	}


}
