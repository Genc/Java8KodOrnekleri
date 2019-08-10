package optional;

import java.util.Optional;

public class OptionalMethodsExample {
    public static void main(String[] args) throws Exception {
        String name = "Faruk";
        String surname = null;

        Optional<String> optionalOfName = Optional.of(name);
        // surname variable'ı null değer içerdiğinden NullPointerException fırlatır.
        // Optional<String> optionalOfNSurname = Optional.of(surname);
        Optional<String> optionalOfNullableName = Optional.ofNullable(name);
        Optional<String> optionalOfNullableSurname = Optional.ofNullable(surname);

        // get metodu

        System.out.println(optionalOfName.get()); // Çıktı : Faruk
        System.out.println(optionalOfNullableName.get()); // Çıktı : Faruk
        // Null değer içeren bir nesneyi get ile yazdırmak istersek NoSuchElementException hatası alırız.
        // System.out.println(optionalOfNullableSurname.get());

        // isPresent metodu

        boolean isPresentSurname = optionalOfNullableSurname.isPresent();
        System.out.println(isPresentSurname); // false dönecektir çünkü surname variable'ı null değer içeriyor.
        boolean isPresentName = optionalOfName.isPresent();
        System.out.println(isPresentName); // true dönecektir çünkü name alanı tanımlanmıştır.

        // ifPresent metodu

        optionalOfName.ifPresent(n -> System.out.println(n.toUpperCase())); // Consumer tipinde bir iş bekler. Çıktı : FARUK olur.

        // orElse metodu

        String soyisim = optionalOfNullableSurname.orElse("Genç");
        System.out.println(soyisim); // Çıktı : Genç

        // orElseGet metodu

        String fullName = optionalOfNullableSurname.orElseGet(() -> optionalOfName.get() + " Genç");
        System.out.println(fullName); // Çıktı : Faruk Genç

        // orElseThrow metodu

        // optionalOfNullableSurname.orElseThrow(Exception::new); // Çıktı : Exception in thread "main" java.lang.Exception

        // map metodu

        Optional<Boolean> aBoolean = optionalOfName.map(String::isEmpty);
        System.out.println(aBoolean.get()); // Çıktı : false

        // filter metodu

        optionalOfName.filter(word -> word.contains("F")).ifPresent(System.out::println); // F harfi içerenleri filtreleyip ekrana yazdık. Çıktı : Faruk
    }
}