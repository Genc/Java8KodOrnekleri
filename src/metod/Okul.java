package metod;

public class Okul {
    public static void main(String[] args) {

        //Ogrenci ogrenci = Okul::hesaplaStatic;
        Okul okul = new Okul();
        Ogrenci ogrenci = okul::hesapla;
        Double not = ogrenci.notHesapla(40.0, 50.0);
        System.out.println("Notunuz : " + not);
    }

    public static Double hesaplaStatic(Double vizeNotu,Double finalNotu){
        return vizeNotu * 0.4 + finalNotu * 0.6;
    }

    public Double hesapla(Double vizeNotu,Double finalNotu){
        return vizeNotu * 0.4 + finalNotu * 0.6;
    }
}

