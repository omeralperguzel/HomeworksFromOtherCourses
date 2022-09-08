//https://github.com/AWieclawski/edu.awieclawski.chlng/blob/bcc54d6e106ec773aac9200544683946a476e337/src/bracket/combinations/Solution.java

package CoderbyteExamsFromKodluyoruz.StajProgrami.Week5;

import java.util.*; 
import java.io.*;

public class BracketCombinations {

    private static int counter;

  static void bracketCounter(int position, int n, int open, int close){
    if (close == n){
      counter++;
      return;
    }
    else{
      if (open > close){
        bracketCounter(pos + 1, n, open, close +1);
      }
      if (open < n){
        bracketCounter(pos + 1, n, open + 1, close);
      }
    }
  }

  public static int BracketCombinations(int num) {
    // code goes here
    counter = 0;
    if (num > 0){
      bracketCounter(0, num, 0, 0);
    }
    
    return counter;

  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(BracketCombinations(s.nextLine())); 
  }
    
}
