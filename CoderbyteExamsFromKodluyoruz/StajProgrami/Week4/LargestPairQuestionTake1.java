package CoderbyteExamsFromKodluyoruz.StajProgrami.Week4;

import java.util.*; 
import java.io.*;

public class LargestPairQuestionTake1 {

    public static int LargestPair(int num) {

        int max = 0;//Integer.MAX_VALUE;
        int locationvalue = 0;
    
        String numString = String.valueOf(num);
        //String[] splitted = numString.split("");
    
        //int this_int = (int)numString.charAt(counter);
    
        max = Integer.parseInt(numString.charAt(0)+"");
    
        for (int i = 1; i < numString.length(); i++) {
          int compare = Integer.parseInt(numString.charAt(i)+"");
          if (compare > max) {
            max = compare;
            locationvalue = i;
          } 
        }
    
        //max = Arrays.stream(splitted).mapToInt(st -> Integer.parseInt(st)).max().getAsInt();
    
        String newnumber = numString.substring((locationvalue),(locationvalue+2));
        /*for (int counter = 0; counter<numString.length(); counter++){
          if (this_int > max){
            max = this_int;
          }
        }*/
        // code goes here  
    
        int newintnumber = Integer.valueOf(newnumber);
        //return max;
        return newintnumber;
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(LargestPair(s.nextLine())); 
      }
    
}
