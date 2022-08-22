/*
QUESTION:

Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.
 * 
 * 
 */

package Hackerrank.JavaBadge;

import java.util.*;
import java.io.*;

public class LongIntByteShortFitTest {
    public static void main(String []argh)
    {


        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x = sc.nextLong();
                int maxint = ((2^(31))-1);
                System.out.println(x+" can be fitted in:");
                if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1){
                    if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1){
                        if(x>=-32768 && x<=32767){
                            if(x>=-128 && x<=127){
                                System.out.println("* byte");
                            }
                            System.out.println("* short");
                        }
                        System.out.println("* int");
                    }
                    System.out.println("* long");
                } 
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
