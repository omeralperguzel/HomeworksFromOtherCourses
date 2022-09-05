//ÖDEV: Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

package PatikaJava101.Practice;

import java.util.Scanner;

public class ArmstrongSayilariBulanProgram {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        int number = scanner.nextInt();;
        int basenumber = 0;
        int tempnumber = number;
        int basevalue;
        int result = 0;
        int baspow;
        
        while (tempnumber != 0){
            tempnumber /= 10;
            basenumber ++;
        }

        tempnumber = number;

        while (tempnumber != 0){
            basevalue = tempnumber % 10;
            // 1*1*1*1 = 1^4
            baspow = 1;
            for (int i = 1; i <= basenumber; i++){
                baspow *= basevalue;
            }
            result += baspow;
            tempnumber /= 10;
        }

        if (result == number){
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        }
        else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }

        scanner.close();
        
     }
    
}
