package PatikaJava101.Practice;

import java.util.Scanner;

public class KullaniciGirisi1 {
    public static void main(String[] args){
        String username, password, newpassword;
        boolean reset = false;

        //newpassword = "pasta";

        Scanner girdi = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız:");
        username = girdi.nextLine();

        System.out.println("Şifreniz: ");
        password = girdi.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.println("Başarıyla Giriş Yaptınız!");
        }
        //bunu bir ara düzelt hatalı çalışıyor
        else{
            System.out.println("Bilgileriniz Yanlış!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
            reset = girdi.nextBoolean();
            if(reset == true){
                System.out.println("Lütfen yeni şifrenizi giriniz:");
                newpassword = girdi.nextLine();
                boolean check1 = newpassword.equals(password);
                if(check1 == false){
                    System.out.println("Lütfen önceki şifrenizden farklı bir şifre giriniz");
                    newpassword = girdi.nextLine();
                }
                else if (check1 == true){
                    System.out.println("Şifreniz başarıyla değiştirildi");
                    password = newpassword;
                    System.out.println("Yeni şifreniz: " + password);
                }
            }
            else{
                System.out.println("Giriş sonlandırıldı.");
                System.exit(0);
            }

        }

        girdi.close();
    }
    
}
