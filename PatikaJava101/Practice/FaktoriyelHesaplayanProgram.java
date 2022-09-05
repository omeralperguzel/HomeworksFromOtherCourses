package PatikaJava101.Practice;

import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {

    public static void main(String[] args){

        int n, r;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen faktöriyel sayısını giriniz: ");
        n = scan.nextInt();
        int total1 = 1;//for n!
        int total2 = 1;//for r!
        int total3 = 1;//for (n-r)!

        System.out.println("Giriş başarılı. Az önce girdiğiniz değer kombinasyon hesaplamasında eleman sayısı olarak da kullanılacaktır.");
        System.out.println("Şimdi bu kümenin olası alt kümelerinin eleman sayısını giriniz: ");
        r = scan.nextInt();
        System.out.println("Giriş başarılı. Hesaplama yapılıyor.");

        for (int i = 1; i <= n; i++){
            total1 = total1 * i;
        }

        for (int i = 1; i <= r; i++){
            total2 = total2 * i;
        }

        for (int i = 1; i <= n-r; i++){
            total3 = total3 * i;
        }

        System.out.println(n + ". faktöriyelin değeri: " + total1);

        double combination = total1/(total2*total3);
        System.out.println("C(" + n + "," + r + ")'nin değeri: " + (int)combination);

        System.out.println("Hesaplama tamamlandı. İşlem sonlandırılıyor.");

        scan.close();
    }
    
}
