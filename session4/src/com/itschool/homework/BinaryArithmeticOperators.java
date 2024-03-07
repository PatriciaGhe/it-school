package com.itschool.homework;

import java.util.Scanner;

public class BinaryArithmeticOperators {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert first number: ");
        double  num1 = scanner.nextDouble();

        System.out.print("Insert second number: ");
        double num2 = scanner.nextDouble();

        double addition = num1 + num2;
        System.out.println("Suma este: " + addition);


        double subtraction = num1 - num2;
        System.out.println("Diferența este: " + subtraction);

        double multiplication = num1 * num2;
        System.out.println("Produsul este: " + multiplication);

        double division = num1 / num2;
        System.out.println("Câtul este: " + division);

        double modulu = num1 % num2;
        System.out.println("Restul este: " + modulu);

    }
}
