package functionalinterface.predicate;

import java.util.function.Predicate;

public class OtherMethodsInPredicateInterface {
    public static void main(String[] args) {

        Predicate<String> predicate = name -> name == "Faruk" ;
        predicate = predicate.and(name -> name.length() == 6);
        // test() metodu çağrıldığında aslında -> name == "Faruk" && name.length == 6 işlemi yapılacak.
        // && işlemi olduğundan dolayı şartın birisi sağlanmayacağından false dönecek.
        System.out.println(predicate.test("Faruk")); //

        // or için denersek;
        Predicate<String> predicate2 = name -> name == "Faruk";
        predicate2 = predicate2.or(name -> name.length() == 6); // name == "Faruk" || name.length == 6 işlemi yapılacak.
        System.out.println(predicate2.test("Faruk")); // or işleminde bir şart sağlansa bile true dönecektir.
        System.out.println("Predicate'den dönen sonucun tersini alır : " + predicate2.negate().test("Faruk"));
    }
}
