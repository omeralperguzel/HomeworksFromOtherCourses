package PatikaJava101.Homework;

import java.util.Scanner;

public class TersUcgenYapimi {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = keyboard.nextInt();

        for (int i = n-1; i >= 0 ; i--) {
            for (int j = (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i); k >= 0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }   

        keyboard.close();
    }
    
}
