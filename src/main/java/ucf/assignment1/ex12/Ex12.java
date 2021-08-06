package ucf.assignment1.ex12;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 */

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double interestRate = input.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        double interestRateFraction = interestRate / 100;
        double A = principal * (1 + interestRateFraction*years);

        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f", years, interestRate, A);

    }
}
