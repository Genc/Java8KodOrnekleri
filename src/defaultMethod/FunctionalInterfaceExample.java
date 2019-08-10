package defaultMethod;

@FunctionalInterface
public interface FunctionalInterfaceExample {

    Integer topla(Integer sayi1, Integer sayi2);

    static void selamVer() {
        System.out.println("Selam !");
    }

    default Integer kareAl(Integer sayi) {
        return sayi * sayi;
    }

}
