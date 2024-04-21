package ca1.task3;

public class ArrayCount {

    /**
     * Counts the occurrences of a specific target string within an array.
     *
     * @param array the array of strings to search within
     * @param target the string to count within the array
     * @return the number of times the target string appears in the array
     */
    public int count(String[] array, String target) {
        if (array == null || target == null) {
            return 0;
        }

        int count = 0;
        for (String item : array) {
            if (target.equals(item)) {
                count++;  // Increment count if the current item matches the target
            }
        }
        return count;
    }
}
