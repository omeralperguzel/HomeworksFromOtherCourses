package CoderbyteExamsFromKodluyoruz.StajProgrami.Week2;

import java.util.*; 
import java.io.*;

public class SnakeCase {
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
      }
}
