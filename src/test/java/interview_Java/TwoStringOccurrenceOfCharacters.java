package interview_Java;

import java.util.LinkedHashMap;
import java.util.Map;

public class TwoStringOccurrenceOfCharacters {

	public static void main(String[] args) {
		String s1="priyanka";
	    String s2="kalpana";
		//int leng=Math.max(s1.length(), s2.length());
		Map<Character,Integer> map1=new LinkedHashMap<Character, Integer>();
		Map<Character,Integer> map2=new LinkedHashMap<Character, Integer>();
		map1=charCount(s1);
		map2=charCount(s2);
		System.out.println(map1);
		System.out.println(map2);
		compareMap(map1,map2);
	}
	public static Map<Character,Integer> charCount(String s) {
		Map<Character,Integer> map=new LinkedHashMap<Character, Integer>();
		for(Character ch:s.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		return map;
	}
	public static void compareMap(Map<Character,Integer> map1,Map<Character,Integer> map2) {
		for(Map.Entry<Character,Integer> entry:map1.entrySet()) {
			char  c=entry.getKey();
		int i=entry.getValue();
			int i2=map2.getOrDefault(c, 0);
			//System.out.println(i2);
			if(i>i2) {
				System.out.println("Charcter "+c+" occurs more times in String 1 (" +i+" times)");
			}else if(i2>i){
				System.out.println("Charcter "+c+" occurs more times in String 2 (" +i2+" times)");
			}
			
		}
		for(Map.Entry<Character,Integer> entry:map2.entrySet()) {
			char  c=entry.getKey();
			if(!map1.containsKey(c)) {
				System.out.println("Charcter "+c+" occurs more times in String 2 (" +entry.getValue()+" times)");
			}
		}
	}
	
}
