package stream.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(3, 5, 6, 7, 0, 2, 3, 5, 5, 3, 1, 3);
        numberList.stream().sorted().forEach(n -> System.out.print(n + " ")); // Çıktı : 0 1 2 3 3 3 3 5 5 5 6 7

        // Daha kapsamlı bir örnek yapalım..
        Car car1 = new Car("Ford", "Focus", "Blue", 1998);
        Car car2 = new Car("Volkswagen ", "Scirocco", "White", 2008);
        Car car3 = new Car("BMW", "5 Series", "Black", 1972);
        Car car4 = new Car("Dodge", "Challenger", "Red", 1970);

        // Bu nesneleri tarihlerine göre sıralayalım.
        List<Car> carList = Arrays.asList(car1, car2, car3, car4);
        carList.stream().sorted(Comparator.comparingInt(Car::getReleaseDate)).forEach(System.out::println); // 1970 - 1972 - 1998 - 2008
    }
}