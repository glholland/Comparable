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
    comp.compareStrings();

    System.out.println("----------------------------------------------");
    System.out.println("The largest string is: " + comp.getLargest());

    }

    private static class Compare3{
        String string1 = "", string2 = "", string3 = "", largest = "";
        Integer int1, int2, int3;
        Compare3(String a, String b, String c){
            string1 = a;
            string2 = b;
            string3 = c;
// <0 means arg is larger, ==0 means ==, >0 means arg is smaller
        }

        Compare3(int a, int b, int c){
            int1 = a;
            int2 = b;
            int3 = c;
        }

        public  void compareStrings(){
            if (string1.compareTo(largest) > 0){
                largest = string1;
            }
            if(string2.compareTo(largest) > 0){
                largest = string2;
            }
            if(string3.compareTo(largest) > 0){
                largest = string3;
            }
        }

        public String getLargest(){
         return largest;
        }

    }
}
