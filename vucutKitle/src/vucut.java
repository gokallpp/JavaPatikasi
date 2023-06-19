import java.util.Scanner;

public class vucut {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Lütfen Boyunuzu Girin: ");
        double boy = scanner.nextDouble();

        System.out.println( "Lütfen Kilonuzu Girin: ");
        double kilo = scanner.nextDouble();

        double vucutKitleIndeksi = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : "+ vucutKitleIndeksi +"'dir");
    }


}
