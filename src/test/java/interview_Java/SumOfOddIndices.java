package interview_Java;

public class SumOfOddIndices {

	public static void main(String[] args) {
		int []a = {1,5,3,6,4,6,3,7};
		int sum=0;
		for(int i=0;i<a.length;i+=2) {
			sum+=a[i];
		}
		System.out.println(sum);

	}

}
 						

