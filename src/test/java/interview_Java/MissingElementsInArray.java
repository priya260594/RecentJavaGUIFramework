package interview_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class MissingElementsInArray {

	public static void main(String[] args) {
//	int[] a= {1,5,2,5,7,2,6};
//	LinkedHashSet<Integer> set=new LinkedHashSet<>();
//	for(Integer ar:a) {
//		set.add(ar);
//	}
//	ArrayList<Integer> missingEle=new ArrayList<Integer>();
//	
//	for(int i=1;i<=7;i++) {
//		if(!set.contains(i)) {
//			missingEle.add(i);
//		}
//	}
//	
//	System.out.println((missingEle));
		
		int[] a= {5,2,5,7,2,6};
		Arrays.sort(a);
		int startRange=a[0];
		int endRange=a[a.length-1];
		//for(int i=1;i<8;i++) {
		for(int i=startRange;i<=endRange;i++) {
		
			boolean flag=false;
			for(int j=0;j<a.length;j++) {
				if(a[j]==i) {
				flag=true;
				break;
				}	
			}
			if(flag==false) {
				System.out.print(i+" ");
			}
		}

	}

}
