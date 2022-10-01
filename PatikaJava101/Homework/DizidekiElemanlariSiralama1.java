package PatikaJava101.Homework;

import java.util.Scanner;
import java.util.Arrays;

public class DizidekiElemanlariSiralama1 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int length;

        System.out.print("Dizinin uzunluk değerini giriniz: ");
        length = keyboard.nextInt();

        int[] array = new int[length];
        addElements(array);

        System.out.println();
        System.out.println("Düzenlenmemiş Dizi: ");
        arrayPrinter(array);
        System.out.println();

        arraySorter(array);

        System.out.println("Düzenlenmiş Dizi: ");
        arrayPrinter(array);
        System.out.println();

        keyboard.close();
    }

    public static int[] arraySorter(int[] array) {

        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void arrayPrinter(int[] array) {

        System.out.println(Arrays.toString(array));
    }

    public static int[] addElements(int[] array) {
        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". eleman: ");
            int element = keyboard.nextInt();
            array[i] = element;
        }

        return array;
    }
    
}
