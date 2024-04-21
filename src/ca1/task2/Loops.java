package ca1.task2;

import java.util.Scanner;

public class Loops {

    /**
     * Prints the word "words" the specified number of times.
     *
     * @param numberOfTimes the number of times to print "words".
     */
    public void printWords(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("words");
        }
    }

    /**
     * Main method to test the printWords method.
     * Reads the number of times to print from the user.
     *
     * @param args command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the number of times to print 'words': ");
        int numberOfTimes = scanner.nextInt();

        Loops loops = new Loops();
        loops.printWords(numberOfTimes); // Call the method with user input

        scanner.close();
    }
}
