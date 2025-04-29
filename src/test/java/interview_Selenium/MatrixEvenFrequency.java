package interview_Selenium;

public class MatrixEvenFrequency {

	public static void main(String[] args) {
		int[][] ma= {{1,2,3},{4,5,6}};
		
		int oddCount=0;
		int evenCount=0;
		
		for(int i=0;i<ma.length;i++) {
			for(int j=0;j<ma[i].length;j++) {
				if(ma[i][j]%2==0) {
					evenCount++;
				}else {
					oddCount++;
				}
			}
		}
		
		System.out.println(evenCount);
		System.out.println(oddCount);

	}

}
