package CoderbyteExamsFromKodluyoruz.StajProgrami.Week3;

import java.util.*; 
import java.io.*;

public class PentagonalNumber {
    public static int PentagonalNumberProcess(int num) {
        /*int pNum = 0;
        for(int i=1; i<=num; i++){
          pNum += (i*((3*i)-1))/2;
        }*/
        int pNum = (num*((3*num)-1))/2;
        // code goes here  
        return pNum;
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(PentagonalNumberProcess(s.nextLine())); 
      }
}
