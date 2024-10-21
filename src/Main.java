import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int taban, us;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabanı giriniz: ");
        taban = scanner.nextInt();

        System.out.println("Üssü giriniz: ");
        us = scanner.nextInt();

        double sonuc = 1; // Sonuç değeri, negatif üssü de desteklemek için double olmalı

        if (us == 0) {
            sonuc = 1; // Üs 0 ise sonuç her zaman 1'dir.
        } else if (us > 0) {
            // Pozitif üs hesaplama
            for (int i = 1; i <= us; i++) {
                sonuc *= taban;
            }
        } else {
            // Negatif üs hesaplama
            for (int i = 1; i <= -us; i++) {
                sonuc *= taban;
            }
            sonuc = 1.0 / sonuc; // Sonucu ters çeviriyoruz çünkü üs negatif
        }

        System.out.println("Sonuç: " + sonuc);
    }
}
