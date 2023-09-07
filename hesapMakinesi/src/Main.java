import java.util.Scanner;


public class Main {

    static int sum(int a, int b){
        int sonuc = a + b;
        System.out.println("Toplam : " +sonuc);

        return sonuc;
    }


    static int minus(int a, int b){
        int sonuc = a - b;
        System.out.println("Çıkarma : " +sonuc);

        return sonuc;
    }

    static int times(int a, int b){
        int sonuc = a * b;
        System.out.println("Çarpma : " +sonuc);

        return sonuc;
    }

    static int divided(int a, int b){
        if (b == 0){
            System.out.println("İkinci Sayı 0'dan Farklı Olmalı");
            return 0;
        }
        int sonuc = a / b;
        System.out.println("Bölme : " +sonuc);

        return sonuc;
    }

    static int power(int a, int b){
        int sonuc = 1;
        for (int i = 1; i <= b; i++){
            sonuc *= a;

        }
        return sonuc;
    }

    static int mod(int a, int b){
         return a % b;
    }

    static void dikdortgenAlanCevre(int a, int b){
        System.out.println("Alanı : "+(a * b));
        System.out.println("Çevresi : " +(2*(a + b )));
    }



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;

        String menu =
                "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Mod Alma\n" +
                "7- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap\n";


                System.out.println(menu);

        while(true) {

            System.out.print("Bir İşlem Seçiniz: ");
            select = scan.nextInt();

            if (select == 0){
                break;
            }

            System.out.print("İlk Sayı : ");
            int a = scan.nextInt();
            System.out.print("İkinci Sayı : ");
            int b = scan.nextInt();


            switch (select){
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    System.out.println("Üs Alma İşlemi : " +power(a, b));
                    break;
                case 6:
                    System.out.println("Mod İşlemi : " +mod(a, b));
                    break;
                case 7:
                    dikdortgenAlanCevre(a, b);
                    break;
                default:
                    System.out.println("Geçersiz İşlem!");


            }

        }
    }
}