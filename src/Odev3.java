import java.util.Scanner;
public class Odev3 {
    public static void main(String[] args) {
        int N, enBuyukSayi=-1, enKucukSayi=1, girilenSayi;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: " );
        N=inp.nextInt();

        for (int i=1; i<=N; i++){
            System.out.print(i+". Sayıyı giriniz:" );
            girilenSayi=inp.nextInt();
            if(girilenSayi<enKucukSayi){
                enKucukSayi=girilenSayi;
            } else if (girilenSayi>enBuyukSayi) {
                enBuyukSayi=girilenSayi;

            }
        }

        System.out.println("En büyük sayı: "+ enBuyukSayi );
        System.out.println("En küyük sayı: "+ enKucukSayi );


    }
}



/*

Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22
 */