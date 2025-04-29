package interview_Java;

public class FibonacciDivisibleBy3 {

	public static void main(String[] args) {
		int n1=0,n2=1;int n3;
		for(int i=2;i<20;i++) {
			n3=n1+n2;
			//System.out.println(n3+" ");
			if(n3 % 3 ==0 || n3 % 5==0) {
				System.out.print(n3+" ");
			}
			n1=n2;
			n2=n3;
			
		}

	}

}
