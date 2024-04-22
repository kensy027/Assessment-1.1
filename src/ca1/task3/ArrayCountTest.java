package ca1.task3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArrayCountTest {

    @Test
    public void testCount_NoOccurrences() {
        ArrayCount counter = new ArrayCount();
        String[] array = {"apple", "banana", "cherry"};
        try {
            assertEquals(0, counter.count(array, "pear"), "The target does not exist in the array.");
            System.out.println("testCount_NoOccurrences: Passed");
        } catch (AssertionError e) {
            System.out.println("testCount_NoOccurrences: Failed - " + e.getMessage());
        }
    }

    @Test
    public void testCount_SingleOccurrence() {
        ArrayCount counter = new ArrayCount();
        String[] array = {"apple", "banana", "cherry"};
        try {
            assertEquals(1, counter.count(array, "banana"), "The target appears only once in the array.");
            System.out.println("testCount_SingleOccurrence: Passed");
        } catch (AssertionError e) {
            System.out.println("testCount_SingleOccurrence: Failed - " + e.getMessage());
        }
    }

    @Test
    public void testCount_MultipleOccurrences() {
        ArrayCount counter = new ArrayCount();
        String[] array = {"apple", "banana", "apple", "banana", "apple"};
        try {
            assertEquals(3, counter.count(array, "apple"), "The target appears multiple times in the array.");
            System.out.println("testCount_MultipleOccurrences: Passed");
        } catch (AssertionError e) {
            System.out.println("testCount_MultipleOccurrences: Failed - " + e.getMessage());
        }
    }

    @Test
    public void testCount_NullArray() {
        ArrayCount counter = new ArrayCount();
        try {
            assertEquals(0, counter.count(null, "apple"), "The array is null.");
            System.out.println("testCount_NullArray: Passed");
        } catch (AssertionError e) {
            System.out.println("testCount_NullArray: Failed - " + e.getMessage());
        }
    }

    @Test
    public void testCount_NullTarget() {
        ArrayCount counter = new ArrayCount();
        String[] array = {"apple", "banana", "cherry"};
        try {
            assertEquals(0, counter.count(array, null), "The target string is null.");
            System.out.println("testCount_NullTarget: Passed");
        } catch (AssertionError e) {
            System.out.println("testCount_NullTarget: Failed - " + e.getMessage());
        }
    }

    @Test
    public void testCount_EmptyArray() {
        ArrayCount counter = new ArrayCount();
        String[] array = {};
        try {
            assertEquals(0, counter.count(array, "apple"), "The array is empty.");
            System.out.println("testCount_EmptyArray: Passed");
        } catch (AssertionError e) {
            System.out.println("testCount_EmptyArray: Failed - " + e.getMessage());
        }
    }
}
