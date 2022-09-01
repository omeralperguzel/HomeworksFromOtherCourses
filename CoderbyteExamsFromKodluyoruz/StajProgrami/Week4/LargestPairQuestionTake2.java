package CoderbyteExamsFromKodluyoruz.StajProgrami.Week4;

import java.util.*; 
import java.io.*;

//https://stackoverflow.com/questions/71076891/find-the-largest-pair-in-an-integer

public class LargestPairQuestionTake2 {

    public static int LargestPair(int num) {
        // code goes here  
        int v = num;
        int m = 0;
        v = Math.abs(v);
        while (v >= 10){
          m = Math.max(m, v%100);
          v /= 10;
        }
        return m;
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(LargestPair(s.nextLine())); 
      }
    
}
