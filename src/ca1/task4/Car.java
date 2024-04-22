package ca1.task4;
import java.util.Objects;

public class Car {
    private String make;
    private String model;
    private String color;
    
	/**
     * Constructs a new Car instance.
     *
     * @param make  The make of the car (e.g., Honda).
     * @param model The model of the car (e.g., Civic).
     * @param color The color of the car (e.g., Red).
     */

    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

	/**
     * Checks if this Car is equal to another object.
     * If the other object is a Car and has the same model and color,
     * then the two cars are considered equal.
     *
     * @param o The object to compare this Car against.
     * @return true if the given object represents a Car equivalent to this car, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }
	/**
     * Generates a hash code for this Car.
     * The hash code is generated using the model and color attributes.
     *
     * @return A hash code value for this Car.
     */
    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }
	
	/**
     * Returns a string representation of this Car.
     * The string is formatted as "make, model, color".
     *
     * @return A string representation of this Car.
     */
    @Override
    public String toString() {
        return make + ", " + model + ", " + color;
    }
}
