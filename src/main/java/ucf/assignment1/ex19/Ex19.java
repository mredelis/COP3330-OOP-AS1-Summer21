package ucf.assignment1.ex19;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 * /

Exercise 19 - BMI Calculator
You’ll often need to see if one value is within a certain range and alter the flow of a program as a result.
Create a program to calculate the body mass index (BMI) for a person using the person’s height in inches and weight in pounds.
The program should prompt the user for weight and height.

Calculate the BMI by using the following formula:
bmi = (weight / (height × height)) * 703

If the BMI is between 18.5 and 25, display that the person is at a normal weight.
If they are out of that range, tell them if they are underweight or overweight and tell them to consult their doctor.

Example Output

Your BMI is 19.5.
You are within the ideal weight range.

or

Your BMI is 32.5.
You are overweight. You should see your doctor.

Constraint
Ensure your program takes only numeric data. Don’t let the user continue unless the data is valid.

Challenges
Make the user interface accept height and weight in Imperial or metric units. You’ll need a slightly different formula for metric units.
For Imperial measurements, prompt for feet and inches and convert feet to inches so the user doesn’t have to.
Use a GUI interface with sliders for height and weight. Update the user interface on the fly. Use colors as well as text to indicate health.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int weight = 0;
        float height = 0;

        //continue until force to break
        while(true){
            System.out.print("Enter weight (in pounds): ");
            try {
                weight = input.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input. Try again!");
                input.next();
                continue;
            }
            // System.out.println(weight);
            break;
        }

        while(true){
            System.out.print("Enter height (in inches): ");
            try {
                height = input.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input. Try again!");
                input.next();
                continue;
            }
            // System.out.println(weight);
            break;
        }

        // the values of height and weight here are correct
        float bmi = ((float) weight / (height * height)) * 703;
        System.out.println("Your BMI is "+ bmi);

        if(bmi < 18.5)
            System.out.println("You are underweight. You should see your doctor.");
        else if (bmi > 25)
            System.out.println("You are overweight. You should see your doctor.");
        else
            System.out.println("You are within the ideal weight range.");
    }
}
