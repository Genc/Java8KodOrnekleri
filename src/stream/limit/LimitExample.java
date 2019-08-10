package stream.limit;

import java.util.Arrays;
import java.util.List;

public class LimitExample {
    public static void main(String[] args) {

        // Elimizde 34 sayının bulunduğu bir liste var ve biz buradan sadece ilk 5'i almak istiyoruz.
        List<Integer> numberList = Arrays.asList(5, 2, 3, 4, 5, 6, 8, 9, 0, 3, 2, 1, 3, 4, 5, 6, 8, 9, 0, 2, 3, 3, 1, 5, 7, 8, 9, 0, 2, 3, 4, 5, 7, 8);

        numberList.stream().limit(5).forEach(System.out::println); // Çıktı : 5 2 3 4 5

        // Diğer metodlar ile iç içe kullanımına bakalım.
        // Örneğin bu listeyi küçükten büyüğe sıralayalım ve aynı olanları çıkartıp sonra ilk 3'ü alalım.
        numberList.stream().sorted().distinct().limit(3).forEach(System.out::println); // Çıktı : 0 1 2
    }
}