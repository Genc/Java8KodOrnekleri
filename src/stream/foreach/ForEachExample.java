package stream.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEachExample {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(5, 12, 55, 23, 44, 33, 34, 99, 87, 23, 11, 456, 233, 111, 6, 23);
        Stream<Integer> stream = numberList.stream();
        stream.forEach(number -> System.out.println(number));

        // Daha kısa olarak bu şekilde yazabilirdik.
        // numberList.stream().forEach(System.out::println);

        // 23 sayısı bizim için uğurlu olduğunu var sayalım.Her 23 sayısı ile karşılaşıldığında ekrana "Şanslısın!" desin.
        // stream.forEach(number -> { if(number == 23) System.out.println("Şanslısın!");});
        // Dipnot: Bir stream "tüketiltikten" sonra tekrar kullanılamaz !
    }
}