package stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Ömer", "Faruk", "Yakup", "Fatih", "Yusuf", "Mesut", "Mert");
        nameList.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.print(name + " "));
        // Çıktı : ÖMER FARUK YAKUP FATİH YUSUF MESUT MERT

        // Integer tipindeki sayılarımızı Double türüne dönüştürelim.
        List<Integer> numberList = Arrays.asList(5, 1, 17, 44, 67, 23, 34, 33, 77, 55555);
        Stream<Double> doubleStream = numberList.stream().map(number -> Double.valueOf(number));
        doubleStream.forEach(number -> System.out.print(number + " "));
        // Çıktı : 5.0 1.0 17.0 44.0 67.0 23.0 34.0 33.0 77.0 55555.0
    }
}
