package com.itschool.homework.slide4;

import java.util.Scanner;

public class ContinueStatement12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Insert 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Insert number " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (number <= 5) {
                System.out.println("Keep calculating!");
                continue;
            }
            sum += number;
        }

        System.out.println("The sum of all numbers greater than 5 is: " + sum);
    }
}
