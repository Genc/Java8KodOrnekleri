package stream.mapandreduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapAndReduceExample {
    public static void main(String[] args) {
        Student student1 = new Student("Faruk", 60);
        Student student2 = new Student("Ömer", 40);
        Student student3 = new Student("Yakup", 70);
        Student student4 = new Student("Mehmet", 10);
        Student student5 = new Student("Ayşe", 25);
        Student student6 = new Student("Hayri", 66);
        Student student7 = new Student("Zeynep", 34);
        Student student8 = new Student("Kerem", 15);

        List<Student> studentList = Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8);
        Stream<Student> stream = studentList.stream();
        Stream<Student> studentStream = stream.filter(student -> student.getExamResult() > 50);
        Stream<Integer> getExamResults = studentStream.map(student -> student.getExamResult());
        Integer result = getExamResults.reduce(0, (ilk, son) -> ilk + son);
        System.out.println(result); // Çıktı : 196 olacaktır. 60 + 40 + 70 + 66 = 196

        // Ben biraz uzun yazdım anlaşılması amacıyla kısa şekilde yazmak istersek şu şekilde yapabiliriz.

        Stream<Student> shortStream = studentList.stream();
        Integer result2 = shortStream.filter(s -> s.getExamResult() > 50).map(s -> s.getExamResult()).reduce(0, (ilk, son) -> ilk + son);
        System.out.println(result2); // Çıktı : 196

    }
}
