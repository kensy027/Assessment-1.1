package ca1.task4;

import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Arrays;

public class CarProcessingTest {

    private CarProcessing cp = new CarProcessing(); // Create an instance of CarProcessing 

    @Test
    public void testRemoveDuplicates_NoDuplicates() {
        try {
            Car[] cars = {
                new Car("Honda", "Civic", "Red"),
                new Car("Honda", "Accord", "Blue")
            };
            Car[] uniqueCars = cp.removeDuplicates(cars); // Call method on the instance
            Assert.assertTrue(new HashSet<>(Arrays.asList(cars)).equals(new HashSet<>(Arrays.asList(uniqueCars))));
            System.out.println("testRemoveDuplicates_NoDuplicates: Passed");
        } catch (AssertionError e) {
            System.out.println("testRemoveDuplicates_NoDuplicates: Failed - " + e.getMessage());
        }
    }

    @Test
    public void testRemoveDuplicates_SomeDuplicates() {
        try {
            Car[] cars = {
                new Car("Honda", "Civic", "Red"),
                new Car("Holden", "Civic", "Red"),
                new Car("Honda", "Civic", "Blue")
            };
            Car[] expected = {
                new Car("Honda", "Civic", "Red"),
                new Car("Honda", "Civic", "Blue")
            };
            Car[] uniqueCars = cp.removeDuplicates(cars);
            Assert.assertTrue(new HashSet<>(Arrays.asList(expected)).equals(new HashSet<>(Arrays.asList(uniqueCars))));
            System.out.println("testRemoveDuplicates_SomeDuplicates: Passed");
        } catch (AssertionError e) {
            System.out.println("testRemoveDuplicates_SomeDuplicates: Failed - " + e.getMessage());
        }
    }

    @Test
    public void testRemoveDuplicates_AllDuplicates() {
        try {
            Car[] cars = {
                new Car("Honda", "Civic", "Red"),
                new Car("Honda", "Civic", "Red"),
                new Car("Honda", "Civic", "Red")
            };
            Car[] expected = {
                new Car("Honda", "Civic", "Red")
            };
            Car[] uniqueCars = cp.removeDuplicates(cars);
            Assert.assertTrue(new HashSet<>(Arrays.asList(expected)).equals(new HashSet<>(Arrays.asList(uniqueCars))));
            System.out.println("testRemoveDuplicates_AllDuplicates: Passed");
        } catch (AssertionError e) {
            System.out.println("testRemoveDuplicates_AllDuplicates: Failed - " + e.getMessage());
        }
    }
}
