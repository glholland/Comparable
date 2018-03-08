package com.company;

public class Compare3{
    //Creates variables to place args and the largest value
    Comparable comp1, comp2, comp3, largest;
    // compareTo Cheatsheet -->   < 0 means arg is larger, == 0 means equal, > 0 means arg is smaller.

    //Constructor accepting 3 Comparable types
    Compare3(Comparable a, Comparable b, Comparable c){
        //Set the args to internal variables
        comp1 = a;
        comp2 = b;
        comp3 = c;

    }

    public void largest(){
       if(comp1.compareTo(comp2) > 0 && comp1.compareTo(comp3) > 0){
           largest = comp1;
       }else if(comp2.compareTo(comp1) > 0 && comp2.compareTo(comp3) > 0){
           largest = comp2;
       }else{
           largest = comp3;
       }
    }

    //You won't believe what this method does.
    public Comparable getLargest(){

        return largest;
    }

}
