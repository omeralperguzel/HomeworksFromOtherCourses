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
