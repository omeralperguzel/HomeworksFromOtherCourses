package PatikaJava101.Practice;

import java.util.Scanner;

public class HesapMakinesiProgram1 {

    public static void main(String[] args){
        int n1, n2, selection;

        Scanner girdi = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz: ");
        n1 = girdi.nextInt();
        System.out.println("İkinci Sayıyı Giriniz: ");
        n2 = girdi.nextInt();

        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.println("Seçiminiz hangisi?");
        selection = girdi.nextInt();

        switch(selection){
            case 1:
				System.out.println("Toplama: " + (n1+n2));
				break;
			case 2:
				System.out.println("Çıkarma: " + (n1-n2));
				break;
			case 3:
				System.out.println("Çarpma: " + (n1*n2));
				break;
			case 4:
					if(n2!=0) {
					System.out.println("Bölme: " + (n1/n2));
					}
					else {
					System.out.println("Bir sayı 0'a bolunemez.");
					}
				break;
			default:
				System.out.println("Yanlış seçim yaptınız, lütfen tekrar deneyiniz..");
				break;
            
        }
        girdi.close();
    }
    
}
