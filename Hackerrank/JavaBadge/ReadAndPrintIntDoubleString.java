// https://www.hackerrank.com/challenges/java-stdin-stdout/

package Hackerrank.JavaBadge;

import java.util.Scanner;

public class ReadAndPrintIntDoubleString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        //IMPORTANT PART (I think)
        String s="";
        while(scan.hasNext())
        {
            s=scan.nextLine();
        }
        
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    
}
