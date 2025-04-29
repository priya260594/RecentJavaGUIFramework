package IBM_Interview;

import java.util.Arrays;

public class RemoveDuplicatesInArrays {

	public static void main(String[] args) {
		int[] s= {1,5,4,5,4,7,4,5,9,0};
		Arrays.sort(s);
		for(int i=0;i<s.length-1;i++) {
			if(s[i]!=s[i+1]) {
				System.out.println(s[i]);
			}
		}
		System.out.println(s[s.length-1]);

	}

}
