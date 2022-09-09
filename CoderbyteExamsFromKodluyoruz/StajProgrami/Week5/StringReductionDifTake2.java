//from Metin Aksu's code shared on Kodluyoruz Discord server. I will only use that for educational purposes.
//I think it is simpler than "different take 1"

package CoderbyteExamsFromKodluyoruz.StajProgrami.Week5;

import java.util.Scanner;

public class StringReductionDifTake2 {

    public static int StringReduction(String str) {
        String pairStr, newStr;

        for (int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) != str.charAt(i+1)){
                pairStr = str.substring(i,i+2);
                newStr = "";

                if (pairStr.contains("a") && pairStr.contains("b")) {
                    newStr = "c";
                }
                else if (pairStr.contains("a") && pairStr.contains("c")) {
                    newStr = "b";
                }
                if (pairStr.contains("b") && pairStr.contains("c")) {
                    newStr = "a";
                }

                str = str.substring(0,i) + newStr + str.substring(i+2);
                i = -1;
            }
        }
        return str.length();
    }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(StringReduction(s.nextLine())); 
  }
    
}
