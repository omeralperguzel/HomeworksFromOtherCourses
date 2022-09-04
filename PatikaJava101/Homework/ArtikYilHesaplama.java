package PatikaJava101.Homework;

import java.util.Scanner;

public class ArtikYilHesaplama {

    public static void main(String[] args){
        
        int year;
        boolean leapyear = false;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Yıl giriniz:");
        year = input.nextInt();

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    leapyear = true;
                }
                else{
                    leapyear = false;
                }
            }
            else{
                leapyear = true;
            }
        }
        else{
            leapyear = false;
        }

        if (leapyear){
            System.out.println(year + " yılı bir artık yıldır!");
        }
        else{
            System.out.println(year + " yılı bir artık yıl değildir!");
        }

        input.close();
    }
    
}
