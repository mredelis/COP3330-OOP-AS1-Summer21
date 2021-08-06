package ucf.assignment1.ex05;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 */

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String n1 = in.nextLine();

        System.out.print("What is the second number? ");
        String n2 = in.nextLine();

        int number1 = Integer.parseInt(n1);
        int number2 = Integer.parseInt(n2);

        System.out.print(number1 + " + " + number2 + " = " + (number1+number2) + "\n"
                       + number1 + " - " + number2 + " = " + (number1-number2) + "\n"
                       + number1 + " * " + number2 + " = " + (number1*number2) + "\n"
                       + number1 + " / " + number2 + " = " + (number1/number2) + "\n");
    }
}
