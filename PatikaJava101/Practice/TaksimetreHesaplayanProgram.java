package PatikaJava101.Practice;

import java.util.Scanner;

public class TaksimetreHesaplayanProgram {

    public static void main (String[] args){
        Scanner girdi = new Scanner(System.in);
        int gidilenkm;
        System.out.println("Kaç km gittiniz: ");
        gidilenkm = girdi.nextInt();

        double ucret = (gidilenkm <= 4.54)? 20 : 10 + gidilenkm * 2.20;   

        System.out.println(gidilenkm + " km yol gittiniz ve sizden " + ucret + " TL ücret alınacak.");

        girdi.close();
    }
    
}
