package com.company;

/*
Trang Hoang
CS111B - Assignment 3B
 */

public class NumberGuesser {
    private int low;
    private int high;
    private final int originalLow;
    private final int originalHigh;


    /**
     * Sets constructor to low and high bounds of number guesser.
     * @param lowerBound Number for lower bound
     * @param higherBound Number for higher bound
     */

    NumberGuesser(int lowerBound, int higherBound) {
        low = originalLow = lowerBound;
        high = originalHigh = higherBound;
    }


    /**
     * Resets number for higher bound based on guess (at midpoint of range).
     */

    public void higher() {
        if (getCurrentGuess() != 100) {
            low = getCurrentGuess() + 1;
        }
    }


    /**
     * Resets number for lower bound based on guess (at midpoint of range).
     */

    public void lower() {
        if (getCurrentGuess() != 1) {
            high = getCurrentGuess() - 1;
        }
    }


    /**
     * Calculates midpoint of the range of numbers, rounded down.
     * @return Midpoint, rounded down, between low and high bounds
     */

    public int getCurrentGuess() { return (low + high) / 2; }


    /**
     * Resets low and high bounds to original values of constructor.
     */

    public void reset() {
        low = originalLow;
        high = originalHigh;
    }
}


/*
Test of reset() with GuessingProgramWithRandom.java:

Average number of guesses: 5.8116

Process finished with exit code 0
 */
