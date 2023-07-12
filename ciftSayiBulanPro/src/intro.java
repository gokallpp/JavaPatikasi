import java.util.Scanner;


// Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan program.

public class intro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k;

        System.out.print("Sayı Giriniz: ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
