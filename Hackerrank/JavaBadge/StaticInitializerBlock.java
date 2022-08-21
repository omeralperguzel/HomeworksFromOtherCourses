/*
NOTE: I think it is an useful knowledge which I can forgot. For more information please visit:
https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html

QUESTION:

Static initialization blocks are executed when the class is loaded, and you can initialize static variables 
in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a 
parallelogram with breadth  and height . You should read the variables from the standard input.
 */

package Hackerrank.JavaBadge;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializerBlock {
    
static boolean flag;
static int B,H;
    
    static{
        
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
    
        if(B>0 && H>0){
            flag = true;
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    
    
    
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
