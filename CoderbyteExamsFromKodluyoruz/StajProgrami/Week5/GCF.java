package CoderbyteExamsFromKodluyoruz.StajProgrami.Week5;

//https://www.javatpoint.com/java-program-to-find-gcd-of-two-numbers

//Greatest Common Divisor: It is the highest number that completely divides two or more numbers. It is abbreviated for GCD. It is also known as the Greatest Common Factor (GCF) and the Highest Common Factor (HCF). It is used to simplify the fractions.

/*
How to Find the Greatest Common Factor?

1- Write all the factors of each number.
2- Select the common factors.
3- Select the greatest number, as GCF.
 */

import java.util.*; 
import java.io.*;

public class GCF {

    public static int GCF(int[] arr) {
        // code goes here  
        int x = arr[0];
        int y = arr[1];
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++){
            if (x % i == 0 && y % i == 0){
                gcd = i;
            }
        }
    return gcd;
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(GCF(s.nextLine())); 

        s.close();
      }
    
}
