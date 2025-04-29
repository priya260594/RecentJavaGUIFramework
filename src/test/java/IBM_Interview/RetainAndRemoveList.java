package IBM_Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class RetainAndRemoveList {

	    public static void main(String[] args) {
//	   Integer a[]= {10, 20, 30, 40, 50, 60};
//	   Integer b[]= {20, 25, 30, 40, 50, 65, 70};
	   
//	   int a[]= {10, 20, 30, 40, 50, 60};
//	   int b[]= {20, 25, 30, 40, 50, 65, 70};
//	   
//	   int[] c=new int[a.length+b.length];
//	   int position=0;
//	   int min=Integer.MIN_VALUE;
//	   for(int ar:a) {c[position++]=ar;}
//	   for(int ar:b) {c[position++]=ar;}
//	   Arrays.sort(c);
//	   for(int i=0;i<c.length-1;i++) {
//		   if(c[i]==c[i+1]) {
//			   c[i]=min;
//			   c[i+1]=min;
//		   }
//		   if(c[i]!=min) {
//			   System.out.print(c[i]+" ");
//		   }
//		   }
//	   System.out.print(c[c.length-1]);
//	   }
	   
	    int a[]= {10, 20, 30, 40, 50, 60};
		int b[]= {20, 25, 30, 40, 50, 65, 70};
		   
	   ArrayList<Integer> list1=new ArrayList<Integer>();
	   for(int ar:a) {
		   list1.add(ar);
	   }
	   ArrayList<Integer> list2=new ArrayList<Integer>();
	   for(int ar:b) {
		   list2.add(ar);
	   }
	   ArrayList<Integer> symmetric=new ArrayList<Integer>();
	   for(int ar:a) {
		   symmetric.add(ar);
	   }
	   symmetric.removeAll(list2);
	   System.out.println(symmetric);
	   list2.removeAll(list1);
	   System.out.println(list2);
	   symmetric.addAll(list2);
	   System.out.println(symmetric);
	    }
		 

}
