package ucf.assignment1.ex08;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 */

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = input.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizzas = input.nextInt();
        System.out.print("How many slices per pizza? ");
        int slices = input.nextInt();

        int wholeNumber = (pizzas * slices) / people;
        int leftOver = (pizzas * slices) % people;

        System.out.printf(people + " people with " + pizzas + " pizzas (%s slices)\n", pizzas * slices);
        System.out.printf("Each person gets %d pieces of pizza.\n", wholeNumber);
        System.out.printf("There are %d leftover pieces.\n", leftOver);
    }
}
