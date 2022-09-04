package PatikaJava101.Homework;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {

    public static void main(String[] args){
        
        int distance, age, traveltype;
        double price; 
        
        Scanner girdi = new Scanner(System.in);
        
        //ilk sorular
        System.out.println("Mesafeyi km türünden giriniz: ");
        distance = girdi.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        age = girdi.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        traveltype = girdi.nextInt();
        
        //fiyatın hesaplanması
        price = distance*(0.10);
        //yolculuk tipi değer aralığının hatalı olma durumu
        if(traveltype != 1 && traveltype != 2){
            System.out.println("Hatalı Veri Girdiniz!\nProgram sonlandırılıyor...");
            System.exit(0);
        }
        
        //yaş aralığına göre indirim
        if(age < 12){
            price = (price/2);
        }
        else if(age >= 12 && age <= 24){
            price = (price/10*9);
        }
        else if(age > 65){
            price = (price/10*7);
        }
        
        //gidiş dönüş tarifesi indirimi
        if(traveltype == 2){
            price = (price/10*8);
        }
        
        //toplam fiyatı yazdırma
        System.out.println("Toplam Tutar = " + price + " TL");

        girdi.close();
    }
    
}
