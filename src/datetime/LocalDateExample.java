package datetime;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        // now metoduyla o anki tarih alınır.
        LocalDate today = LocalDate.now();
        System.out.println(today); // Çıktı : 2019-08-07

        // of metoduyla dilediğimiz bir tarihi girebiliriz.
        LocalDate birthday = LocalDate.of(1996, 9, 27);
        System.out.println(birthday); // Çıktı : 1996-09-27

        // LocalDate sınıfı immutable bir sınıf olduğundan dolayı with, plus, minus gibi
        // metodlarla yapılan değişiklikler var olan nesneyi etkilemez, farklı bir LocalDate nesnesi döndürür.

        // withYear metoduyla var olan bir tarihin sadece yılını değiştirip yeni bir nesne elde ederiz.
        LocalDate changeTodaysYear = today.withYear(2020);
        System.out.println(changeTodaysYear); // Çıktı : 2020-08-07

        // plusDays metoduyla var olan bir tarihin sadece gününü belirlediğimiz sayıda ilerletip yeni bir nesne elde ederiz.
        LocalDate myCousinBirthday = birthday.plusDays(10);
        System.out.println(myCousinBirthday); // Çıktı : 1996-10-07

        // minusYears metoduyla var olan bir tarihin sadece yılını belirlediğimiz sayıda azaltıp yeni bir nesne elde ederiz.
        LocalDate siegeOfViennaDate = birthday.minusYears(467);
        System.out.println(siegeOfViennaDate); // Çıktı :  27/09/1529 Viyana Kuşatması

        // Belirli bir tarih üzerinden yalnızca yıla, güne veya aya ulaşabiliriz.
        int dayOfMonth = birthday.getDayOfMonth();  // 27
        int month = birthday.getMonth().getValue(); // 09
        int year = birthday.getYear(); // 1996
        System.out.println(dayOfMonth + "/" + month + "/" + year); // Çıktı : 27/9/1996
    }
}