import java.util.Scanner;


/*
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8
olarak KDV tutarı hesaplayan programı yazınız.
 */

public class hesaplaKDV {
    public static void main(String[] args) {
        double tutar , kdvOran = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutatrını Giriniz: ");
        tutar = input.nextDouble();

        kdvOran = tutar < 1000 ?  0.18 :  0.8;
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar:    "        +tutar);
        System.out.println("KDV Oranı:        "        +kdvOran);
        System.out.println("KDV Tutarı:       "        +kdvTutar);
        System.out.println("KDV'li Tutarı:    "        +kdvliTutar);


    }
}
