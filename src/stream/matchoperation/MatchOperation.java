package stream.matchoperation;

import java.util.Arrays;
import java.util.List;

public class MatchOperation {
    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Ömer", "Faruk", "Mustafa", "Mahmut", "Zeynep", "Fatma", "Kerem", "Beril");

        boolean anyMatch = nameList.stream().anyMatch(name -> name.startsWith("X"));
        boolean allMatch = nameList.stream().allMatch(name -> name.length() == 5);
        boolean noneMatch = nameList.stream().noneMatch(name -> name.endsWith("k"));
        System.out.println(anyMatch + " " + allMatch + " " + noneMatch); // Çıktı : false, false, false olacaktır.

        // Sebebini şu şekilde açıklayalım.
        // anyMatch için listedeki isimlerden herhangi birisi X ile başlıyor mu ? Hayır o halde false dön.
        // allMatch için listedeki isimlerden hepsinin uzunluğu 5 mi ? Hayır. 5 olan var ama hepsinin uzunluğu 5 olması gerekir, false dön.
        // noneMatch için listedeki isimlerden hiç biri k ile bitmemesi gerekir. Ancak Faruk bu durumu bozar o yüzden false dön.
    }
}