package PatikaJava101.Practice;

import java.util.Scanner;

public class GelismisHesapMakinesi {

    static void sum() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı:");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç: " + result);
        scan.close();
    }

    static void subtract() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz:");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı:");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç: " + result);
        scan.close();
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı:");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç: " + result);
        scan.close();
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz:");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı:");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 olarak giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç: " + result);
        scan.close();
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz:");
        int base = scan.nextInt();
        System.out.print("Üs değerini giriniz:");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç: " + result);
        scan.close();
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
        scan.close();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int selection;

        String menu = "1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme İşlemi\n"
                    + "5- Üslü Sayı Hesaplama\n"
                    + "6- Mod Alma\n"
                    + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "0- Çıkış Yap\n";

        do {
            System.out.println(menu);
            System.out.println("Bir işlem seçiniz: ");
            selection = scan.nextInt();

            switch (selection){
                case 1:
                  sum();
                  break;
                case 2:
                  subtract();
                  break;
                case 3:
                  times();
                  break;
                case 4:
                  divided();
                  break;
                case 5:
                  power();
                  break;
                case 6:
                  factorial();
                  break;
                case 0:
                  break;
                default:
                  System.out.println("Yanlış bir değer girdiniz, lütfen tekrar deneyiniz.");
            }
        } while (selection != 0);
        scan.close();
    }
}
