package defaultMethod;

public class HesaplaImplementation implements Hesapla {

    @Override
    public Integer topla(Integer sayi1, Integer sayi2) {
        return sayi1 + sayi2;
    }

    public static void main(String[] args) {
        HesaplaImplementation hesapla = new HesaplaImplementation();
        Integer toplam = hesapla.topla(10, 10);
        System.out.println(toplam);
    }
}
