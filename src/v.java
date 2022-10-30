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
        System.out.println("boy (m)=");//ask variable
        double boy= dat.nextDouble();//this variable must be meter (1,80 etc) and double
        System.out.println("kilo (m)=");
        double kilo= dat.nextDouble();
        double indeks= kilo/(boy*boy);//Body Mass Index
        System.out.println("Vücut Kitle İndeksiniz= "+indeks);
    }
}
