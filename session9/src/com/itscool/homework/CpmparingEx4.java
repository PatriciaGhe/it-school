package com.itscool.homework;

import java.util.Scanner;

public class CpmparingEx4 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter first (YYYY-MM-DD): ");
        String date1 = scanner.nextLine();

        System.out.println("Enter the second time (YYYY-MM-DD): ");
        String date2 = scanner.nextLine();

        boolean datesEqual = areDatesEqual(date1, date2);
        System.out.println("Are dates equal? Result: " + datesEqual);
    }

    public static boolean areDatesEqual(String date1, String date2) {
        return date1.equals(date2);
    }
}
