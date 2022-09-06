package PatikaJava101.Practice;

import java.util.Scanner;

public class ATMProjesi2 {

    public static void main(String[] args){
        String username, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        System.out.println("Kullanıcı Adınız:");
        username = input.nextLine();
        System.out.println("Parolanız:");
        password = input.nextLine();
        
        if(username.equals("patika") && password.equals("dev123")) {
            System.out.print("Yeni Kod bankasına hoşgeldiniz.\nYapmak istediğiniz işlem seçiniz\n");
            System.out.println("1-Para yatırma\n" +
            "2-Para Çekme\n" +
            "3-Bakiye Sorgula\n" +
            "4-Çıkış Yap");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
            int select = input.nextInt();

            switch (select){
                case 1:
                    System.out.println("Yatırmak istediğiniz tutar: ");
                    int deposit = input.nextInt();
                    balance += deposit;
                    System.out.print("Bakiyeniz: " + balance);break;
                case 2:
                    System.out.println("Çekme istediğiniz tutar: ");
                    int withdraw = input.nextInt();
                    if(withdraw > balance){
                        System.out.println("Yetersiz bakiye!");
                    break;}
                    else {
                        balance -= withdraw;
                        System.out.println("Bakiyeniz: " + balance);
                    }
                    break;

                case 3:
                    System.out.println("Mevcut Bakiyeniz: " + balance );break;
                case 4:
                    System.out.println("İyi günler. Yine bekleriz...");break;
            }

        }
        else {
            right--;
            System.out.println("Hatalı kullanıcı veya şifre girdiniz. Lütfen tekrar deneyiniz.\nKalan Hak: " + right);
            if(right == 0){
                System.out.println("Hesabınız bloke olmuştur. Bankayla iletişime geçiniz.");
            }
        }
        input.close();
        
    }
    
}
