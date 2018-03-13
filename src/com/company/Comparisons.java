package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Comparisons {

    public static void main(String[] args) {

        //Create scanner object to scan in the user input
        Scanner scan = new Scanner(System.in);

        //Create Comparable objects to hold user input
        Comparable input1, input2, input3;

        //Prompt the user for the strings and read them into the appropriate variable
        System.out.print("Please input the first string: ");
        input1 = scan.next();
        System.out.print("Please input the second string: ");
        input2 = scan.next();
        System.out.print("Please input the third string: ");
        input3 = scan.next();

        //Create new Compare3 object to use for the first set of input.
        Compare3 comp;

        //Initalize using the constructor accepting 3 arguments of Comparable type.
        comp = new Compare3(input1, input2, input3);

        //Call the method 'largest' to compare the three inputs and find the largest of the three using the compareTo methods of the Comparable class.
        comp.largest();

        //Print the output to the user.
        System.out.println("----------------------------------------------");
        System.out.println("The largest string is: " + comp.getLargest());
        System.out.println("");

        System.out.println("----------------------------------------------");
        System.out.println("Now for the integers....");
        System.out.println("");

        //Prompt the user for inputs of integer type. We will reuse the place holder of input1, input2, and input3...
        System.out.print("Please input the first integer: ");
        input1 = scan.nextInt();
        System.out.print("Please input the second integer: ");
        input2 = scan.nextInt();
        System.out.print("Please input the third integer: ");
        input3 = scan.nextInt();

        //Create and initialize new Compare3 object with the new inputs.
        Compare3 compInt = new Compare3(input1, input2, input3);

        //Call the largest method and calculate the largest input of the three.
        compInt.largest();

        //Print out put to use using the method 'getLargest' inline, return type is Comparable.
        System.out.println("----------------------------------------------");
        System.out.println("The largest integer is: " + compInt.getLargest());
        System.out.println("");

    }

}
