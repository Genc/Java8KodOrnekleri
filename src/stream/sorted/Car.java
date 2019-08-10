package stream.sorted;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int releaseDate;

    public Car(String brand, String model, String color, int releaseDate) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.releaseDate = releaseDate;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
