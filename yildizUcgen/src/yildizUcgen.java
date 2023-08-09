import java.util.Scanner;

public class yildizUcgen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz: ");
        int n = scan.nextInt();

        for (int i = 1; i <= 6; i++){
            for (int k = 1; k <= (n - i); k++ ){
                System.out.print(" ");
            }

            for (int j = 1; j <= (2*i) - 1; j++){
                System.out.print("*");
            }

            System.out.println();

        }


    }
}
