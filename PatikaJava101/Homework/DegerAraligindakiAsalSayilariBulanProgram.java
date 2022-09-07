package PatikaJava101.Homework;

import java.util.Scanner;

public class DegerAraligindakiAsalSayilariBulanProgram {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Asal olup olmadığını hesaplamak istediğiniz son değeri giriniz: ");
        int finalvalue = input.nextInt();

        int counter;

        for (int i = 1; i <= finalvalue; i++){
            counter = 0;
            for(int j = 1; j < i; j++) {
                if (i % j == 0){
                    counter++;
                }
            }
            //counter is needed for finding if it is really a prime number or not
            if (counter == 1) System.out.print(i + " ");
        }

        input.close();
    }
}
