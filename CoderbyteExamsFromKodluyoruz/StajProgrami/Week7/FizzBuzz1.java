/*QUESTION (EASY)
 * 
 * Have the function FizzBuzz(num) take the num parameter being passed and return all the numbers from 1 to num separated by spaces, but replace every number that is divisible by 3 with the word "Fizz", replace every number that is divisible by 5 with the word "Buzz", and every number that is divisible by both 3 and 5 with the word "FizzBuzz". For example: if num is 16, then your program should return the string "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16". The input will be within the range 1 - 50.
 */

package CoderbyteExamsFromKodluyoruz.StajProgrami.Week7;

import java.util.*; 
import java.io.*;

public class FizzBuzz1 {

    public static int FizzBuzz(int num) {
        // code goes here  
        return num;
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(FizzBuzz(s.nextLine())); 
      }
    
}
