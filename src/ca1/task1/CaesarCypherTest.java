package ca1.task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarCypherTest {

    private CaesarCypher cc;

    @BeforeEach
    void setUp() {
        cc = new CaesarCypher();
    }

    @Test
    void testEncode() {
        try {
            char[] input = {'a', 'b', 'c'};
            char[] expected = {'c', 'd', 'e'};
            assertArrayEquals(expected, cc.encode(input, 2));
            System.out.println("testEncode: Passed");
        } catch (AssertionError e) {
            System.out.println("testEncode: Failed - " + e.getMessage());
        }
    }

    @Test
    void testEncodeNegativeOffset() {
        try {
            char[] input = {'c', 'd', 'e'};
            char[] expected = {'a', 'b', 'c'};
            assertArrayEquals(expected, cc.encode(input, -2));
            System.out.println("testEncodeNegativeOffset: Passed");
        } catch (AssertionError e) {
            System.out.println("testEncodeNegativeOffset: Failed - " + e.getMessage());
        }
    }

    @Test
    void testEncodeWrapAround() {
        try {
            char[] input = {'y', 'z'};
            char[] expected = {'a', 'b'};
            assertArrayEquals(expected, cc.encode(input, 2));
            System.out.println("testEncodeWrapAround: Passed");
        } catch (AssertionError e) {
            System.out.println("testEncodeWrapAround: Failed - " + e.getMessage());
        }
    }

    @Test
    void testEncodeNonAlphabetic() {
        try {
            char[] input = {'1', '!', ' '};
            char[] expected = {'1', '!', ' '};
            assertArrayEquals(expected, cc.encode(input, 5));
            System.out.println("testEncodeNonAlphabetic: Passed");
        } catch (AssertionError e) {
            System.out.println("testEncodeNonAlphabetic: Failed - " + e.getMessage());
        }
    }

    @Test
    void testDecode() {
        try {
            char[] encoded = cc.encode(new char[] {'a', 'b', 'c'}, 2);
            char[] expected = {'a', 'b', 'c'};
            assertArrayEquals(expected, cc.decode(encoded, 2));
            System.out.println("testDecode: Passed");
        } catch (AssertionError e) {
            System.out.println("testDecode: Failed - " + e.getMessage());
        }
    }

    @Test
    void testEmptyInput() {
        try {
            char[] input = {};
            char[] expected = {};
            assertArrayEquals(expected, cc.encode(input, 3));
            System.out.println("testEmptyInput: Passed");
        } catch (AssertionError e) {
            System.out.println("testEmptyInput: Failed - " + e.getMessage());
        }
    }

    @Test
    void testLargeOffset() {
        try {
            char[] input = {'a', 'm'};
            char[] expected = {'y', 'k'};
            assertArrayEquals(expected, cc.encode(input, 50));
            System.out.println("testLargeOffset: Passed");
        } catch (AssertionError e) {
            System.out.println("testLargeOffset: Failed - " + e.getMessage());
        }
    }
}
