/*QUESTION: (MEDIUM)
Have the function StockPicker(arr) take the array of numbers stored in arr which will contain integers that represent the amount in dollars that a single stock is worth, and return the maximum profit that could have been made by buying stock on day x and selling stock on day y where y > x. For example: if arr is [44, 30, 24, 32, 35, 30, 40, 38, 15] then your program should return 16 because at index 2 the stock was worth $24 and at index 6 the stock was then worth $40, so if you bought the stock at 24 and sold it at 40, you would have made a profit of $16, which is the maximum profit that could have been made with this list of stock prices.
*/

package CoderbyteExamsFromKodluyoruz.StajProgrami.Week6;

import java.util.*; 
import java.io.*;

public class StockPicker1 {

    public static int StockPicker(int[] arr) {
        // code goes here  
        int n = arr.length;
        int maxProfit = 0;
    
        for(int i = 1; i < n; i++){
          if (arr[i] > arr[i-1]){
            maxProfit += arr[i] - arr[i-1];
          }
        }
        return maxProfit;
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(StockPicker(s.nextLine()));
        s.close(); 
      }
    
}

//it works but it prints the revenue of total buy-sell process, not the single buy and sell.
