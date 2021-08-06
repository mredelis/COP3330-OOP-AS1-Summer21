package ucf.assignment1.ex16;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 */

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int legalAge = 16;

        Scanner in = new Scanner(System.in);

        System.out.print("What is your age? ");
        int userAge = in.nextInt();

        String output = (userAge >= legalAge ? "You are old enough to legally drive."
                                             : "You are not old enough to legally drive" );

        System.out.println(output);
    }
}
