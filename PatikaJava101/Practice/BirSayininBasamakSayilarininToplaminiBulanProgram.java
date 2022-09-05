package PatikaJava101.Practice;

import java.util.Scanner;

public class BirSayininBasamakSayilarininToplaminiBulanProgram {

    public static void main(String[] args){

        int number;
        int digitnumber = 0;
        int counter = 0;
        int total = 0;
        int helper;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Basamaklarındaki rakamları toplanacak sayıyı giriniz: ");
        number = scanner.nextInt();
        int tempNumber = number;
         
        while (tempNumber != 0){
            tempNumber /= 10;
            counter ++;
            digitnumber = counter;
        }
        tempNumber = number;
        for (int i = 1; i <= digitnumber; i++){
            helper = tempNumber % 10;
            total += helper;
            tempNumber = tempNumber / 10;
        }
        System.out.println("Basamakların Rakamları Toplamı: " + total);

        scanner.close();
        
     }

    
    
}
