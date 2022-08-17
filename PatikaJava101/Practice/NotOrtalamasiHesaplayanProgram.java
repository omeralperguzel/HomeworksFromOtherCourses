package PatikaJava101.Practice;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram{
    public static void main(String[] args){
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat = girdi.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik = girdi.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya = girdi.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce = girdi.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih = girdi.nextInt();

        System.out.print("Müzik Notunuz:");
        muzik = girdi.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam/6.0;

        System.out.println("Ortalamanız: " + sonuc);

        boolean sart = sonuc >= 60;
        String dersiGecebildiMi = sart ? "Sınıfı geçti." : "Sınıfta kaldı.";
        System.out.println(dersiGecebildiMi);
    }       
}