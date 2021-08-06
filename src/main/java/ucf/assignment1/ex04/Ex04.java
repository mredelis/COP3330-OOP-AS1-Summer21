package ucf.assignment1.ex04;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 */

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = in.nextLine();
        System.out.print("Enter a verb: ");
        String verb = in.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = in.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = in.nextLine();

        System.out.println("Do you " + verb + " your " + adjective +" "+ noun +" "+ adverb + "?. That's hilarious!");
    }
}
