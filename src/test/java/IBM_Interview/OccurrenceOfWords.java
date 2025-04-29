package IBM_Interview;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class OccurrenceOfWords {

	public static void main(String[] args) {
		String s1="Malayalam is my is native language language native language Malayalam";
		String[] s=s1.split(" ");
//		String minValue="";
//		for(int i=0;i<s.length;i++) {
//			int count=1;
//			if(!s[i].equals(minValue)) {
//			   for(int j=i+1;j<s.length;j++) {
//				  if(s[i].equals(s[j])) {
//					count++;
//					s[j]=minValue;
//				   }
//				}
//			System.out.println(s[i]+" ==>"+count);
//			}
//		}
		////collections
//		LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
//		for(int i=0;i<s.length;i++) {
//		if(map.containsKey(s[i])) {
//			map.put(s[i], map.get(s[i])+1);
//		}else {
//			map.put(s[i], 1);
//		}
//		}
//		System.out.println(map);
		
		//2nd approach
//		for(int i=0;i<s.length;i++) {
//			if(Arrays.asList(s).indexOf(s[i])==i) {
//				System.out.print(s[i]+" ");
//			}
//		}
		
		//Remove duplicates
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		String[] temp=new String[s.length];
		int j=0;
		for(int i=0;i<s.length-1;i++) {
			if(!s[i].equals(s[i+1])) {
				temp[j++]=s[i];
			}
		}
		temp[j]=s[s.length-1];
		System.out.println(Arrays.toString(temp));
		String[] c=Arrays.copyOf(temp, j+1);
		System.out.println(Arrays.toString(c));
		

	}

}
