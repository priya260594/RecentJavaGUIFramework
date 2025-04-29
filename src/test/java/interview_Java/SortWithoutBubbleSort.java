package interview_Java;

public class SortWithoutBubbleSort {

	public static void main(String[] args) {
		int[] a= {7,-3,0,2,1,-9};
		int fir=Integer.MIN_VALUE;
		int sec=Integer.MIN_VALUE;
		int thi=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>fir) {
				thi=sec;
				sec=fir;
				fir=a[i];
				
			}else if(a[i]>sec && a[i]!=fir) {
				thi=sec;
				sec=a[i];
			}else if(a[i]>thi && a[i]!=fir && a[i]!=sec) {
				thi=a[i];
			}
		}
		System.out.println(fir);
		System.out.println(sec);
		System.out.println(thi);

	}

}
