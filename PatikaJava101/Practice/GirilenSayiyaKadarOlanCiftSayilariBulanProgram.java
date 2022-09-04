package PatikaJava101.Practice;

import java.util.Scanner;

public class GirilenSayiyaKadarOlanCiftSayilariBulanProgram {
    
    public static void main(String[] args){
        int k, counter;
        int totalofdivisibles = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        k = input.nextInt();

        /*for (int i = 1; i <= k; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }*/

        counter = 0;

        for (int i = 1; i <= k; i++){
            if (i % 3 == 0 && i % 4 == 0){
                totalofdivisibles += i;
                counter++;
            }
        }

        double meanvalue = totalofdivisibles/counter;

        System.out.println("3 ve 4'e tam bölünebilen sayıların toplamı " + 
        totalofdivisibles + "\nve bunun ortalaması " + meanvalue + " değeridir.");

        input.close();
    }

}
