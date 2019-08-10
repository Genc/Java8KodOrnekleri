package stream.parallelstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> countries =  Arrays.asList("Turkey","England", "Norway", "Sweden", "Denmark", "Finland", "Germany", "Poland", "Russia", "Ukraine", "Belarus","Spain","France","Portugal","Greece","Holland","Belgium");
        Stream<String> stream = countries.stream();
        Stream<String> parallelStream = countries.parallelStream();

        long t1 = System.currentTimeMillis();
        stream.forEach(ParallelStreamExample::threadSleep);
        long t2 = System.currentTimeMillis();

        System.out.println("Toplam geçen süre : " + (t2 - t1));

        t1 = System.currentTimeMillis();
        parallelStream.forEach(ParallelStreamExample::threadSleep);
        t2 = System.currentTimeMillis();
        System.out.println("Toplam Geçen süre : " + (t2 - t1));
    }

    public static void threadSleep(String country) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Hata!");
        }
        System.out.println("Thread id : " + Thread.currentThread().getId() + " --> Gezilen ülke : " + country);
    }
}