package PatikaJava101.Homework;

import java.util.Scanner;

public class MatrisTranspozonuBulma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır değerini giriniz: ");
        int row = scanner.nextInt();
        System.out.println("Sütun değerini giriniz: ");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        int[][] transpose = new int[col][row];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print( (i+1) + ".Satır " + (j+1) + ". Sütun: elemanını giriniz: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Ana matris: ");

        for (int i = 0; i < transpose.length; i++){
            for (int j = 0; j < transpose[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpoze edilmiş matris: ");

        for (int i = 0; i < transpose.length; i++){
            for (int j = 0; j < transpose[i].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();


    }
    
}
