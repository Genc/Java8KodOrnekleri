package datetime;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        // now metoduyla o anki tarih ve zaman bilgileri alınır. Formatı: yyyy-MM-ddThh:mm:ss şeklindedir.
        LocalDateTime suankitarihvezaman = LocalDateTime.now();
        System.out.println(suankitarihvezaman); // Çıktı : 2019-08-07T14:45:31.556654900

        // of metoduyla tarih ve saat bilgilerini özelleştirebiliriz.
        LocalDateTime myBirthdayAndTime = LocalDateTime.of(1996, 9, 27, 12, 30);
        System.out.println(myBirthdayAndTime); // Çıktı : 1996-09-27T12:30

        // LocalDate ve LocalTime sınıflarında yaptığımız örneklerdeki gibi
        // Yıla, aya, güne, saate, dakikaya, saniyeye ve saliseye ulaşabiliriz.

        int dayOfMonth = suankitarihvezaman.getDayOfMonth(); // Çıktı : 07
        Month month = suankitarihvezaman.getMonth(); // Çıktı : AUGUST
        // Dilersek Ay bilgisini rakam olarakda alabiliriz.
        int monthValue = suankitarihvezaman.getMonth().getValue(); // Çıktı : 8
        int year = suankitarihvezaman.getYear(); // Çıktı : 2019
        int hour = suankitarihvezaman.getHour(); // Çıktı : 14
        int minute = suankitarihvezaman.getMinute(); // Çıktı : 45
        int second = suankitarihvezaman.getSecond(); // Çıktı : 31
        int nano = suankitarihvezaman.getNano(); // Çıktı : 556654900
    }
}