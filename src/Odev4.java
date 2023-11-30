import java.util.Scanner;
public class Odev4 {

    public static boolean isPrime( int girilenSayi){
        if(girilenSayi<=1)
        {
            return false;
        }
        for(int i=2;i<=girilenSayi/2;i++)
        {
            if((girilenSayi%i)==0)
                return  false;
        }
        return true;

    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int girilenSayi;
        System.out.print("Sayı Giriniz :  " );
        girilenSayi=inp.nextInt();

        if(isPrime(girilenSayi)){
            System.out.print(girilenSayi + " sayisi ASALDIR !" );
        }
        else
            System.out.print(girilenSayi + " sayisi ASAL degildir !" );

    }
}





/*
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.

Senaryo


Sayı Giriniz : 22
22 sayısı ASAL değildir !

Sayı Giriniz : 2
2 sayısı ASALDIR !

Sayı Giriniz : 39
39 sayısı ASAL değildir !

Sayı Giriniz : 17
17 sayısı ASALDIR !
 */