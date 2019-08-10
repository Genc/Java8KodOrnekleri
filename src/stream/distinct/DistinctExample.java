package stream.distinct;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(3, 5, 6, 7, 0, 2, 3, 5, 5, 3, 1, 3);
        numberList.stream().distinct().forEach(System.out::println); // Çıktı : 3 5 6 7 0 2 1
    }
}
