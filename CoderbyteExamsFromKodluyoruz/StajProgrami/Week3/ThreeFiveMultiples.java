package CoderbyteExamsFromKodluyoruz.StajProgrami.Week3;

import java.util.*; 
import java.io.*;

public class ThreeFiveMultiples {

    public static int ThreeFiveMultiple(int num) {
        // code goes here 
        int sum = 0;
        for(int i=0; i<num; i++){
          if(i%3 == 0 || i%5 == 0) sum += i;
        } 
        return sum;
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(ThreeFiveMultiple(s.nextLine())); 
        }
    
}
