import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {

    float boy;

    Scanner inp = new Scanner(System.in);

    System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : " );
    boy=inp.nextFloat();
    //System.out.println(boy);

    //Scanner input2 = new Scanner(System.in);
    System.out.print("Lütfen kilonuzu giriniz : " );
    double kilo = inp.nextDouble();

    double index = (kilo / (boy * boy));
    System.out.print("Vücut Kitle İndeksiniz : "+ index );
    }
}


    /* Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
        Lütfen kilonuzu giriniz : 105
        Vücut Kitle İndeksiniz : 35.49215792320173


     */