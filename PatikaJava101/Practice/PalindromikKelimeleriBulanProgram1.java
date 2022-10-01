package PatikaJava101.Practice;

import java.util.Scanner;

public class PalindromikKelimeleriBulanProgram1 {

    static String isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return "Bu kelime palindromik bir kelime değildir.";
            i++;
            j--;
        }
        return "Bu kelime palindromik bir kelimedir.";
    }

    /*static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }*/

    //I guess it's a different solution for it.
    static String isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return "Bu kelime palindromik bir kelimedir.";
        else
            return "Bu kelime palindromik bir kelime değildir.";
    }

    /*static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sorgulanacak kelimeyi yazınız: ");
        String word = scan.nextLine();
        System.out.println(isPalindrome(word));
        scan.close();
    }
    
}
