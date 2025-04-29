package interview_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MoneyDenominations {

	public static void main(String[] args) {
		//int[] denominations= {2000,1000,500,100,50,20,10,5,2,1};
		List<Integer> denominations=new ArrayList<>(Arrays.asList(2000,1000,500,100,50,20,10,5,2,1));
//		Collections.sort(denominations);
//		System.out.println(denominations);
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		int amount=7225;
		for(int denomination:denominations) {
			if(amount>=denomination) { 
				int count=amount/denomination;
				amount%=denomination;
				System.out.println(amount);
				System.out.print(denomination+" * "+count+", ");
				map.put(denomination, count);
			}
		}
        System.out.println(map);
	}

}
