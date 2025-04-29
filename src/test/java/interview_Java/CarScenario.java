package interview_Java;

class Car {
	String color;
	static int wheels;

	Car(String color) {
		this.color = color;
		wheels++;
	}
}

public class CarScenario {

	public static void main(String[] args) {
		
		Car c1 = new Car("Red");
		System.out.println(c1.wheels);
		Car c2 = new Car("Blue");
		Car c3 = new Car("Green");
	    System.out.println(c1.wheels);
	    Car c5 = new Car("Green");
	    System.out.println(c1.wheels);
	}

}
