import java.util.Scanner;

public class v {
    public static void main(String[] args) {
/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
 */

        Scanner dat = new Scanner(System.in);
        System.out.println("length (m)=");//ask variable
        double b= dat.nextDouble();//this variable must be meter (1,80 etc) and double
        System.out.println("weight (kg)=");
        double k= dat.nextDouble();
        double indeks= k/(b*b);//Body Mass Index
        System.out.println("Body Mass Index= "+indeks);
    }
}
