package interview_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class ArrayListExamples {

	public static void main(String[] args) {
		String[] s= {"rad","jyo","mahe","kap","mahe"};
		Integer[] i= {2,4,5,1,3,7};
		ArrayList<Integer> li=new ArrayList<>(Arrays.asList(i));
		System.out.println(li);
//		List<String> li2=new ArrayList<>(Arrays.asList("rad","devi","mahe"));
//		//li.addAll(li2);
//		//li.retainAll(li2);
//		//li2.clear();
//	li.add(0, "d");
	System.out.println(li.indexOf("mahe"));
//	System.out.println(li);
//	System.out.println(li.lastIndexOf("mahe"));
////		ListIterator<String> it = li2.listIterator(li.size());
////		while(it.hasPrevious()) {
////			System.out.println(it.previous());
////		}
//	System.out.println(li.equals("jyo"));
		
		LinkedHashMap<String,Integer> map=new LinkedHashMap<String, Integer>();
		map.put("Priya", 4);
		map.put("Devi", 5);
		map.put("Viha", 1);
		map.remove("Viha");
		System.out.println(map.size());
		System.out.println(map.get("Priya"));
		
	
	
		
	}

}
