package PatikaJava101.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanaEnYakinDegerler1 {

    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı: ");
        int numberval = scan.nextInt();
      
        Arrays.sort(list);

        int min = numberval;
        int max = numberval;

        /*for (int i : list) {
            if (list[i] > max) {
                max = list[i];
                break;
            } 	
        }*/

        for(int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
                break;
            } 	
        }

        for(int i = list.length-1; i > 0; i--) {
            if (list[i] < min) {
                min = list[i];
                break;
                //Sanırım burada ondan az büyük ve az küçük bir şey bulunduğu gibi break komutunun çalışması işin asıl esprisi
            } 	
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
        scan.close();
        
    }
    
}
