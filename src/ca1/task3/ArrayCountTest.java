package ca1.task3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArrayCountTest {

    @Test
    public void testCount_NoOccurrences() {
        ArrayCount counter = new ArrayCount();
        String[] array = {"apple", "banana", "cherry"};
        assertEquals(0, counter.count(array, "pear"), "The target does not exist in the array.");
    }

    @Test
    public void testCount_SingleOccurrence() {
        ArrayCount counter = new ArrayCount();
        String[] array = {"apple", "banana", "cherry"};
        assertEquals(1, counter.count(array, "banana"), "The target appears only once in the array.");
    }

    @Test
    public void testCount_MultipleOccurrences() {
        ArrayCount counter = new ArrayCount();
        String[] array = {"apple", "banana", "apple", "banana", "apple"};
        assertEquals(3, counter.count(array, "apple"), "The target appears multiple times in the array.");
    }

    @Test
    public void testCount_NullArray() {
        ArrayCount counter = new ArrayCount();
        assertEquals(0, counter.count(null, "apple"), "The array is null.");
    }

    @Test
    public void testCount_NullTarget() {
        ArrayCount counter = new ArrayCount();
        String[] array = {"apple", "banana", "cherry"};
        assertEquals(0, counter.count(array, null), "The target string is null.");
    }

    @Test
    public void testCount_EmptyArray() {
        ArrayCount counter = new ArrayCount();
        String[] array = {};
        assertEquals(0, counter.count(array, "apple"), "The array is empty.");
    }
}
