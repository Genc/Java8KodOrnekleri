package datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersExample {
    public static void main(String[] args) {
        // İçinde bulunduğumuz ayın ilk pazarına ulaşalım.
        LocalDate localDate = LocalDate.now();
        LocalDate firstSunday = localDate.with(TemporalAdjusters.firstDayOfMonth()).with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(firstSunday); // Çıktı : 2019-08-04 Görüldüğü gibi Ağustos ayının ilk pazarı 4'üne denk geliyormuş.

        // Bulunduğumuz günden bir sonraki perşembeye ulaşalım.

        LocalDate nextThursday = localDate.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println(nextThursday); // Çıktı : 2019-08-08

        // Bulunduğumuz ayın son gününe ulaşalım

        LocalDate lastDayOfMonth = localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDayOfMonth); // Çıktı : 2019-08-31
    }
}