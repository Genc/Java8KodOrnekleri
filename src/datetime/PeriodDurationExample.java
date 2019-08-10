package datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodDurationExample {
    public static void main(String[] args) {
        // İki adet tarih oluşturalım ve bu tarihler arasındaki gün farkına bakalım.
        LocalDate date1 = LocalDate.of(1996, 9, 27);
        LocalDate date2 = LocalDate.of(1992, 12, 04);
        Period between = Period.between(date1, date2);
        System.out.println(between.getDays()); // Çıktı : -23 yani bu iki tarih arasında 23 gün fark olduğunu belirtiyor.

        // İki adet zaman bilgisi içeren nesne oluşturalım ve arasındaki saat farkına bakalım.
        LocalTime time1 = LocalTime.of(22, 59, 59);
        LocalTime time2 = LocalTime.of(03, 00, 00);
        Duration between1 = Duration.between(time1, time2);
        System.out.println(between1.toHours()); // Çıktı : -19 olacaktır. Arada 19 saat farkın olduğunu görüyoruz.
        // 2 zaman arasındaki saniye farkınada bakabiliriz.
        System.out.println(between1.getSeconds()); // Çıktı : -71999 saniyelik bir fark olduğunu görüyoruz.
    }
}