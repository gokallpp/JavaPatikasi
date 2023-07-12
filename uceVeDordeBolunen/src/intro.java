import java.util.Scanner;

//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program

public class intro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k;
        System.out.print("Sayı Giriniz: ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0){
                System.out.println(i);
            }
        }

    }
}
