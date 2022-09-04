package PatikaJava101.Practice;

import java.util.Scanner;

public class UcSayiyiKucuktenBuyugeSiralama {

    public static void main(String[] args){
        int a, b, c;
        Scanner girdi = new Scanner(System.in);

        System.out.println("1. Sayı: ");
        a = girdi.nextInt();

        System.out.println("2. Sayı: ");
        b = girdi.nextInt();

        System.out.println("3. Sayı: ");
        c = girdi.nextInt();

        if((a>b) && (a>c)){
            if(b>c){
                System.out.println("c < b < a");
            }
            else{
                System.out.println("b < c < a");
            }
        }
        else if((b>a) && (b>c)){
            if (a>c){
                System.out.println("c < a < b");
            }
            else{
                System.out.println("a < c < b");
            }
        }
        else{
            if (a>b){
                System.out.println("b < a < c");
            }
            else{
                System.out.println("a < b < c");
            }
        }
        girdi.close();
    }
    
}
