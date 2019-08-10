package defaultMethod;

public interface Hesapla {

    Integer topla(Integer sayi1, Integer sayi2);

    default Integer kareAl(Integer sayi) {
        return sayi * sayi;
    }

}
