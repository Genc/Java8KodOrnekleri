package datetime;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        // now metoduyla o anki saat, dakika, saniye ve salise alınır.
        LocalTime suankisaat = LocalTime.now();
        System.out.println(suankisaat); // Çıktı : 14:17:43.730132300

        // of metoduyla dilediğimiz saat, dakika, saniye ve saliseyi belirtebiliriz.
        LocalTime ofTime = LocalTime.of(23, 59, 59);
        System.out.println(ofTime); // Çıktı : 23.59.59

        // Yardımcı metodlar ile çeşitli zamanlar pratik şekilde elde edilebilir.
        LocalTime midnight = LocalTime.MIDNIGHT; // Çıktı : 00:00
        LocalTime noon = LocalTime.NOON; // Çıktı : 12:00
        LocalTime min = LocalTime.MIN; // Çıktı : 00:00
        LocalTime max = LocalTime.MAX; // Çıktı : 23:59:59.999999999
        LocalTime parseTime = LocalTime.parse("11:30"); // Çıktı : 11:30

        // Belirli bir zaman nesnesi üzerinden saate, dakikaya, saniyeye ve saliseye ulaşabiliriz.
        int hour = suankisaat.getHour(); // Çıktı : 14
        int minute = suankisaat.getMinute(); // Çıktı : 17
        int second = suankisaat.getSecond(); // Çıktı : 43
        int nano = suankisaat.getNano(); // Çıktı : 730132300
    }
}