package PatikaJava101.Practice;

import java.util.Scanner;

public class KDVTutariHesaplayanProgram {
  public static void main(String[] args){
    double kdvsizfiyat;
    //kdvsiz tutarın elde edilmesi
    Scanner girdi = new Scanner(System.in);
    System.out.println(“Ücret Tutarını Giriniz: ”);
    kdvsiztutar = girdi.nextDouble();
    //hesaplama
    double kdv = (kdvsizfiyat <= 1000)? 0.18 : 0.08;
    double kdvtutari = kdvsizfiyat*kdv;
    double kdvlifiyat = kdvsizfiyat*(1+kdv);
    //yazdırma
    System.out.println(“KDV Hariç Tutar: ” + kdvsiztutar);
    System.out.println(“KDV Oranı: ” + kdv);
    System.out.println(“KDV Tutarı: ” + kdvtutari);
    System.out.println(“KDV Dahil Fiyat: ” + kdvlifiyat);
  }
}
