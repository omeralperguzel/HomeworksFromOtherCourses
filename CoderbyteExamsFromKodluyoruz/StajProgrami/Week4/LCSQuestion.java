/* QUESTION:

Have the function LCS(strArr) take the strArr parameter being passed which will be an array of two strings containing only the characters {a,b,c} and have your program return the length of the longest common subsequence common to both strings. A common subsequence for two strings does not require each character to occupy consecutive positions within the original strings. For example: if strArr is ["abcabb","bacb"] then your program should return 3 because one longest common subsequence for these two strings is "bab" and there are also other 3-length subsequences such as "acb" and "bcb" but 3 is the longest common subsequence for these two strings.

*/

//https://www.geeksforgeeks.org/largest-rectangle-under-histogram/
//https://www.sanfoundry.com/java-program-longest-common-subsequence-algorithm/

package CoderbyteExamsFromKodluyoruz.StajProgrami.Week4;

public class LCSQuestion {

    public static String LCS(String[] strArr) {

        int l1 = strArr[0].length();
        int l2 = strArr[1].length();
    
        int[][] newarr = new int[l1 + 1][l2 + 1];
    
        for(int i = l1-1; i>=0; i--){
          for(int j = l2-1; j>=0; j--){
            if(strArr[0].charAt(i) == strArr[1].charAt(j))
            newarr[i][j] = newarr[i+1][j+1] +1;
            else
            newarr[i][j] = Math.max(newarr[i+1][j],newarr[i][j+1]);
          }
        } 
    
        int i = 0, j = 0;
        StringBuffer sb = new StringBuffer();
        while (i<l1 && j<l2){
          if (strArr[0].charAt(i) == strArr[1].charAt(j)){
            sb.append(strArr[0].charAt(i));
            i++;
            j++;
          }
          else if (newarr[i+1][j] >= newarr[i][j+1])
          i++;
          else
          j++;
        }
    
        String newstring = sb.toString();
        //int newstringint = Integer.parseint(newstring);
        int newstrlen = newstring.length();
        String convertednewstrlen = String.valueOf(newstrlen);
        // code goes here  
        return convertednewstrlen;
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(LCS(s.nextLine())); 
      }
    
}
