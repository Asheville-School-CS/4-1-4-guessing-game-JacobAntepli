package com.example.project;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Put your guess here: ");
        int x = scan.nextInt();
        int random = (int) (1 + (Math.random()*100));


        while (x != random){
            if (x < random){
                System.out.println("too low");
                x = scan.nextInt();
            }
            if (x > random){
                System.out.println("too high");
                x = scan.nextInt();
            }
            if (x == random){
                System.out.println("Congrats you guessed the right number!!!");
                break;
            }

        }


        // Ask the user to guess a number from 0 to 100
        // Get the first guess using scan.nextInt();


        // Loop while the guess does not equal the random number,

        // If the guess is less than the random number, print out "Too low!"

        // If the guess is greater than the random number, print out "Too high!"

        // Get a new guess (save it into the same variable)

        // Print out "You got it!"


    }
}