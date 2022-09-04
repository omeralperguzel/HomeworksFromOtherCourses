/*
QUESTION:

The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.
 */

package Hackerrank.JavaBadge;

//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class EndOfFileCounter {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int counter = 1;
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            System.out.printf("%d %s\n",counter, in.nextLine());
            counter++;
       }
       in.close();
    
    }
    
}
