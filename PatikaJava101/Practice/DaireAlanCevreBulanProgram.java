package PatikaJava101.Practice;

import java.util.Scanner;

public class DaireAlanCevreBulanProgram {

    public static void main(String[] args){
        //değer tanımlama
        int r;
        double pi = 3.14;
        double aci, cevre, alan, alanamaaci;
        //girdileri alma
        Scanner girdi = new Scanner(System.in);
        System.out.println("Yarıçapın uzunluğunu giriniz: ");   
        r = girdi.nextInt();
        System.out.println("Merkez açının ölçüsünü giriniz: ");   
        aci = girdi.nextInt();
        //çevre ve alanın hesaplanması
        cevre = 2*pi*r;
        alan = pi*r*r;
        alanamaaci = pi*(r*r)*aci/360;
        //ödev çıktıları
        System.out.println("Çevresinin uzunluğu " + cevre + " olan dairenin alanı " + alan + " olacaktır.");
        System.out.println("Çevresinin uzunluğu yaklaşık " + (int)cevre + " olan dairenin alanı yaklaşık olarak " + (int)alan + " olacaktır.");
        System.out.println(aci + " dereceli daire diliminin alanı " + alanamaaci + " olacaktır.");
        System.out.println(aci + " dereceli daire diliminin alanı yaklaşık olarak " + (int)alanamaaci + " olacaktır.");
        
        girdi.close();
    }
    
}
