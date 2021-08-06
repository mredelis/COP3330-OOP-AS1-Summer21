package ucf.assignment1.ex07;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 */

import java.util.Scanner;

public class Ex07 {

    // declaring the conversion factor as a constant
    static final double conversionFactor = 0.09290304;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        double length = in.nextDouble();

        System.out.print("What is the width of the room in feet? ");
        double width = in.nextDouble();

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");

        double areaImperial = length * width;
        double areaMetric = areaImperial * conversionFactor;

        System.out.printf("The area is\n%.3f square feet\n%.3f square meters\n", areaImperial, areaMetric);

    }
}
