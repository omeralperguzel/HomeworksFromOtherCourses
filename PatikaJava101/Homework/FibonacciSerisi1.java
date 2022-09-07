package PatikaJava101.Homework;

import java.util.Scanner;

public class FibonacciSerisi1 {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int total = 0;
        int previous1 = 1;
        int previous2 = 0;

        System.out.println("Lütfen Fibonacci serinizin eleman sayısını giriniz: ");
        int numberofvalues = input.nextInt();

        //System.out.print(previous2 + " ");
        //System.out.print(previous1 + " ");

        for(int i = 1; i < numberofvalues; i++){
            System.out.print(total + " ");
            total = previous1 + previous2;
            previous2 = previous1;
            previous1 = total;
        }

        input.close();

    }
    
}
