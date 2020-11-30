package com.company;

/*
Trang Hoang
CS111B - Assignments 3B & 6A
 */

public class NumberGuesser {
    protected int low;
    protected int high;
    protected int guess;
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
     * Resets number for higher bound based on guess.
     */

    public void higher() {
        if ((guess != originalHigh) && (guess != high)) {
            low = guess + 1;
        }
    }


    /**
     * Resets number for lower bound based on guess.
     */

    public void lower() {
        if ((guess != originalLow) && (guess != low)) {
            high = guess - 1;
        }
    }


    /**
     * Calculates midpoint of the range of numbers, rounded down.
     * @return Midpoint, rounded down, between low and high bounds
     */

    public int getCurrentGuess() {
        guess = (low + high) / 2;
        return guess;
    }


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
