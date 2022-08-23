// https://www.hackerrank.com/challenges/java-loops/

package Hackerrank.JavaBadge;

import java.util.*;
import java.io.*;

public class ThreeValueSeriesSum {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
             int process = a;
             int power = 1;
            for(int j=0;j<n;j++){
                //process += b*Math.pow(2,j);
                process += (b*(power)) /*(b*((2^(j+1))-1))*/;
                power *= 2; 
                System.out.print(process+" ");
                }
            System.out.println();
        }
        in.close();
    }
    
}
