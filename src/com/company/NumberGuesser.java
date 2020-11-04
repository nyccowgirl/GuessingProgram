package com.company;

/*
Trang Hoang
CS111B - Assignment 3B
 */

public class NumberGuesser {
    private int low;
    private int high;
    private int originalLow;
    private int originalHigh;

    NumberGuesser(int lowerBound, int higherBound) {
        low = originalLow = lowerBound;
//        originalLow = lowerBound;
        high = originalHigh = higherBound;
//        originalHigh = higherBound;
    }

    public void higher() {
        low = getCurrentGuess() + 1;
    }

    public void lower() {
        high = getCurrentGuess() - 1;
    }

    public int getCurrentGuess() {
        return (low + high) / 2;
    }

    public void reset() {
        low = originalLow;
        high = originalHigh;
    }
}
