package interview_Java;

import java.util.Arrays;

public class InsertStringInBetweenArray {

	public static void main(String[] args) {
		String[] s= {"hi","how","you","Priya","anka"};
		String newS ="are";
		int mid=s.length/2;
		String [] sh=new String[s.length+1];
		for(int i=0;i<mid;i++) {
			sh[i]=s[i];
		}
		sh[mid]=newS;
		for(int i=mid;i<s.length;i++) {
			sh[i+1]=s[i];
		}
		System.out.println(Arrays.toString(sh));
	}

}
