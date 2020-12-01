package com.company;

/*
Trang Hoang
CS111B - Assignment 6A
 */

import java.util.Random;

public class RandomNumberGuesser extends NumberGuesser {
    private Random random = new Random();

    /**
     * Sets constructor to low and high bounds of number guesser and generateNewRandom to true.
     * @param lowerBound Number for lower bound
     * @param higherBound Number for higher bound
     */

    RandomNumberGuesser(int lowerBound, int higherBound) {
        super(lowerBound, higherBound);
    }


    /**
     * Generates random guess between lower and higher bounds.
     * @return integer between low and high bounds
     */

    public int getCurrentGuess() {
        if ((low != high) && generateNewRandom) {
            guess = low + random.nextInt(high - low + 1);
            generateNewRandom = false;
        } else if (generateNewRandom){
            guess = low;
            generateNewRandom = false;
        }

        return guess;
    }
}
