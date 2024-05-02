package copyObjects;

public class Main {
	
	//Copy Objects Lessons

	public static void main(String[] args) {
		
		Car car1 = new Car();
		//Car car2 = new Car();

		car1 = new Car("Tesla","Truck",2020);
		//car2 = new Car("Ford","Truck",2015);
		
		//Copy method 
		//car2.copy(car1);// They have different addresses but have the same attributes 
		
		
		Car car2 = new Car(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
	}

}
