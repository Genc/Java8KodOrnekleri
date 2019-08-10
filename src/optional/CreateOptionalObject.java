package optional;

import java.util.Optional;

public class CreateOptionalObject {
    public static void main(String[] args) {
        Optional empty = Optional.empty(); // Boş bir nesne oluşturuldu.
        System.out.println(empty.isEmpty()); // Boş olup olmadığı kontrol edildi, true döner.

        String name = "Faruk";
        Optional<String> of = Optional.of(name); // Null olmayacak şekilde tanımladık. Eğer null olsaydı NullPointerException hatası alırdık.
        System.out.println(of.get()); // get metoduyla nesnenin içeriği yazdırıldı ; Faruk

        String surname = null;
        Optional<String> ofNullable = Optional.ofNullable(surname); // ofNullable metoduyla oluşturduğumuz için null değer alabilir.
        System.out.println(ofNullable.isEmpty()); // eğer get metodu kullansaydık NoSuchElementException hatası alırdık. Çünkü içerisi boş. isEmpty metodu ile kontrol edildiğinde true döner.
    }
}
