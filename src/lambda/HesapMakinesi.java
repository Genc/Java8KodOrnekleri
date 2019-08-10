package lambda;

public class HesapMakinesi {
    public static void main(String[] args) {

        Fonksiyon fonksiyon = (Integer sayi1, Integer sayi2) -> {return sayi1 * sayi2 ;};
        Fonksiyon fonksiyon1 = (sayi1,sayi2) -> sayi1 * sayi2;
        Integer sonuc = fonksiyon1.carp(10, 10);
        System.out.println("Çarpım sonucu : " + sonuc);

    }
}
