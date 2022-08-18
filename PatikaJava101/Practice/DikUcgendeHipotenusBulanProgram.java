package PatikaJava101.Practice;

import java.util.Scanner;

public class DikUcgendeHipotenusBulanProgram{
    
    public static void main(String[] args){
        //değer tanımlama
        int a, b;
        double c, u, cevre, alan;
        //girdileri alma
        Scanner girdi = new Scanner(System.in);
        System.out.println("1. kenarın uzunluğunu giriniz: ");   
        a = girdi.nextInt();
        System.out.println("2. kenarın uzunluğunu giriniz: ");   
        b = girdi.nextInt();
        //hipotenüsün hesaplanması ve yazdırılması
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("3. kenarın uzunluğu: " + c);
        //çevre ve alanın hesaplanması
        u = (a+b+c)/2;
        cevre = 2*u;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        //ödev çıktıları
        System.out.println("Çevresinin uzunluğu " + cevre + " olan üçgenin alanı " + alan + " olacaktır.");
        System.out.println("Çevresinin uzunluğu yaklaşık " + (int)cevre + " olan üçgenin alanı yaklaşık olarak " + (int)alan + " olacaktır.");
        girdi.close();
    }
}