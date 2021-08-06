package ucf.assignment1.ex23;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Edelis Molina
 */

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? (y/n): ");
        String buffer1 = scan.nextLine();

        if(buffer1.equalsIgnoreCase("y")){
            System.out.print("Are the battery terminals corroded? (y/n): ");
            String buffer2 = scan.nextLine();
            if(buffer2.equalsIgnoreCase("y")){
                System.out.println("Clean terminals and try starting again.");
            }
            else if(buffer2.equalsIgnoreCase("n")){
                System.out.println("Replace cables and try again.");
            }
        }
        else if(buffer1.equalsIgnoreCase("n")){
            System.out.print("Does the car make a slicking noise? (y/n)");
            String buffer3 = scan.nextLine();
            if(buffer3.equalsIgnoreCase("y")){
                System.out.println("Replace the battery.");
            }
            else if(buffer3.equalsIgnoreCase("n")){
                System.out.print("Does the car crank up but fail to start? (y/n)");
                String buffer4 = scan.nextLine();
                if(buffer4.equalsIgnoreCase("y")){
                    System.out.println("Check spark plug connections.");
                }
                else if (buffer4.equalsIgnoreCase("n")){
                    System.out.print("Does the engine start and then die? (y/n)");
                    String buffer5 = scan.nextLine();
                    if(buffer5.equalsIgnoreCase("y")){
                        System.out.print("Does you car have fuel injection? (y/n)");
                        String buffer6 = scan.nextLine();
                        if(buffer6.equalsIgnoreCase("y")){
                            System.out.println("Get it in for service.");
                        }
                        else if(buffer6.equalsIgnoreCase("n")){
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else if (buffer5.equalsIgnoreCase("n")){
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
