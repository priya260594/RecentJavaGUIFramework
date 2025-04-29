package interview_Java;

public class Driver extends SampleAbsDriver {
	
	void display() {
		System.out.println("Driver executed");
	}

	public static void main(String[] args) {
		Driver driv = new Driver();
		driv.display();
		System.out.println(driv.a);
		System.out.println(driv.b);
		System.out.println(SampleAbsDriver.b);
		driv.m2();
		driv.m1();
		SampleAbsDriver.m2();

	}

}
