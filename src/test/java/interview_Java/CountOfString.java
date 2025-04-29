package interview_Java;

import java.util.LinkedHashMap;

public class CountOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ppryiyannka";
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}else {
				map.put(ch,1 );
			}
		}
		System.out.println(map);
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.length());
	
	int count=0;
//		int index=0;
//		while(index<s.length()) {
//			count++;
//			index++;
//		}
//		System.out.println(count);
	

	}

}
