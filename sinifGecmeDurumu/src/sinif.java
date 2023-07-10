import java.util.Scanner;


public class sinif {
    public static void main(String[] args) {
        int Matematik, Fizik, Turkce, Kimya, Muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        Matematik = input.nextInt();

        System.out.println("Fizik Notunuz: ");
        Fizik = input.nextInt();

        System.out.println("Türkçe Notunuz: ");
        Turkce = input.nextInt();

        System.out.println("Kimya Notunuz: ");
        Kimya = input.nextInt();

        System.out.println("Müzik notunuz: ");
        Muzik = input.nextInt();

        double avarage = (Matematik + Fizik + Turkce + Kimya + Muzik) / 5;

        if (avarage <= 55){
            System.out.println("Ortalamanız: "+avarage);
            System.out.println("Sınıfta Kaldınız!");
        }else {
            System.out.println("Ortalamanız: "+avarage);
            System.out.println("Tebrikler Sınıfı Geçtiniz!");
        }






    }
}
