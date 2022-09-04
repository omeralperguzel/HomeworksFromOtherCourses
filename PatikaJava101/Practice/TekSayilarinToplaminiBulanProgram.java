package PatikaJava101.Practice;

import java.util.Scanner;

public class TekSayilarinToplaminiBulanProgram {
    
    public static void main(String[] args){
        int n;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        /*do{
            System.out.println("Sayı giriniz:");
            n = scan.nextInt();
            if (n % 2 == 1){
                total += n;
            }
        } while (n > 0);*/

        do{
            System.out.println("Sayı giriniz:");
            n = scan.nextInt();
            if ((n % 2 == 0) && (n % 4 == 0)){
                total += n;
            }
        } while (n % 2 == 0);

        System.out.println("Toplam: " + total);

        scan.close();
    }
}
