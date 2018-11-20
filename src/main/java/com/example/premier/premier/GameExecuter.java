package com.example.premier.premier;

public class GameExecuter {

    public static Integer executeGame(int numberOfChildren, int k) {
        ChildCircle childCircle = new ChildCircle(numberOfChildren);
        int index = 1;
        while (!childCircle.hasAWinner()) {
            index = manageCurrentIndex(k, childCircle, index);
        }
        return childCircle.getWinner();
    }

    private static int manageCurrentIndex(Integer k, ChildCircle childCircle, int index) {
        if (index == k) {
            childCircle.removeCurrent();
            index = 1;
        } else {
            childCircle.moveNext();
            index++;
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println("This is the winner: " + executeGame(4, 5));
    }


}
