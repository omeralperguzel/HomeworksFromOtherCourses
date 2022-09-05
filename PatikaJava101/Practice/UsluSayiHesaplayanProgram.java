package PatikaJava101.Practice;

import java.util.Scanner;

public class UsluSayiHesaplayanProgram {

    public static void main(String[] args){
        int n, k;
        Scanner input = new Scanner(System.in);
        System.out.println("Üstü alınacak sayı: ");
        n = input.nextInt();
        System.out.println("Üs olacak sayı: ");
        k = input.nextInt();

        int total = 1;
        /*int i = 1;
        while(i <= k){
            total *= n;
            i++;
        }*/

        for(int i = 1; i <= k; i++){
            total *= n;
        }

        System.out.println("Cevap: " + total);

        input.close();
    }
    
}
