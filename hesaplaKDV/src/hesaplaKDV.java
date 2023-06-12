import java.util.Scanner;


/*
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
 */

public class hesaplaKDV {
    public static void main(String[] args) {
        double tutar , kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutatrını Giriniz: ");

        tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar:    "        +tutar);
        System.out.println("KDV Oranı:        "        +kdvOran);
        System.out.println("KDV Tutarı:       "        +kdvTutar);
        System.out.println("KDV'li Tutarı:    "        +kdvliTutar);


    }
}
