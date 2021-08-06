package ucf.assignment1.ex14;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 */

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String subtotalStr = input.nextLine();
        double subtotal = Double.valueOf(subtotalStr);

        System.out.print("What is the state? ");
        String state = input.nextLine();

        double tax = 0;

        if (state.equalsIgnoreCase("WI"))
        {
            tax = 5.5/100;
            System.out.printf("The subtotal is $%.2f.\n", subtotal);
            System.out.printf("The tax is $%.2f\n", tax*subtotal);
        }

        System.out.printf("The total is $%.2f", subtotal + (subtotal*tax));

    }
}
