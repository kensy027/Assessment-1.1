package ca1.task4;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    @Test
    public void testEquals_SameModelAndColor() {
        try {
            Car car1 = new Car("Honda", "Civic", "Red");
            Car car2 = new Car("Holden", "Civic", "Red");
            Assert.assertTrue(car1.equals(car2));
            System.out.println("testEquals_SameModelAndColor: Passed");
        } catch (AssertionError e) {
            System.out.println("testEquals_SameModelAndColor: Failed - " + e.getMessage());
        }
    }

    @Test
    public void testEquals_DifferentModelOrColor() {
        try {
            Car car1 = new Car("Honda", "Civic", "Red");
            Car car3 = new Car("Honda", "Accord", "Red");
            Assert.assertFalse(car1.equals(car3));
            System.out.println("testEquals_DifferentModelOrColor: Passed");
        } catch (AssertionError e) {
            System.out.println("testEquals_DifferentModelOrColor: Failed - " + e.getMessage());
        }
    }

    @Test
    public void testHashCode_EqualWhenEqual() {
        try {
            Car car1 = new Car("Honda", "Civic", "Red");
            Car car2 = new Car("Holden", "Civic", "Red");
            Assert.assertEquals(car1.hashCode(), car2.hashCode());
            System.out.println("testHashCode_EqualWhenEqual: Passed");
        } catch (AssertionError e) {
            System.out.println("testHashCode_EqualWhenEqual: Failed - " + e.getMessage());
        }
    }

    @Test
    public void testToString() {
        try {
            Car car = new Car("Honda", "Civic", "Red");
            Assert.assertEquals("Honda, Civic, Red", car.toString());
            System.out.println("testToString: Passed");
        } catch (AssertionError e) {
            System.out.println("testToString: Failed - " + e.getMessage());
        }
    }
}
