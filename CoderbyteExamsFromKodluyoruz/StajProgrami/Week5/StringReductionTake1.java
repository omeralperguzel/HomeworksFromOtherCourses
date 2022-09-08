package CoderbyteExamsFromKodluyoruz.StajProgrami.Week5;

import java.util.*; 
import java.io.*;

public class StringReductionTake1 {

    public static String StringReduction(String str) {
        // code goes here
        int count = 1, steps = 0;
        for (int i = 0; i < str.length()-1; i++){
            if (str.charAt(i) == str.charAt(i + 1)){
                //str.substring(i+2,str.length());
                //i = -1;
                count += 1;
            }
            else{
                i+=1;
                steps += (count/2);
                count = 1;
      }
    }  

    steps += count / 2;
    String stepstring = String.valueOf(steps);
    String countstring = String.valueOf(count);
    return stepstring;
    //return str;  
        return str;
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(StringReduction(s.nextLine())); 
      }
    
}
