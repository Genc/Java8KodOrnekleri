package functionalinterface.consumer;

import java.util.function.Consumer;

public class EasyConsumerExample {
    public static void main(String[] args) {
        // accept() metoduna String tipte bir parametre göndererek çalışmasını sağladık.
        Consumer<String> consumer = name -> System.out.println("İsminiz : " + name);
        consumer.accept("Ömer Faruk"); // Çıktı : İsminiz : Ömer Faruk
    }
}