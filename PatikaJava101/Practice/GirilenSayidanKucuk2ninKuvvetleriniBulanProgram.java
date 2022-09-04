package PatikaJava101.Practice;

import java.util.Scanner;

public class GirilenSayidanKucuk2ninKuvvetleriniBulanProgram {

    public static void main(String[] args){
        
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Sınır sayısını giriniz: ");
        n = input.nextInt();

        /*for (int i = 1; i <= n; i *= 2){
            System.out.println(i);
        }*/

        for (int i = 1; i <= n; i *= 4){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 1; j <=n; j*= 5){
            System.out.print(j + " ");
        }

        input.close();
    }
    
}
