package com.company;

/*
Trang Hoang
CS111B - Assignment 3B
 */

import java.util.Scanner;

public class GuessingProgram {

    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final RandomNumberGuesser guesser = new RandomNumberGuesser(MIN, MAX);
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            playOneGame();
        } while (shouldPlayAgain());
        System.out.println("Good bye.");
    }


    /**
     * The playOneGame method initiates a guessing game.
     */

    public static void playOneGame() {
        char response;

        System.out.println("Think of a number between " + MIN + " and " + MAX);

        do {
            response = getUserResponseToGuess();

            if (response == 'h') {
                guesser.higher();
            } else if (response == 'l') {
                guesser.lower();
            }

        } while (!(response == 'c'));

        System.out.println("You picked " + guesser.getCurrentGuess() + "? Great pick.");
        guesser.reset();
    }


    /**
     * The shouldPlayAgain method returns true if the player wants to play again. Otherwise, returns false.
     * @return true if user wants to play again; if not, returns false.
     */

    public static boolean shouldPlayAgain() {
        char playAgain;

        do {
            System.out.print("Do you want to play again? (y/n): ");
            playAgain = Character.toLowerCase(input.nextLine().charAt(0));

            if (!(playAgain == 'y' || playAgain == 'n')) {
                System.out.println("Invalid input.");
            }
        } while (!(playAgain == 'y' || playAgain == 'n'));

        return (playAgain == 'y');
    }


    /**
     * The getUserResponseToGuess method returns whether the user's number is higher, lower or correct compared to
     * the guess.
     * @return char 'h' for higher, 'l' for lower, or 'c' for correct
     */

    public static char getUserResponseToGuess() {
        char response;

        do {
            System.out.print("Is the number " + guesser.getCurrentGuess() + "?\t(h/l/c): ");
            response = Character.toLowerCase(input.nextLine().charAt(0));

            if (!(response == 'h' || response == 'l' || response == 'c')) {
                System.out.println("Invalid input.");
            }
        } while (!(response == 'h' || response == 'l' || response == 'c'));

        return response;
    }
}


/*
Think of a number between 1 and 100
Is the number 75?	(h/l/c): l
Is the number 44?	(h/l/c): l
Is the number 42?	(h/l/c): l
Is the number 2?	(h/l/c): l
Is the number 1?	(h/l/c): l
Is the number 1?	(h/l/c): h
Is the number 1?	(h/l/c): c
You picked 1? Great pick.
Do you want to play again? (y/n): y
Think of a number between 1 and 100
Is the number 79?	(h/l/c): h
Is the number 85?	(h/l/c): h
Is the number 88?	(h/l/c): h
Is the number 97?	(h/l/c): h
Is the number 99?	(h/l/c): h
Is the number 100?	(h/l/c): h
Is the number 100?	(h/l/c): l
Is the number 100?	(h/l/c): c
You picked 100? Great pick.
Do you want to play again? (y/n): y
Think of a number between 1 and 100
Is the number 58?	(h/l/c): h
Is the number 92?	(h/l/c): l
Is the number 84?	(h/l/c): l
Is the number 83?	(h/l/c): l
Is the number 82?	(h/l/c): l
Is the number 74?	(h/l/c): h
Is the number 78?	(h/l/c): l
Is the number 76?	(h/l/c): h
Is the number 77?	(h/l/c): h
Is the number 77?	(h/l/c): l
Is the number 77?	(h/l/c): c
You picked 77? Great pick.
Do you want to play again? (y/n): y
Think of a number between 1 and 100
Is the number 70?	(h/l/c): l
Is the number 58?	(h/l/c): l
Is the number 5?	(h/l/c): h
Is the number 46?	(h/l/c): l
Is the number 43?	(h/l/c): l
Is the number 22?	(h/l/c): l
Is the number 6?	(h/l/c): h
Is the number 21?	(h/l/c): l
Is the number 14?	(h/l/c): l
Is the number 12?	(h/l/c): l
Is the number 9?	(h/l/c): h
Is the number 10?	(h/l/c): h
Is the number 11?	(h/l/c): c
You picked 11? Great pick.
Do you want to play again? (y/n): n
Good bye.

Process finished with exit code 0
 */
