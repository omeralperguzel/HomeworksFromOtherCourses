package PatikaJava101.Practice;

import java.util.Scanner;

public class PalindromSayilar {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            return true;     
        } 
        else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int num = inp.nextInt();
        System.out.println(isPalindrom(num));
        inp.close();
    }
    
}
