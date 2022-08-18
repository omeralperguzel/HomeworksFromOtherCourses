/*QUESTION: (Easy)
Have the function SnakeCase(str) take the str parameter being passed and return it in proper snake case 
format where each word is lowercased and separated from adjacent words via an underscore. The string will 
only contain letters and some combination of delimiter punctuation characters separating each word.

For example: if str is "BOB loves-coding" then your program should return the string bob_loves_coding.*/

package CoderbyteExamsFromKodluyoruz.StajProgrami.Week2;

import java.util.*; 
//import java.io.*;

public class SnakeCaseQuestion {
    public static String SnakeCase(String str) {
        // code goes here
        //lowercasing uppercase letters
        str = str.toLowerCase();
        //replacing spaces
        str = str.replaceAll(" ", "_");
        //replacing punctuations
        str = str.replaceAll("\\p{Punct}", "_");
        return str;
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(SnakeCase(s.nextLine())); 

        s.close();
      }
}
