package com.company;

/*
Trang Hoang
CS111B - Assignment 6A
 */

import java.util.Random;

public class RandomNumberGuesser extends NumberGuesser {

    /**
     * Sets constructor to low and high bounds of number guesser.
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
        Random random = new Random();

//        System.out.println("low: " + low);
//        System.out.println("high: " + high);

        if (low != high) {
            guess = low + random.nextInt(high - low + 1);
        } else {
            guess = low;
        }

//        System.out.println("guess: " + guess);
        return guess;
    }
}
