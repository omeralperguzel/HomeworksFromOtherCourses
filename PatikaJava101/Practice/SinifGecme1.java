package PatikaJava101.Practice;

import java.util.Scanner;

public class SinifGecme1 {

    public static void main(String[] args){
        int mat, fizik, kimya, turkce, muzik;
        int totallesson = 0;
        int totalgrade = 0;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = girdi.nextInt();
        if(!(mat <= 0 || mat > 100)){
            totalgrade += mat;
            totallesson++;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = girdi.nextInt();
        if(!(fizik <= 0 || fizik > 100)){
            totalgrade += fizik;
            totallesson++;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = girdi.nextInt();
        if(!(turkce <= 0 || turkce > 100)){
            totalgrade += turkce;
            totallesson++;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = girdi.nextInt();
        if(!(kimya <= 0 || kimya > 100)){
            totalgrade += kimya;
            totallesson++;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = girdi.nextInt();
        if(!(muzik <= 0 || muzik > 100)){
            totalgrade += muzik;
            totallesson++;
        }

        /*System.out.print("Matematik Notunuz:");
        mat = girdi.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik = girdi.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya = girdi.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce = girdi.nextInt();

        System.out.print("Müzik Notunuz:");
        muzik = girdi.nextInt();

        int total = (mat+fizik+kimya+turkce+muzik);
        double average = total/5.0;*/

        double average = totalgrade / totallesson;

        if (average <= 55){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
            System.out.println("Ortalamanız: " + average);
        }
        else{
            System.out.println("Tebrikler, sınıfı geçtiniz!");
            System.out.println("Ortalamanız: " + average);
        }

        girdi.close();
    }       
    
}
