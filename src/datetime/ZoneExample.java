package datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneExample {
    public static void main(String[] args) {
        // systemDefault metodu ile JVM varsayılan olarak mevcut saat dilimini işletim sistemi üzerinden alır.
        ZoneId defaultZone = ZoneId.systemDefault();
        System.out.println(defaultZone); // Çıktı : Asia/Istanbul

        // of metodu ile özelleştirilmiş saat dilimi elde edebiliriz.
        ZoneId customZone = ZoneId.of("Europe/Istanbul");
        System.out.println(customZone); // Çıktı : Europe/Istanbul

        // LocalDateTime gibi çalışır ancak içerisinde saat diliminide barındırır.
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now); // Çıktı : 2019-08-07T15:14:53.248355900+03:00[Asia/Istanbul]

        // Şuanda Amerika'daki saatin kaç olduğuna bakalım.
        ZoneId losAngeles = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTimeInAmerica = ZonedDateTime.now(losAngeles);
        System.out.println(zonedDateTimeInAmerica); // Çıktı : 2019-08-07T05:14:53.248355900-07:00[America/Los_Angeles]

        // Los Angeles eyalati ile aramızdaki saat farkına bakalım;
        System.out.println(now.getHour() - zonedDateTimeInAmerica.getHour()); // Çıktı : 10
    }
}