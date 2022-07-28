import java.util.Scanner;

public class burcBulma {
    /*
     * Koç Burcu : 21 Mart - 20 Nisan
     * Boğa Burcu : 21 Nisan - 21 Mayıs
     * İkizler Burcu : 22 Mayıs - 22 Haziran
     * Yengeç Burcu : 23 Haziran - 22 Temmuz
     * Aslan Burcu : 23 Temmuz - 22 Ağustos
     * Başak Burcu : 23 Ağustos - 22 Eylül
     * Terazi Burcu : 23 Eylül - 22 Ekim
     * Akrep Burcu : 23 Ekim - 21 Kasım
     * Yay Burcu : 22 Kasım - 21 Aralık
     * Oğlak Burcu : 22 Aralık - 21 Ocak
     * Kova Burcu : 22 Ocak - 19 Şubat
     * Balık Burcu : 20 Şubat - 20 Mart
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int month;
        int day;

        System.out.print("Dogdugunuz gunu giriniz: ");
        day = input.nextInt();

        System.out.print("\nDogdunuz ayi giriniz (Sayi olacak sekilde): ");
        month = input.nextInt();

        if (month == 1) {
            if (day <= 21) System.out.println("Oglak");
            else System.out.println("Kova");
        } else if (month == 2) {
            if (day <= 19) System.out.println("Kova");
            else System.out.println("Balik");
        } else if (month == 3) {
            if (day <= 20) System.out.println("Balık");
            else System.out.println("Koc");
        } else if (month == 4) {
            if (day <= 20) System.out.println("Kocsun bi hossun yekbucuk");
            else System.out.println("Boga");
        } else if (month == 5) {
            if (day <= 21) System.out.println("Boğa");
            else System.out.println("İkizler");
        } else if (month == 6) {
            if (day <= 22) System.out.println("İkizler");
            else System.out.println("Yengec");
        } else if (month == 7) {
            if (day <= 22) System.out.println("Yengec");
            else System.out.println("Aslan");
        } else if (month == 8) {
            if (day <= 23) System.out.println("Aslan");
            else System.out.println("Basak");
        } else if (month == 9) {
            if (day <= 22) System.out.println("Basak");
            else System.out.println("Terazi");
        } else if (month == 10) {
            if (day <= 22) System.out.println("Terazi");
            else System.out.println("Akrep");
        } else if (month == 11) {
            if (day <= 21) System.out.println("Akrep");
            else System.out.println("Yay");
        } else if (month == 12) {
            if (day <= 21) System.out.println("Yay");
            else System.out.println("Oglak");
        }
    }
}
