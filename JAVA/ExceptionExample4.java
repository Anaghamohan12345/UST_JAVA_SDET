package com.ust.test;

public class ExceptionExample4 {
    public static void main(String args[])
    {
        try {
            // "aka" is not a number
            int num = Integer.parseInt ("aka") ;
 
            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }
}

