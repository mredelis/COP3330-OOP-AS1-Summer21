package ucf.assignment1.ex15;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 */

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String password = "abc$123";

        System.out.print("What is the password? ");
        String userPass = in.nextLine();

        if(password.equals(userPass))
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you.");

    }
}
