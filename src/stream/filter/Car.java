package stream.filter;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int releaseDate;

    public Car() {
    }

    public Car(String brand, String model, String color, int releaseDate) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.releaseDate = releaseDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
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
