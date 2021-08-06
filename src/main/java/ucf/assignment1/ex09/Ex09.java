package ucf.assignment1.ex09;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 */

import java.util.Scanner;

public class Ex09 {

    // declaring a constant to hold the conversion rate
    static final int conversionRate = 350;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = in.nextInt();
        System.out.print("Enter width: ");
        double width = in.nextInt();

        double area = length * width;

        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", Math.ceil(area/conversionRate), area);
    }
}
