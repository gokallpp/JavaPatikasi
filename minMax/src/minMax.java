import java.util.Scanner;

/*

Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
ve bu sayıları ekrana yazan programı yazın.

 */


public class minMax {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n ;
        int number;
        int min = 0;
        int max = 0;

        System.out.print("Kaç adet sayı gireceksiniz: ");
        n = scan.nextInt();

        for (int i = 1; i<= n; i++)
        {
            System.out.println( i + ". sayıyı girin");
            number = scan.nextInt();

            if (number > max)
                max = number;
            if (number < min || min == 0)
                min = number;
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " +min);


    }
}
