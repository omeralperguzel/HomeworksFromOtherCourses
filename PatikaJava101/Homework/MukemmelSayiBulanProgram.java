package PatikaJava101.Homework;

import java.util.Scanner;

public class MukemmelSayiBulanProgram {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        boolean isworking = true;
        int number, totalvalue = 0;

        while (isworking == true){

            System.out.println("Bir sayı giriniz: ");
            number = input.nextInt();
            
            for (int i = (number-1); i >= 1; i--){
                if (number % i == 0){
                    totalvalue += i;
                    //System.out.print(i + " ");
                }
            }
            if (totalvalue == number){
                System.out.println(number + " Mükemmel sayıdır.");
                totalvalue = 0;
            }
            else{
                System.out.println(number + " Mükemmel sayı değildir.");
                totalvalue = 0;
            }
        }

        input.close();

    }
    
}
