import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        int yas;
        int yolculukTipi;
        double kmBilgisi, normalTutar, sonucTutar = 0, indirimOrani;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : " );
        kmBilgisi=inp.nextDouble();

        System.out.print("Yaşınızı giriniz : " );
        yas=inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): " );
        yolculukTipi=inp.nextInt();

        if(kmBilgisi<0 || yas<0 || yolculukTipi>2){
            System.out.print("Hatalı Veri Girdiniz ! " );
        }
        else {
            normalTutar = kmBilgisi * 0.1;
            if (yas < 12) {
                indirimOrani = 0.5;
                sonucTutar = normalTutar * indirimOrani;
            } else if (yas > 11 && yas <= 24) {
                indirimOrani = 0.1;
                sonucTutar = normalTutar * (1 - indirimOrani);
            } else if (yas > 65) {
                indirimOrani = 0.3;
                sonucTutar = normalTutar * (1 - indirimOrani);
            } else if (yas>24 && yas<66) {
                sonucTutar=normalTutar;

            }

            if (yolculukTipi == 2) {
                indirimOrani = 0.2;
                sonucTutar = sonucTutar * (1 - indirimOrani) * 2;
            }
            else{
                sonucTutar = sonucTutar;
            }

            System.out.print("Toplam Tutar =" + sonucTutar);

        }


    }
}


  /*  Mesafeyi km türünden giriniz : 1500
        Yaşınızı giriniz : 20
        Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2

        Toplam Tutar = 216 TL


        Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL


   */