import java.util.Scanner;


public class Main {

    static int usAlma(int taban,  int us){
        if (us == 0) {
            return 1; // Herhangi bir sayının 0. üssü 1'dir.
        } else if (us < 0) {
            return 1 / usAlma(taban, -us); // Negatif üs için tersini alıyoruz.
        } else {
            return taban * usAlma(taban, us - 1);
        }
    }




    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Tabanı Alınacak Sayı : ");
        int taban = scan.nextInt();

        System.out.print("Üs Olacak Sayı : ");
        int us = scan.nextInt();

        int sonuc = usAlma(taban, us);
        System.out.println("Sonuç : " +sonuc);

    }
}