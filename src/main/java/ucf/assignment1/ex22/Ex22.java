package ucf.assignment1.ex22;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 *
Exercise 22 - Comparing Numbers
Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different.
If they’re not different, then exit the program. Otherwise, display the largest number of the three.

Example Output
Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint
Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.

Challenges
Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s already been entered.
Modify the program so that it asks for ten numbers instead of three.
Modify the program so that it asks for an unlimited number of numbers.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex22 {

    public static double getNumber(int n){
        Scanner input = new Scanner(System.in);

        double number;

        while(true){
            System.out.print("Enter number " + n + ": ");
            try{
                number = input.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("Invalid number. Try again!");
                input.next();
                continue;
            }
            break;
        }

        return number;
    }

    public static double max(double n1, double n2, double n3){
        double max;
        if(n1 > n2 && n1 > n3)
            return n1;
        else if(n2 > n1 && n2 > n3)
            return n2;
        else
            return n3;
    }

    public static void main(String[] args) {
/*        Scanner scan = new Scanner(System.in);*/

        double number1 = getNumber(1);
        double number2 = getNumber(2);
        double number3 = getNumber(3);

        if(number1 == number2 || number1 == number3 || number2 == number3){
            System.out.println("All 3 numbers must be different!");
            System.exit(0);
        }

        System.out.println("The largest number is " + max(number1, number2, number3));

    }
}
