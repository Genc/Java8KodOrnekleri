package lambda;

public class OtelOtomasyonu {

    public static void main(String[] args) {

        Resopsiyonist resopsiyonist = () -> { System.out.println("Selamlar"); };
        // Resopsiyonist resopsiyonist = () -> System.out.println("Selamlar");
        resopsiyonist.selamVer();
    }

}
