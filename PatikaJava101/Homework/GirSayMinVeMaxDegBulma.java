package PatikaJava101.Homework;

import java.util.Scanner;

//Girilen Sayılarda Min ve Max Değerleri Bulma

public class GirSayMinVeMaxDegBulma {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        int numberofvalues = input.nextInt();
        int biggestnumber = 1, smallestnumber = 1;
        int number;
        int i = 1;

        while(i <= numberofvalues){
            System.out.println(i + ". Sayıyı giriniz:");
            number = input.nextInt();

            if (i == 1){
                biggestnumber = number;
                smallestnumber = number;
            }
            
            if (number > biggestnumber) {
                biggestnumber = number;
            }

            if (number < smallestnumber) {
                smallestnumber = number;
            }

            i++;
        }

        System.out.println("En büyük sayı: " + biggestnumber);
        System.out.println("En küçük sayı: " + smallestnumber);

        input.close();

    }
    
}
