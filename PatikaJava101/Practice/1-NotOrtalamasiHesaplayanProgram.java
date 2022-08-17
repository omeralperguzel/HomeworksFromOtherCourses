import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat = girdi.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik = girdi.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya = girdi.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce = girdi.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih = girdi.nextInt();

        System.out.print("Müzik Notunuz:");
        muzik = girdi.nextInt();
    }       
}