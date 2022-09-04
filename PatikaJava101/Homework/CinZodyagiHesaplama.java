package PatikaJava101.Homework;

import java.util.Scanner;

public class CinZodyagiHesaplama {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        int birthyear; 
        String zodiac;

        System.out.println("Doğum yılınızı giriniz: ");

        birthyear = input.nextInt();

        if(birthyear%12 == 0) zodiac = "Maymun";
        else if(birthyear%12 == 1) zodiac = "Horoz";
        else if(birthyear%12 == 2) zodiac = "Köpek";
        else if(birthyear%12 == 3) zodiac = "Domuz";
        else if(birthyear%12 == 4) zodiac = "Fare";
        else if(birthyear%12 == 5) zodiac = "Öküz";
        else if(birthyear%12 == 6) zodiac = "Kaplan";
        else if(birthyear%12 == 7) zodiac = "Tavşan";
        else if(birthyear%12 == 8) zodiac = "Ejderha";
        else if(birthyear%12 == 9) zodiac = "Yılan";
        else if(birthyear%12 == 10) zodiac = "At";
        else zodiac = "Koyun";
        
        System.out.println("Çin Zodyağı Burcunuz: " + zodiac);

        input.close();
        
    }
    
}
