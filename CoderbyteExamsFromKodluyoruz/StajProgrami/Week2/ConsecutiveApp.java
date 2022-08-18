/*QUESTION: (Medium)
Have the function Consecutive(arr) take the array of integers stored in arr and return the minimum number 
of integers needed to make the contents of arr consecutive from the lowest number to the highest number. 
For example: If arr contains [4, 8, 6] then the output should be 2 because two numbers need to be added to 
the array (5 and 7) to make it a consecutive array of numbers from 4 to 8. Negative numbers may be entered 
as parameters and no array will have less than 2 elements. */

package CoderbyteExamsFromKodluyoruz.StajProgrami.Week2;

import java.util.*; 
import java.io.*;

public class ConsecutiveApp {
    public static int Consecutive(int[] arr) {
        // code goes here  
        int max = arr[0];
        int min = arr[0];
        //finding max value
        for(int j : arr){
          if (j > max)
          max = j;
        }
        //finding min value
        for(int k : arr){
          if (k < min)
          min = k;
        }
        /*finding array length and finding needed number of 
        values for a consecutive array by subtracting max value 
        from min value, array length excluding the max and min 
        values and finally the max value not excluded from the
        first subtraction*/
        int arrlen = arr.length;
        int need = max-min-(arrlen-2)-1;
    
        return need;
        //return arr[0];
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(Consecutive(s.nextLine())); 

        s.close();
      }
}
