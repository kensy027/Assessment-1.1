package ca1.task1;

public class CaesarCypher {
	/**
     * Encodes the given array of characters using the Caesar cipher.
     * Only alphabetic characters are shifted; others remain unchanged.
     *
     * @param input the array of characters to encode.
     * @param offset the number of positions to shift each character.
     * @return the encoded array of characters.
     */
    public char[] encode(char[] input, int offset) {
        char[] result = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            if (Character.isAlphabetic(input[i])) {
                char base = Character.isLowerCase(input[i]) ? 'a' : 'A';
                result[i] = (char) ((input[i] - base + offset) % 26 + base);
            } else {
                result[i] = input[i];
            }
        }
        return result;
    }

	/**
     * Decodes the given array of characters that were encoded using the Caesar cipher.
     * @param input the array of characters to decode.
     * @param offset the number of positions that were shifted during encoding.
     * @return the decoded array of characters.
     */
    public char[] decode(char[] input, int offset) {
        return encode(input, -offset);
    }
}
