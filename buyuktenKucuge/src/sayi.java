import java.util.Scanner;

public class sayi {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("1. Sayıyı Giriniz: ");
        a = input.nextInt();

        System.out.println("2. Sayiyi Giriniz: ");
        b = input.nextInt();

        System.out.println("3. Sayıyı Giriniz: ");
        c = input.nextInt();


        if ((a > b) && (a > c)){
            if (b > c){
                System.out.println("a > b > c");
            }else {
                System.out.println("a > c > b");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c){
                System.out.println("b > a > c");
            }else {
                System.out.println("b > c > a");
            }
        } else if ((c > b) && (c > a)) {
            if (a > b){
                System.out.println("c > a > b");
            }else {
                System.out.println("c > b > a");
            }
        }
    }
}
