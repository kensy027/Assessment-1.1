package ca1.task4;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class CarProcessing {
	public static void main(String[] args) {
		
		CarProcessing cp = new CarProcessing();
		
		Car[] cars = { 
				new Car("Honda", "Civic", "Red"),
				new Car("Holden", "Civic", "Red"),
				new Car("Jeep", "Wrangler", "Blue"),
				new Car("Jeep", "Wrangler", "Green"),
				new Car("Holden", "Falcon", "Yellow"),
				new Car("Honda", "Civic", "Blue"),
				new Car("Honda", "Falcon", "Blue"),
				new Car("Honda", "Civic", "Purple")
		};
		
		Car[] noDuplicates = cp.removeDuplicates(cars);
		
		for(Car c : noDuplicates ) {
			System.out.println(c);
		}
	}
	/* The method uses a HashSet to maintain a collection of unique Car objects. Since the Car class
	* has overridden equals and hashCode to consider only model and color for comparison,
	* the HashSet will use these methods to prevent adding duplicate Car objects.
	*
	* @param inputArray The array of Car objects that may contain duplicates.
	* @return A new array of Car objects with duplicates removed.
	*/
	public Car[] removeDuplicates(Car[] inputArray) {
        Set<Car> carSet = new HashSet<>(Arrays.asList(inputArray)); // Create a HashSet from the array of Car objects. Duplicates are identified by the model and color of the Car objects and automatically removed.
        return carSet.toArray(new Car[0]);// Convert the HashSet back to an array of Car objects and return it. The new array will not contain any duplicate Car objects.
    }
}
