package defaultMethod;

public class HesaplaDeneme {

    public static void main(String[] args) {
        Hesapla hesapla = new Hesapla() {
            @Override
            public Integer topla(Integer sayi1, Integer sayi2) {
                return sayi1 + sayi2;
            }
        };

        Integer sonuc1 = hesapla.topla(5, 5);
        Integer sonuc2 = hesapla.kareAl(4);
        System.out.println("Toplama sonucu : " + sonuc1);
        System.out.println("Kare sonucu : " + sonuc2);
    }
}
