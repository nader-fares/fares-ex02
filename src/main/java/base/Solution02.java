/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

//Create a program that
//prompts for an input string and
// displays output that shows
// the input string and the number of characters the string contains.

package base;

import java.util.Scanner;

public class Solution02 {
    /*
        program start
        print "What is the input string?" and store into variable 'inputString'
        using built in .length() function to find number of characters
        print "'userString' has 'userString.length() characters"
     */
    public static void main(String[] args)
    {
        //prompt user to input string
        System.out.print("What is the input String? ");

        //store user input as variable 'inputString'
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();

        //display results using built in .length() function to calculate string length
        System.out.print(inputString + " has " + inputString.length() + " characters.\n");
    }
}
