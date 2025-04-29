package interview_Java;

public class SumOfDiagonal {

	public static void main(String[] args) {
		int[][] a= {{1,2,2},
				    {2,5,6},
				    {7,8,9}};
		int sum1=0;
		int sum2=0;//secondary diagonam
		int n=a.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					sum1+=a[i][j];}
				 if(i+j==n-1) {
					sum2+=a[i][j];
				}
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
//		int sum=0;
//		int n=a.length;
//		for(int i=0;i<n;i++) {
//			sum+=a[i][n-1-i];
//		}
//		System.out.println(sum);
	}

}
