package interview_Java;

public abstract class SampleAbsDriver {
	abstract void display();
	
	{
		System.out.println("hi");
	}
	static {
		System.out.println("hi all");
	}
	int a = 10;
	static int b = 20;
	
	public SampleAbsDriver() {
		System.out.println("No arg constructor");
	}
	
	public SampleAbsDriver(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public SampleAbsDriver(int a) {
		super();
		this.a = a;
	}

	void m1() {
		System.out.println("m1 starts");
	}
	
	static void m2() {
		System.out.println("m2 starts");
	}
	

}
