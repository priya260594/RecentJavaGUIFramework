package interview_Java;

public class PrimeNumberAddition {
public static void main(String[] args) {
	boolean a=isprime();
	System.out.println(a);
}
public static boolean isprime() {

	boolean flag=false;
	for(int n=2;n<=100;n++) {
	if(n==0 || n==1) {
		System.out.println(n+" is not prime no");
	}else {
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			flag=true;
		}
	}
	}
}
	return flag;
}
}
