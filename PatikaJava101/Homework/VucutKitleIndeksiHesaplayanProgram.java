package PatikaJava101.Homework;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplayanProgram {
    
    public static void main (String[] args){
        Scanner girdi = new Scanner(System.in);
        double boy, kilo, bki;
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = girdi.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = girdi.nextDouble();

        bki = kilo/(boy*boy);   

        System.out.println("Vücut Kitle İndeksiniz: " + bki);

        girdi.close();
    }

}
