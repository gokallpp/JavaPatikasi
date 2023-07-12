import java.util.Scanner;

/*
Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
tek sayıları toplayıp ekrana basan program.
 */

public class main {
    public static void main(String[] args) {
        int n;
        int toplam = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz: ");
            n = input.nextInt();
            if (n % 2 == 1) {
                toplam += n;
            }
        }while (n > 0);

        System.out.println("Toplam: " +toplam);




    }
}
