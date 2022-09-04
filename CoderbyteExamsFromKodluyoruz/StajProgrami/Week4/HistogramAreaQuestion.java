/*QUESTION:
Have the function HistogramArea(arr) read the array of non-negative integers stored in arr which will represent the heights of bars on a graph (where each bar width is 1), and determine the largest area underneath the entire bar graph. For example: if arr is [2, 1, 3, 4, 1] then this looks like the following bar graph:
*/

//https://www.geeksforgeeks.org/largest-rectangle-under-histogram/

package CoderbyteExamsFromKodluyoruz.StajProgrami.Week4;

import java.util.*; 
import java.io.*;

public class HistogramAreaQuestion {

    public static int HistogramArea(int[] arr) {
        // code goes here  
        int histlength = arr.length;
    
        Stack<Integer> s = new Stack<>();
    
        s.push(-1);
        int max_area = arr[0];
    
        int left_smaller[] = new int[histlength];
        int right_smaller[] = new int[histlength];
        for (int i = 0; i<histlength; i++){
          left_smaller[i] = -1;
          right_smaller[i] = histlength;
        }
    
        int i = 0;
        while(i<histlength){
          while(!s.empty()&&s.peek() != -1&&arr[i]<arr[s.peek()]){
            right_smaller[s.peek()] = (int)i;
            s.pop();
          }
          if (i>0 && arr[i] == arr[(i-1)]){
            left_smaller[i] = left_smaller[(int)(i-1)];
          }
          else{
            left_smaller[i] = s.peek();
          }
          s.push(i);
          i++;
        }
    
        for(i=0; i<histlength; i++){
          max_area = Math.max(max_area, arr[i]*(right_smaller[i] - left_smaller[i] - 1));
        }
    
        return max_area;
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(HistogramArea(s.nextLine())); 
        s.close();
      }
    
}
