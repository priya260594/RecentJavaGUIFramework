package interview_Java;

class MethodOverridingSample {
	static int a=200;
	public void display() {
		System.out.println("Parent");
	}
}
public class Polymorphism extends MethodOverridingSample {
static int a=10;
	public void display() {
		System.out.println("Child");
	}
	public static void main(String[] args) {
		Polymorphism p =new Polymorphism();
		p.display(); 
		System.out.println(p.a);
		
		MethodOverridingSample m=new  MethodOverridingSample();
		m.display();
		System.out.println(m.a);
		
		Polymorphism p1=(Polymorphism) new MethodOverridingSample();
		p1.display();
		
		}

}
