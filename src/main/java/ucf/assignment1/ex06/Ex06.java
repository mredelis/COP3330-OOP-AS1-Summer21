package ucf.assignment1.ex06;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 */

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LocalDate d = LocalDate.now();
        int currentYear = d.getYear();

        System.out.print("what is your current age? ");
        int currentAge = input.nextInt();

        System.out.print("At what age would you like to retire? ");
        int retirementAge = input.nextInt();

        System.out.println("You have " + (retirementAge - currentAge) + " years left until you can retire.");
        System.out.println("It's " + currentYear + ", so you can retire in "
                           +(currentYear + (retirementAge - currentAge)) );

    }
}
