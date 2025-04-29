package interview_Java;

import java.util.HashMap;
import java.util.Map;

public class SearchMostRepeatedPalindrome {

	public static void main(String[] args) {
		String sh="mom dad child dad mom dad mom mom";
		String[] s=sh.split(" ");
		HashMap<String,Integer> map=new HashMap<>();
		
		for(int i=0;i<s.length;i++) {
			if(isPalindrome(s[i])==true) {
				if(map.containsKey(s[i])) {
					map.put(s[i], map.get(s[i])+1);
				}else {
					map.put(s[i], 1);
				}
			}
		}
		System.out.println(map);
		String maxKey="";
		int maxValue=Integer.MIN_VALUE;
		for(Map.Entry<String,Integer> entry:map.entrySet()) {
			if(entry.getValue()>maxValue) {
				// maxValue=entry.getValue();
				 maxKey=entry.getKey();
				
			}
		}
		System.out.print(maxKey);
}
	
	public static boolean isPalindrome(String s) {
		boolean flag=false;
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		return sb.toString().equals(s);
	}

}
