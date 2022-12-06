
import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {

        String userName,password,karar,newPassword;
        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Girin : ");
        userName=input.nextLine();
        System.out.print("Şifrenizi Girin : ");
        password=input.nextLine();




        if (userName.equals("eda") && password.equals("123456")){
            System.out.println("Giriş Yaptınız.");

        }else if (password!="123456"&&userName.equals("eda")){
            System.out.println("Yanlış Şifre !");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
            karar=input.nextLine();
            if (karar.equals("evet")){
                System.out.print("Yeni Şifrenizi Girin : ");
                password=input.nextLine();

                if (password.equals("123456")){
                    System.out.println("Şifre Oluşturulamadı Başka Bir Şifre Girin.");

                }else if (password.equals("eda")){
                    System.out.println("Kullanıcı adınızdan farklı bir şifre giriniz.");
                }else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }else {

            }


        }else if (userName!="eda" && password.equals("123456")){
            System.out.println("Kullanıcı adını yanlış girdiniz !");
        }
    }
}
