package ucf.assignment1.ex10;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 */

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // input would be a string, hence convert to number
        System.out.print("Enter the price for item 1: ");
        String price1 = in.nextLine();
        double p1 = Double.valueOf(price1);
        System.out.print("Enter the quantity of item 1: ");
        String quantity1 = in.nextLine();
        int q1 = Integer.valueOf(quantity1);

        System.out.print("Enter the price for item 2: ");
        String price2 = in.nextLine();
        double p2 = Double.valueOf(price2);
        System.out.print("Enter the quantity of item 2: ");
        String quantity2 = in.nextLine();
        int q2 = Integer.valueOf(quantity2);

        System.out.print("Enter the price for item 3: ");
        String price3 = in.nextLine();
        double p3 = Double.valueOf(price3);
        System.out.print("Enter the quantity of item 3: ");
        String quantity3 = in.nextLine();
        int q3 = Integer.valueOf(quantity3);

        double subtotal = p1*q1 + p2*q2 + p3*q3;
        double taxes = 0.055*subtotal;
        double total = subtotal + taxes;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + taxes);
        System.out.println("Total: $" + total);

    }
}
