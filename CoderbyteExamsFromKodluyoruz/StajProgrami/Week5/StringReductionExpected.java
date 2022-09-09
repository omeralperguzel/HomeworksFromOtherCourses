//ANSWER ON CODERBYTE SOLUTION

package CoderbyteExamsFromKodluyoruz.StajProgrami.Week5;

import java.util.*;
//import java.io.*;

public class StringReductionExpected {

    public static String StringReduction(String str){
        if(str.length() <= 1){
            return String.valueOf(str.length());
        }

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1 && str.charAt(i) == str.charAt(i - 1)) {
                result += String.valueOf(str.charAt(i));
                continue;
            }

            if (str.charAt(i) != str.charAt(i + 1)) {
                result += String.valueOf(Reduct(str.charAt(i), str.charAt(i + 1)));
                if (i < str.length() - 1) {
                    i += 1;
                    result += str.substring(i + 1);
                }

                return StringReduction(result);
            } else {
                result += String.valueOf(str.charAt(i));
            }
        }
        return String.valueOf(str.length());
    }

    public static char Reduct(char x, char y) {
        if (x == 'b' && y == 'c') {
            return 'a';
        } 
        else if (x == 'c' && y == 'b') {
            return 'a';
        } 
        else if (x == 'a' && y == 'c') {
            return 'b';
        } 
        else if (x == 'c' && y == 'a') {
            return 'b';
        }
        else {
           return 'c'; 
        }
    }

    public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(StringReduction(s.nextLine())); 
        s.close();
    }
}
