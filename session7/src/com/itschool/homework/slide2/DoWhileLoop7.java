package com.itschool.homework.slide2;

import java.util.Scanner;

public class DoWhileLoop7 {

    public static void main(String[] args) {

        int number = 24;

        Scanner scanner = new Scanner(System.in);
        int guess;

        do {
            System.out.println("Guess the number: ");
            guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("Congratulations! You guessed the right number.");

            } else if (guess < number) {
                System.out.println("The number is too small. Try again.");
            } else {
                System.out.println("The number is too high. Try again.");
            }
        } while (guess != number);
    }
}
