/*QUESTION: (MEDIUM)
Have the function StockPicker(arr) take the array of numbers stored in arr which will contain integers that represent the amount in dollars that a single stock is worth, and return the maximum profit that could have been made by buying stock on day x and selling stock on day y where y > x. For example: if arr is [44, 30, 24, 32, 35, 30, 40, 38, 15] then your program should return 16 because at index 2 the stock was worth $24 and at index 6 the stock was then worth $40, so if you bought the stock at 24 and sold it at 40, you would have made a profit of $16, which is the maximum profit that could have been made with this list of stock prices.
*/

//https://www.geeksforgeeks.org/maximum-difference-between-two-elements/

package CoderbyteExamsFromKodluyoruz.StajProgrami.Week6;

import java.util.*; 
import java.io.*;

public class StockPicker2 {

  public static int StockPicker(int[] arr) {
    // code goes here  
    int n = arr.length;
    int max_diff = arr[1] - arr[0];

    for (int i = 0; i < n; i++){
      for (int j = i + 1; j < n; j++){
        if (arr[j] - arr[i] > max_diff){
          max_diff = arr[j] - arr[i];
        }
      }      
    }
    return max_diff;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(StockPicker(s.nextLine())); 
    s.close();
  }
    
}

//expected solution
