/*QUESTION: 
 Have the function BitwiseOne(strArr) take the array of strings stored in strArr, which will only contain two strings of equal length that represent binary numbers, and return a final binary string that performed the bitwise OR operation on both strings. A bitwise OR operation places a 0 in the new string where there are zeroes in both binary strings, otherwise it places a 1 in that spot. For example: if strArr is ["1001", "0100"] then your program should return the string "1101"
 */

package CoderbyteExamsFromKodluyoruz.StajProgrami.Week3;

import java.util.*; 
import java.io.*;

public class BitwiseOne {
    public static String BitwiseOne(String[] strArr) {
        // code goes here  
        int int1 = Integer.parseInt(strArr[0],2);
        int int2 = Integer.parseInt(strArr[1],2);
        //String bin1 = Integer.toBinaryString(int1);
        //int bin2 = Integer.toBinaryString(int2);
        //int bin1 = Integer.parseInt(strArr[0]);
        //int bin2 = Integer.parseInt(strArr[1]);
        int binresult = (int1 | int2);
        //int binresult = (bin1 | bin2);
        String binresult2 = Integer.toBinaryString(binresult);
        String zero = "0";
        int lastlen = (strArr[0].length() - binresult2.length());
        //int lastlen = (strArr[0].length() - Integer.parseInt(binresult2));
        String binresult3 = binresult2;
        //String binresult3 = String.format("%0%lastlen", binresult2);
        //System.out.println(bin1 & bin2);
        
        if(strArr[0].length() > binresult2.length()){
          for(int i = 0; i<lastlen; i++){
            binresult3 = zero + binresult3;
            
          }
        }
    
        /*for (int i = 0; i<strArr[0].length(); i++){
          int curr_bit = 0;
          for (int j = 0; j<)
        }*/
    
        
        //int bin1 = (Integer.toBinaryString(Integer.parseInt(strArr[0],strArr[0].length-1)));
        return binresult3; // strArr[0];
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(BitwiseOne(s.nextLine())); 
      }
}
