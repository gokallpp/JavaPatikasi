import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz: ");
        int n = scan.nextInt();

        for (int i = n; i >= 0; i--) {
            for (int j = (n - i); j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = (2 * i + 1); k >= 1; k--) {
                System.out.print("*");
            }

            System.out.println(" ");

        }
    }
}

