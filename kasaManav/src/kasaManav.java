import java.util.Scanner;


/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları

    --Armut : 2,14 TL
    --Elma : 3,67 TL
    --Domates : 1,11 TL
    --Muz: 0,95 TL
    --Patlıcan : 5,00 TL
 */

public class kasaManav {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlican;
        double a = 2.14, e = 3.67, d = 1.11, m = 0.95, p = 5.00;
        Scanner scanner = new Scanner(System.in);
        double toplamTutar = 0.0;

        System.out.println("Kaç Kilo Armut Aldınız?: ");
        armut = scanner.nextDouble();

        System.out.println("Kaç Kilo Elma Aldınız?: ");
        elma = scanner.nextDouble();

        System.out.println("Kaç Kilo Domates Aldınız?: ");
        domates = scanner.nextDouble();

        System.out.println("Kaç Kilo Muz Aldınız?: ");
        muz = scanner.nextDouble();

        System.out.println("Kaç Kilo Patlıcan Aldınız?: ");
        patlican = scanner.nextDouble();


        armut = armut * a;
        elma = elma * e;
        domates = domates * d;
        muz = muz * m;
        patlican = patlican * p;

        toplamTutar = armut+elma+domates+muz+patlican;

        System.out.println("Toplam Tutar : " + toplamTutar + " TL" );



    }
}
