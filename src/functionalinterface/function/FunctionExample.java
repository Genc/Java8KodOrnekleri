package functionalinterface.function;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionExample {
    public static void main(String[] args) {

        // Integer bir sayı giriliyor ve bu sayı String'e dönüştürülüyor.
        Function<Integer,String> function = number -> number.toString();
        String functionResult = function.apply(100);
        System.out.println(functionResult + 100); // Çıktı : 100100 olur çünkü girilen sayı String'e dönüştü.

        // Girilen parametre ile dönüş tipi aynı olduğu durumda UnaryOperator kullanabiliriz.
        // String bir cümle giriliyor ve cümledeki her harf büyük harfe dönüştürülüyor.
        UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
        String unaryOperatorResult = unaryOperator.apply("Merhaba UnaryOperator !");
        System.out.println(unaryOperatorResult); // Çıktı : MERHABA UNARYOPERATOR !

        // T ve U tiplerinde iki parametre alır, R tipinde değer döndürür.
        // Function'dan tek farkı burada 2 parametre alabiliyor olması.
        BiFunction<Integer,Integer,Double> biFunction = (sayi1,sayi2) -> {
            Integer integerValue = sayi1 + sayi2;
            Double doubleValue = integerValue.doubleValue();
            return doubleValue;
        };

        Double biFunctionResult = biFunction.apply(5, 5);
        System.out.println(biFunctionResult); // Çıktı : 10.0 olur.
    }
}
