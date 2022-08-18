package PatikaJava101.Practice;

import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args){
        int armutk, elmak, domatesk, muzk, patlicank;
        double armut, elma, domates, muz, patlican, toplam;

        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5.00;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? :");
        armutk = girdi.nextInt();

        System.out.print("Elma Kaç Kilo? :");
        elmak = girdi.nextInt();

        System.out.print("Domates Kaç Kilo? :");
        domatesk = girdi.nextInt();

        System.out.print("Muz Kaç Kilo? :");
        muzk = girdi.nextInt();

        System.out.print("Patlıcan Kaç Kilo? :");
        patlicank = girdi.nextInt();

        toplam = ((armut*armutk)+(elma*elmak)+(domates*domatesk)+(muz*muzk)+(patlican*patlicank));

        System.out.println("Toplam Tutar: " + toplam + " TL");

        girdi.close();
    }       

}
