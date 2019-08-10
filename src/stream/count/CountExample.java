package stream.count;

import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(3, 5, 12, 11, 3, 2, 3, 8, 9, 0, 7, 2, 3, 4, 6, 8, 9, 2, 3, 4, 5, 6, 8, 9, 21, 3, 5, 6);
        long count = numberList.stream().count();
        System.out.println(count); // Çıktı : 28

        // Ara işlem sonrası kullanımı yaygındır. Örneğin ttekrar eden sayıları çıkartıp toplam veri sayısını hesaplayalım.
        long distCount = numberList.stream().distinct().count();
        System.out.println(distCount); // Çıktı : 12
    }
}