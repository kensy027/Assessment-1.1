package ca1.task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaesarCypherTest {

    private CaesarCypher cc;

    @BeforeEach
    void setUp() throws Exception {
        cc = new CaesarCypher();
    }

    @Test
    void testEncode() {
        char[] input = {'a', 'b', 'c'};
        char[] expected = {'c', 'd', 'e'};
        assertArrayEquals(expected, cc.encode(input, 2), "Encoding 'abc' with offset 2 should yield 'cde'.");
    }

    @Test
    void testEncodeNegativeOffset() {
        char[] input = {'c', 'd', 'e'};
        char[] expected = {'a', 'b', 'c'};
        assertArrayEquals(expected, cc.encode(input, -2), "Encoding 'cde' with offset -2 should yield 'abc'.");
    }

    @Test
    void testEncodeWrapAround() {
        char[] input = {'y', 'z'};
        char[] expected = {'a', 'b'};
        assertArrayEquals(expected, cc.encode(input, 2), "Encoding 'yz' with offset 2 should wrap around to 'ab'.");
    }

    @Test
    void testEncodeNonAlphabetic() {
        char[] input = {'1', '!', ' '};
        char[] expected = {'1', '!', ' '};
        assertArrayEquals(expected, cc.encode(input, 5), "Non-alphabetic characters should not be altered.");
    }

    @Test
    void testDecode() {
        char[] input = {'c', 'd', 'e'};
        char[] expected = {'a', 'b', 'c'};
        assertArrayEquals(expected, cc.decode(input, 2), "Decoding 'cde' with offset 2 should yield 'abc'.");
    }

    @Test
    void testEmptyInput() {
        char[] input = {};
        char[] expected = {};
        assertArrayEquals(expected, cc.encode(input, 3), "Encoding an empty array should return an empty array.");
    }

	@Test
	void testLargeOffset() {
		char[] input = {'a', 'm'};
		char[] expected = {'y', 'k'};
		assertArrayEquals(expected, cc.encode(input, 50), "Encoding 'am' with a large offset should wrap correctly.");
	}
}