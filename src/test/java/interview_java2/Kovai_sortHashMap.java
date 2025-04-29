package interview_java2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Kovai_sortHashMap {
	static int in=10;
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		
		in=3;
		System.out.println(in);
		map.put("Math", 95);
		map.put("Science", 90);
		map.put("Hindi", 89);
		map.put("English", 80);
		map.put("Social Science", 91);

		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.comparingByValue());
		
		System.out.println(list);
		
		///////without sort
		List<Map.Entry<String, Integer>> list2=new ArrayList<>(map.entrySet());
		for(int i=0;i<list2.size();i++) {
			for(int j=i+1;j<list2.size();j++) {
				if(list2.get(i).getValue()>list2.get(j).getValue()) {
					Map.Entry<String,Integer> temp=list2.get(i);
					list2.set(i, list2.get(j));
					list2.set(j, temp);
				}
			}
		}
		System.out.println(list2);
		
//		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
//		for(Map.Entry<String, Integer> entry:list) {
//			map2.put(entry.getKey(), entry.getValue());
//		}
//		System.out.println(map2);
//		 for (Map.Entry<String, Integer> entry : map2.entrySet()) {
//	            System.out.println(entry.getKey() + ": " + entry.getValue());
//	        }
		//System.out.println(map2);

	}

}
