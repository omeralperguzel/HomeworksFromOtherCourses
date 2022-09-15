/*QUESTION: (HARD)

 Have the function WildcardCharacters(str) read str which will contain two strings separated by a space. The first string will consist of the following sets of characters: +, *, and {N} which is optional. The plus (+) character represents a single alphabetic character, the asterisk (*) represents a sequence of the same character of length 3 unless it is followed by {N} which represents how many characters should appear in the sequence where N will be at least 1. Your goal is to determine if the second string exactly matches the pattern of the first string in the input.

For example: if str is "++*{5} gheeeee" then the second string in this case does match the pattern, so your program should return the string true. If the second string does not match the pattern your program should return the string false.
 */

//https://github.com/JaydipBarvaliya/DSA-Galaxy/blob/e073e353cdd7615d86840d6f227e43d1f7e570cf/company/google/WildCards.java

package CoderbyteExamsFromKodluyoruz.StajProgrami.Week6;

import java.util.*; 
//import java.io.*;

public class WildcardCharacters1 {

    public static String WildcardCharacters(String str) {
        // code goes here  
        String[] splitinput = str.split(" ");
        String s1 = splitinput[0];
        String s2 = splitinput[1];
    
        int t1 = 0;
        int t2 = 0;
        char charAtT1;
        char charAtT2;
    
        while (t1 < s1.length() && t2 < s2.length()){
          charAtT1 = s1.charAt(t1);
          charAtT2 = s2.charAt(t2);
          if (charAtT1 == '+'){
            if (charAtT2 >= 91 && charAtT2 <= 122){
              t1++;
              t2++;
            }
            else {
              return "false";
            }
          }
          else if (charAtT1 == '*'){
            Character previousCharacter = null;
            int loopUpto;
            if (t1 + 1 == s1.length()){
              loopUpto = 3;
              t1 = t1 + 1;
            }
            else if (s1.charAt(t1 + 1) == '{'){
              loopUpto = s1.charAt(t1+2) - '0';
              t1 = t1 + 4;
            }
            else {
              loopUpto = 3;
              t1 = t1 + 1;
            }
    
            if (t2 + loopUpto > s2.length()) return "false";
            while (loopUpto-- > 0){
              if (previousCharacter == null){
                previousCharacter = s2.charAt(++t2);
              }
              else{
                char charAtNewT2 = s2.charAt(t2);
                if (previousCharacter != charAtNewT2) return "false";
                t2++;
              }
            }
          }
        }
        if (t1 == s1.length() && t2 == s2.length()) return "true";
        return "false";
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(WildcardCharacters(s.nextLine())); 
        s.close();
      }
    
}

//RESULT: 12/15
/*
1. For input "*{1}*{1} rt" the output was incorrect. The correct output is true
2. For input "+*{10}+ gphpppppppppp" the output was incorrect. The correct output is false 
*/