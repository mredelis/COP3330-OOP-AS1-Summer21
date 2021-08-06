package ucf.assignment1.ex11;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 */

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        double euros = in.nextDouble();

        System.out.print("What is the exchange rate? ");
        double exchangeRate = in.nextDouble();

        System.out.printf("%.2f euros at an exchange rate of %f is\n%.2f U.S. dollars",
                          euros, exchangeRate, euros*exchangeRate);
    }
}
