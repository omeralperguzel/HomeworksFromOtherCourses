package PatikaJava101.Practice;

import java.util.Scanner;

public class RecursiveIleFibonacciSerisiBulma {

    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Fibonacci serinizin eleman sayısını giriniz: ");
        int numberofvalues = input.nextInt();
        System.out.println(fib(numberofvalues));
        input.close();

    }
    
}
