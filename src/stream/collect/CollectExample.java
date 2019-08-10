package stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(11, 3, 2, 3, 8, 9, 0, 7, 2, 3, 4, 6, 8, 9, 2, 3, 4, 5, 6, 8, 9, 21, 3, 5, 6);
        // Set veri tipine dönüştüreceğimiz için tekrarlı elemanları otomatik olarak çıkartacaktır.
        Set<Integer> collect = numberList.stream().collect(Collectors.toSet()); // Çıktı : 0 2 3 4 5 21 6 7 8 9 11

        // Mesela elimizdeki listede 5'den büyük olanları alıp bunları yeni bir listeye atayalım.
        List<Integer> newList = numberList.stream().filter(number -> number > 5).collect(Collectors.toList());
        // Çıktı : 11 8 9 7 6 8 9 6 8 9 21 6

    }
}