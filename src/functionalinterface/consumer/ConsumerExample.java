package functionalinterface.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Person person = new Person("Ömer", "Gençx");
        System.out.println(person); // Çıktı : Person{name='Ömer', surname='Gençx'}

        // Tip olarak Person sınıfı belirtildi. Lambda ifadesiyle person nesnesinin isim alanı değiştirildi.
        Consumer<Person> updateName = p -> p.setName("Faruk");
        updateName.accept(person);  // Lambda ifadesiyle verilen görev yerine getirildi, geriye değer döndürülmeyecek.
        System.out.println(person); // Çıktı : Person{name='Faruk', surname='Gençx'}

        // andThen() metoduyla iki Consumer'ı birbirine zincirledik.
        // Dipnot : Birinci ifade de herhangi bir hata olması durumunda bir sonraki iş çalışmayacaktır.

        // Mesela isim bilgisini güncelledikten sonra soyisim bilgisini güncelleyelim.
        Consumer<Person> updateName2 = p -> p.setName("Ömer Faruk");
        updateName2 = updateName2.andThen(p -> p.setSurname("Genç"));
        updateName2.accept(person);
        System.out.println(person); // Çıktı : Person{name='Ömer Faruk', surname='Genç'}
    }
}
