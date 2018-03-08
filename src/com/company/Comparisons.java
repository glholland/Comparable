package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Comparisons {
    public String a, b, c;
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input1, input2, input3;

    System.out.print("Please input the first string: ");
    input1 = scan.next();
    //System.out.println("");

    System.out.print("Please input the second string: ");
    input2 = scan.next();
    //System.out.println("");

    System.out.print("Please input the third string: ");
    input3 = scan.next();
    //System.out.println("");

    Compare3 comp;

    comp = new Compare3(input1, input2, input3);
    comp.largest();

    System.out.println("----------------------------------------------");
    System.out.println("The largest string is: " + comp.getLargest());

    }

    private static class Compare3{
        Comparable comp1, comp2, comp3;
        Comparable largest = "";
        // <0 means arg is larger, ==0 means ==, >0 means arg is smaller
        //Constructor accepting 3 Comparable objects
        Compare3(Comparable a, Comparable b, Comparable c){
            comp1 = a;
            comp2 = b;
            comp3 = c;
        }

        private void largest(){
            if (comp1.compareTo(largest) > 0){
                largest = comp1;
            }
            if(comp2.compareTo(largest) > 0){
                largest = comp2;
            }
            if(comp3.compareTo(largest) > 0){
                largest = comp3;
            }
        }

        private Comparable getLargest(){
         return largest;
        }

    }
}
