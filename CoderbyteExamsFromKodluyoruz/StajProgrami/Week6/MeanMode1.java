/*QUESTION: (EASY)
 
 */

//https://stackoverflow.com/questions/4191687/how-to-calculate-mean-median-mode-and-range-from-a-set-of-numbers

package CoderbyteExamsFromKodluyoruz.StajProgrami.Week6;

import java.util.*; 
import java.io.*;

public class MeanMode1 {

    public static int MeanMode(int[] arr) {
        // code goes here  
    
        for(int i = 0; i < arr.length; i++){
          total += arr[i];
          int count = 0;
          for(int j = 0; j < arr.length; ++j){
            if (arr[j] == arr[i]) ++count;
          }
          if (count > maxCount){
            maxCount = count;
            maxValue = arr[i];
          }
        }
        double mean = total / arr.length;
        int mode = maxValue;
    
        if(mode == (int)mean){
          return 1;
        }
        else{
          return 0;
        }
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(MeanMode(s.nextLine())); 
        s.close();
      }
    
}
