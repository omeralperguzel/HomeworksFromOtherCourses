// https://www.hackerrank.com/challenges/java-output-formatting/

package Hackerrank.JavaBadge;

import java.util.Scanner;

public class PrintfOutputFormatting {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s", s1);
            System.out.printf("%03d\n", x );
            //Complete this line
        }
        System.out.println("================================");

        sc.close();

}
    
}
