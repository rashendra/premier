package com.example.premier.premier;

import java.util.ArrayList;
import java.util.List;

public class ChildCircle {

    private List<Integer> children = new ArrayList<>();

    private int currentIndex = 0;
    private int numberOfChildren;

    public ChildCircle(Integer numberOfChildren) {
        for (int i = 1; i <= numberOfChildren; i++) {
            children.add(new Integer(i));
        }
    }

    public void removeCurrent() {
        this.children.remove(this.currentIndex);
        this.currentIndex = this.currentIndex + 1 > children.size() ? 0 : this.currentIndex;
    }

    public void moveNext() {
        if (this.currentIndex + 1 < children.size()) {
            this.currentIndex++;
        } else {
            this.currentIndex = 0;
        }
    }

    public int getCurrentElement() {
        return this.children.get(this.currentIndex);
    }

    public Integer getWinner() {
        return this.children.get(0);
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public List<Integer> getChildren() {
        return children;
    }

    public boolean hasAWinner() {
        return this.children.size() == 1;
    }


}
