/* QUESTION: (EASY)
Have the function PowersofTwo(num) take the num parameter being passed which will be an integer and return the string true if it's a power of two. If it's not return the string false. For example if the input is 16 then your program should return the string true but if the input is 22 then the output should be the string false.
*/

import java.util.*; 
import java.io.*;

class Main {

  public static boolean PowersofTwo(int num) {
    // code goes here  
    int divisible = num % 2;
    int newnumber = num / 2 ;
    while(divisible == 0 && newnumber != 2){
      divisible = newnumber % 2;
      newnumber = newnumber /2;
    }

    if (newnumber == 2){
      return true;
    }
    else{
      return false;
    }
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(PowersofTwo(s.nextLine())); 
  }

}
