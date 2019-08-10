package functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Integer> isAEvenNumber = number -> number % 2 == 0 ;
        boolean result = isAEvenNumber.test(60);
        System.out.println("Girilen sayı çift mi ? " + result); // true

        Predicate<String> isALongSentence = (String sentence) -> sentence.length() > 60;
        boolean sonuc = isALongSentence.test("Bu uzun bir cümle ama uzunluğu 60 karakterden uzun değil.");
        System.out.println("Girilen cümle 60 karakterden uzun mu ?" + sonuc); // false

        Predicate<Integer> sayi = s -> s == 5;
        sayi = sayi.or(s -> s <4);
        System.out.println(sayi.test(5));

    }
}
