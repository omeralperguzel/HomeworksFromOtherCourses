package PatikaJava101.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlarinFrekansi1 {

    Scanner input = new Scanner(System.in);
    static int k;

    public static int[] removeDuplicates(int arr[], int length){
 
        // creating another array for only storing
        // the unique elements
        int[] newlist = new int[length];
        for (int i = 0; i < arr.length; i++){
            newlist[i] = arr[i];
        }
        Arrays.sort(newlist);

        int[] temp = new int[length];
        k = 0;
 
        for (int i = 0; i < length - 1; i++) {
            if (newlist[i] != newlist[i + 1]) {
                temp[k++] = newlist[i];
            }
        }
        temp[k++] = newlist[length - 1];
 
        // Changing the original array
        for (int i = 0; i < k; i++) {
            newlist[i] = temp[i];
        }
        return newlist;
    }

    public static void main(String[] args) {

        int[] list = {12,23,98,43,12,12,43,23,67,11,11,56,11,11,11,34};
        int n = list.length;

        //System.out.println(removeDuplicates(list, n));
        //System.out.println("Dizi: " + Arrays.toString(removeDuplicates(list, n)));
        

        int[] count = new int[list.length];
        //System.out.println("Dizi: " + Arrays.toString(list));

        for (int i = 0; i <list.length; i++) {
            count[i] = 1;
        }
        for (int i = 0; i < list.length ; i++) {
            for (int j = 0; j < list.length ; j++) {
                if ((i != j) && (removeDuplicates(list, n)[i] == removeDuplicates(list, n)[j]))  {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length ; j++) {
                if ((j != i) && (removeDuplicates(list, n)[i] == removeDuplicates(list, n)[j]) ) {
                    count[j] = count[i];
                }
            }
        }
        System.out.println("Tekrar eden sayılar");
        for (int i = 0; i< list.length ; i++) {
            if (i !=0 && i < k) { 
                System.out.println(removeDuplicates(list, n)[i] + " sayısı " + count[i] + " kere tekrar edildi.");
            }
        }
    }
    
}
