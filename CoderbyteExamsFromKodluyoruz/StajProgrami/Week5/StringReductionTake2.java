package CoderbyteExamsFromKodluyoruz.StajProgrami.Week5;

import java.util.*; 
import java.io.*;

public class StringReductionTake2 {

    public static String StringReduction(String str) {
        if (str.length() <= 1){
          String lengthstrstring = String.valueOf(str.length());
          return lengthstrstring;
        } 

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1 && str.charAt(i) == str.charAt(i - 1)) {
                result += String.valueOf(str.charAt(i));
                continue;
            }

            if (str.charAt(i) != str.charAt(i + 1)) {
                result += String.valueOf(reduct(str.charAt(i), str.charAt(i + 1)));
                if (i < str.length() - 1) {
                    i += 1;
                    result += str.substring(i + 1);
                }

                return StringReduction(result);
            } else {
                result += String.valueOf(str.charAt(i));
            }
        }
        String lengthresstring = String.valueOf(result.length());
        return lengthresstring;
    }

    char reduct(char x, char y) {
        if (x == 'b' && y == 'c') {
            return 'a';
        } else if (x == 'c' && y == 'b') {
            return 'a';
        } else if (x == 'a' && y == 'c') {
            return 'b';
        } else if (x == 'c' && y == 'a') {
            return 'b';
        }
        return 'c';
    }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(StringReduction(s.nextLine())); 
  }
    
}
