package com.example.premier.service;

import com.example.premier.model.Child;

import java.util.ArrayList;
import java.util.List;

public class ChildCircle {

	private List<Child> children = new ArrayList<>();

	private int currentIndex = 0;

	public ChildCircle(Integer numberOfChildren) {
		for (int i = 1; i <= numberOfChildren; i++) {
			children.add(new Child(i, "Name_" + i));
		}
	}

	public void removeChild(int numberOfShifts) {
		setIndexToRemove(numberOfShifts);
		this.children.remove(this.currentIndex);
		this.currentIndex = this.currentIndex + 1 > children.size() ? 0 : this.currentIndex;
	}

	public void setIndexToRemove(int numberOfShifts) {
		int indexToRemove = this.currentIndex + numberOfShifts;
		this.currentIndex = indexToRemove > getNumberOfChildren() ? (indexToRemove - 1) % getNumberOfChildren() : indexToRemove - 1;
	}

	public int getCurrentElementId() {
		return this.children.get(this.currentIndex).getId();
	}

	public Child getWinner() {
		return this.children.get(0);
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	public int getNumberOfChildren() {
		return children.size();
	}

	public List<Child> getChildren() {
		return children;
	}

	public boolean hasAWinner() {
		return this.children.size() == 1;
	}


}
