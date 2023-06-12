import java.util.Scanner;


public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        int mat = scanner.nextInt();

        System.out.println("Fizik notunuz: ");
        int fizik = scanner.nextInt();

        System.out.println("Kimya notunuz: ");
        int kimya = scanner.nextInt();

        System.out.println("Türkçe notunuz: ");
        int turkce = scanner.nextInt();

        System.out.println("Tarih notunuz: ");
        int tarih = scanner.nextInt();

        System.out.println("Müzik notunuz: ");
        int muzik = scanner.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam /6 ;

        System.out.println("Not Ortalaması: " +ortalama);

        String sonuc = ortalama >= 60 ? "Geçti" : "Kaldı";
        System.out.println(sonuc);

    }
}
