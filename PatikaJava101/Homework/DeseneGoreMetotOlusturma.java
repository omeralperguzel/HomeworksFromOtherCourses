package PatikaJava101.Homework;

import java.util.Scanner;

public class DeseneGoreMetotOlusturma {

    public static void pattern(int number,int tempNumber, int x) {
		//HATIRLATMA: x = 0 çıkarma işlemini, x = 1 toplama işlemini ifade eder.
		
		//Eğer sayı pozitifse ve x = 0 ise sayı negatif veya 0 olana kadar 5 azaltılır.
		if(number > 0 && x == 0) {
			System.out.print(number + " ");
			number -= 5;
			pattern(number,tempNumber,0);
		}
		
		//Eğer sayı 0 veya negatifse o zaman çalışır. x = 1 ile toplama işlemi çağrılır. 
		else if(number == 0 || number < 0) {
			System.out.print(number + " ");
			number += 5;
			pattern(number,tempNumber,1);
			}	
		
		//Bir üstte çağrılan toplama işlemi bu koşul altında gerçekleşir. 0'dan number'a kadar 5 artırılarak number ekrana yazdırılır.
		else if(number > 0 && number <= tempNumber && x == 1) {
			System.out.print(number + " ");
			number += 5;
			pattern(number,tempNumber,1);
		}
	}
			
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen N sayısını giriniz: ");
		num = input.nextInt();
		
		pattern(num,num,0);
        input.close();
    }
    
}
