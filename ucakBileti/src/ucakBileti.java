import java.sql.SQLOutput;
import java.util.Scanner;


/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

    - Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    - Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    - Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    - Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    - Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

 */



public class ucakBileti {
    public static void main(String[] args) {
        double km, yas, tip, top, yasIndirim;
        Scanner input = new Scanner(System.in);

        System.out.println("Sisteme Hoşgeldiniz! \nGideceğiniz Yeri KM cinsinden Giriniz: ");
        km = input.nextInt();

        System.out.println("Lütfen Yaşınızı Giriniz: ");
        yas = input.nextInt();

        System.out.println("Yolculuk Tipinizi Seçiniz\n(Tek Yön => 1, Gidiş Dönüş => 2)");
        tip=input.nextInt();

        if (km >=0 && yas >= 0){
            if (tip==1 || tip==2){
                km=km*0.1;
                top=km;
            if (yas<12){
                yasIndirim = top*0.5;
                top = top-yasIndirim;

            } else if (yas < 12 && yas <= 24) {
                yasIndirim=top*0.1;
                top=top-yasIndirim;

            } else if (yas>=65) {
                yasIndirim=top*0.3;
                top=top-yasIndirim;
            }

            if (tip==2){
                top-=top*0.2;
                top=top*2;
            }
                System.out.println("Toplam Tutar: " +top);
            }else {
                System.out.println("Hatalı Veri Girişi Yaptınız!");
            }
        }else {
            System.out.println("Hatalı Veri Girişi Yapıldı!");
        }




    }
}
