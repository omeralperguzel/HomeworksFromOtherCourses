package CoderbyteExamsFromKodluyoruz.StajProgrami.Week5;

import java.util.Scanner;

public class StringReductionDifTake1 {

    public static int StringReduction(String str) {
        int a=0,b=0,c=0;
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        // // Printing the character array
        // for (char x : arr) {
        //     System.out.println(x);
        // }

        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a') {
                a++;
            }
            else if(arr[i]=='b') {
                b++;
            }
            else if(arr[i]=='c') {
                c++;
            }
        }
        // System.out.println(a+" a "+b+c);
        int[] arr1={a,b,c};
        int n=arr1.length;
        //System.out.println(findGCD(arr1,n));

        return findGCD(arr1,n);
    }

    static int gcd(int a, int b){
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static  int findGCD(int arr[], int n){
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);
            if(result == 1) {
                return 1;
            }
        }
        return result;
    }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(StringReduction(s.nextLine())); 
  }
    
}
