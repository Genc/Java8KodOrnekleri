package functionalinterface.supplier;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Person> supplier = () -> new Person("Faruk");
        Person person = supplier.get();
        System.out.println(person);

        // BooleanSupplier örneğine bakalım.
        BooleanSupplier isLogin = () -> false;
        System.out.println(isLogin.getAsBoolean());

    }
}
