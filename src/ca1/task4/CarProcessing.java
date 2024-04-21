package ca1.task4;

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
	
	public Car[] removeDuplicates(Car[] inputArray) {
		return null;
	}
	
}
