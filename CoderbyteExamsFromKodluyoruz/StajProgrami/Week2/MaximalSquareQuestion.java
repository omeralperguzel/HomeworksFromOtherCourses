/*QUESTION: (Hard)
Have the function MaximalSquare(strArr) take the strArr parameter being passed which will be a 
2D matrix of 0 and 1's, and determine the area of the largest square submatrix that contains all 
1's. A square submatrix is one of equal width and height, and your program should return the area 
of the largest submatrix that contains only 1's. For example: if strArr is ["10100", "10111", 
"11111", "10010"] then this looks like the following matrix:

1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0

For the input above, you can see the bolded 1's create the largest square submatrix of size 
2x2, so your program should return the area which is 4. You can assume the input will not be empty.
*/

package CoderbyteExamsFromKodluyoruz.StajProgrami.Week2;

import java.util.*; 
import java.io.*;

class MaximalSquareQuestion {

    public static String MaximalSquare(String[] strArr) {
        // code goes here
        
        if (strArr == null || strArr.length == 0 || strArr[0].length() == 0){
              return Integer.toString(0);
        }
            
        int[][] maxlar = new int[strArr.length][strArr[0].length()];
        int max = 0;
            
        for(int i = 0; i < strArr.length; i++) {
              maxlar[i][0] = Integer.parseInt(strArr[i].substring(0,1)) - 0;
              max = Math.max(max, maxlar[i][0]);
            }    
    
        for(int j = 0; j < strArr.length; j++) {
              maxlar[0][j] = Integer.parseInt(strArr[0].substring(j,j+1)) - 0;
              max = Math.max(max, maxlar[0][j]);
            }    
    
        for(int i = 1; i < strArr.length; i++) {
              for(int j = 1; j < strArr.length; j++) {
                if(Integer.parseInt(strArr[i].substring(j,j+1)) == 1){
                  maxlar[i][j] = Math.min(Math.min(maxlar[i-1][j-1], maxlar[i-1][j]), maxlar[i][j-1]) + 1;
                }
                max = Math.max(max, maxlar[i][j]);
              }
            }    
    
        String returnmax = Integer.toString(max*max);
    
        return returnmax;
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(MaximalSquare(s.nextLine())); 

        s.close();
      }

}