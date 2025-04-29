package IBM_Interview;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LongestPalindromeInSubstring {

	public static void main(String[] args) {
	String s="abaabaacax";//"abaabaacax"; 
	LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
	String stTemp="";
	for(int i=0;i<=s.length();i++) {
		for(int j=i+1;j<=s.length();j++) {
			String s1=s.substring(i,j);
			if(checkPalindrome(s1)==true) { //aabaa
				if(stTemp.length()<s1.length()) {
					stTemp=s1;	
		        }
	         }
	       }
	}
		System.out.println(stTemp);
	}
public static boolean checkPalindrome(String s) {
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev+=s.charAt(i);
	}
	if(s.equals(rev)) {
		return true;
	}else {return false;}}

//	if(map.containsKey(s1)) {
//	map.put(s1, map.get(s1)+1);
//}else {
//	map.put(s1, 1);
//}
//	String maxKey="";
//	int maxKeyLength=Integer.MIN_VALUE;
//
//	//for(Map.Entry<String, Integer> entry:map.entrySet())  /// in online compiler
//	for(Entry<String, Integer> entry:map.entrySet()) {
//		if(entry.getKey().length()>maxKeyLength) {
//			maxKey=entry.getKey();
//			 maxKeyLength=entry.getKey().length();
//			 
//		}
//	}
//	System.out.println(maxKey);
	
}
