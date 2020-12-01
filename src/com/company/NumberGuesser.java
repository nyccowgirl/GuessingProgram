package com.company;

/*
Trang Hoang
CS111B - Assignments 3B & 6A
 */

public class NumberGuesser {
    protected int low;
    protected int high;
    protected int guess;
    protected boolean generateNewRandom;
    private final int originalLow;
    private final int originalHigh;


    /**
     * Sets constructor to low and high bounds of number guesser and generateNewRandom to true.
     * @param lowerBound Number for lower bound
     * @param higherBound Number for higher bound
     */

    NumberGuesser(int lowerBound, int higherBound) {
        low = originalLow = lowerBound;
        high = originalHigh = higherBound;
        generateNewRandom = true;
    }


    /**
     * Resets number for lower bound based on guess if number is higher than guess, subject to original bounds
     * and modified bounds based on guess.
     */

    public void higher() {
        if ((guess != originalHigh) && (guess != high)) {
            low = guess + 1;
            generateNewRandom = true;
        }
    }


    /**
     * Resets number for higher bound based on guess if number is lower than guess, subject to original bounds
     * and modified bounds based on guess.
     */

    public void lower() {
        if ((guess != originalLow) && (guess != low)) {
            high = guess - 1;
            generateNewRandom = true;
        }
    }


    /**
     * Calculates midpoint of the range of numbers, rounded down if generateNewRandom is true.
     * @return Midpoint, rounded down, between low and high bounds
     */

    public int getCurrentGuess() {
        if (generateNewRandom) {
            guess = (low + high) / 2;
            generateNewRandom = false;
        }

        return guess;
    }


    /**
     * Resets low and high bounds, as well as generateNewRandom, to original values of constructor.
     */

    public void reset() {
        low = originalLow;
        high = originalHigh;
        generateNewRandom = true;
    }
}



