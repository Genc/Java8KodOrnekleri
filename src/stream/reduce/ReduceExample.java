package stream.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 1, 2, 5, 7, 9);
        Integer sonuc = list.stream().reduce(0, (Integer ilk, Integer son) -> ilk + son);
        System.out.println(sonuc);

        /* Çalışma mantığı şu şekildedir.
        * 1. adım : 0 + 5 = 5 olur ve bu değer 2.adıma verilir.
        * 2. adım : 5 + 1 = 6 --> 3. adım : 6 + 2 = 8 --> 3. adım 8 + 5 = 13 --> 4. adım : 13 + 7 = 20 --> 5.adım : 20 + 9 = 29
        * Çıktı : 29 olacaktır.
        */
    }
}
