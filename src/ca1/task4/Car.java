package ca1.task4;
import java.util.Objects;

public class Car {
    private String make;
    private String model;
    private String color;
    
    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }

    @Override
    public String toString() {
        return make + ", " + model + ", " + color;
    }
}
