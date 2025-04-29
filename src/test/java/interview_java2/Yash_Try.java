package interview_java2;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Yash_Try {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();	
		int j=0;
		for(int i=j;i<20;i+=2) {
				map.put(i+1, i);	
		}
		System.out.println(map);
		int maxKey=Integer.MIN_VALUE;
		int maxValue=Integer.MIN_VALUE;
		int maxKey1=Integer.MIN_VALUE;
		int maxValue1=Integer.MIN_VALUE;
		int maxKey2=Integer.MIN_VALUE;
		int maxValue2=Integer.MIN_VALUE;
		

		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>maxValue && entry.getKey()>maxKey) {
				maxKey1=maxKey;
				maxKey=entry.getKey();
				maxValue1=maxValue;
				maxValue=entry.getValue();
			}
		}
		System.out.println(maxKey1+" "+maxValue1);
//
//		TreeMap<Integer, Integer> map = new TreeMap<>();
//        
//        // Adding even numbers as keys and odd numbers as values
//        for (int i = 1; i <= 20; i += 2) {
//            map.put(i + 1, i); // (Even, Odd)
//        }
//
//        System.out.println("Map: " + map);
//
//        // Get second max key
//        List<Integer> keys = new ArrayList<>(map.keySet());
//        int secondMaxKey = keys.get(keys.size() - 2);
//
//        // Get second max value
//        List<Integer> values = new ArrayList<>(map.values());
//        int secondMaxValue = values.get(values.size() - 2);
//
//        System.out.println("Second Max Key: " + secondMaxKey);
//        System.out.println("Second Max Value: " + secondMaxValue);

	}

}
