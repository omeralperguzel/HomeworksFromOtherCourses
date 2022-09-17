package PatikaJava101.Homework;

import java.util.Scanner;

public class UsHesabiYapanProgram {

    static int result = 1;
    static int power(int x, int base){
        if (x == 0){
            return 1;
        }

        result *= base;
        power(x-1,base);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, base;

        System.out.println("Tabandaki sayiyi giriniz: ");
        base = input.nextInt();
        System.out.println("Usteki sayiyi giriniz: ");
        x = input.nextInt();

        System.out.println(power(x,base));
        input.close();
    }
    
}
