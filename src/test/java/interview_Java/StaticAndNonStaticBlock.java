package interview_Java;

public class StaticAndNonStaticBlock {
	static {
		System.out.println("static block executed");
	}
	{
		System.out.println("non-static block executed");
	}
	
	public static void main(String[] args) {
		StaticAndNonStaticBlock st1=new StaticAndNonStaticBlock();
		StaticAndNonStaticBlock st2=new StaticAndNonStaticBlock();
		System.out.println("Method ends");
	}

}
