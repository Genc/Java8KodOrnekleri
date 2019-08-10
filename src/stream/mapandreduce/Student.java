package stream.mapandreduce;

public class Student {

    private String name;
    private Integer examResult;

    public Student(String name, Integer examResult) {
        this.name = name;
        this.examResult = examResult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExamResult() {
        return examResult;
    }

    public void setExamResult(Integer examResult) {
        this.examResult = examResult;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", examResult=" + examResult +
                '}';
    }
}
