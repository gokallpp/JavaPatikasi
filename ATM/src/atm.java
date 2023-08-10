import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        String userName, password;

        Scanner scan = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0){
            System.out.print("Kullanıcı Adınız: ");
            userName = scan.nextLine();
            System.out.print("Parolanız: ");
            password = scan.nextLine();

            if(userName.equals("Patika") && password.equals("dev123")) {
                System.out.println("Merhaba Patika Bankasına Hoşgeldiniz");

                do {
                System.out.println("1- Para yatırma\n" +
                        "2- Para Çekme\n" +
                        "3- Bakiye Sorgula\n" +
                        "4- Çıkış Yap");

                System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
                 select = scan.nextInt();

                 if (select == 1){
                     System.out.print("Para Miktarı: ");
                     int price = scan.nextInt();
                     balance += price;
                 } else if (select == 2) {
                     System.out.print("Para Miktarı: ");
                     int price = scan.nextInt();
                     if (price > balance){
                         System.out.println("Bakiye Yetersiz");
                     }else {
                         balance -= price;
                     }
                 } else if (select == 3) {
                     System.out.println("Bakiyeniz : "+ balance);
                 }


                }while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere");
            break;

            }else {
                right --;
                System.out.println("Hatalı Giriş! Tekrar Deneyiniz");
                if (right == 0){
                    System.out.println("Hesabınız Bloke OLmuştur! Banka İle İletişime Geçiniz");
                }else {
                    System.out.println("Kalan Hakkınız: " +right);

                }

            }

        }


    }
}
