package PatikaJava101.Homework;

import java.util.Scanner;

public class AsalSayiBulanProgram {

    static String asal(int x,int trial) {

        if(x==2){
            return "Asal sayıdır.";
        }
        if(x % trial==0){
           asal(x,trial+1);

            return "Asal sayı değildir.";
        }
        else{
            return "Asal sayıdır.";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int x = input.nextInt();

        System.out.println(x+asal(x,2));
        input.close();
    }
    
}
