package model;
public class Car {
    private String brand;
    private int year;
    private String color;
    public Car() { }
    public Car(String brand, int year, String color) {
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}
