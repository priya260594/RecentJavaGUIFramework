package interview_Java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccurrenceOfNumberInArray {

	public static void main(String[] args) {
		int[] a={1,4,6,3,2,1,4,2,8};
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		System.out.println(map);
		for(Entry<Integer, Integer> entry: map.entrySet()) {
			//if(entry.getValue()>1) {
				System.out.println(entry.getKey()+"=="+entry.getValue());
			//}
		}

	}

}
