package ucf.assignment1.ex13;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 */

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        double principal = input.nextDouble();

        System.out.print("What is the rate? ");
        double interestRate = input.nextDouble();

        System.out.print("What is the number of years? ");
        int years = input.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = input.nextInt();

        double interestRateFraction = interestRate / 100;
        double A = principal * Math.pow((1 + interestRateFraction / n), n*years);


        System.out.printf("$%.2f invested at %.2f%% for %d years compounded %d times per year is $%.2f",
                          principal, interestRate, years, n, A);
    }
}
