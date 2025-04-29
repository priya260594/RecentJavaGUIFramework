package interview_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PalindromeUsingIterator {

	public static void main(String[] args) {
		String s="madam";
		List<Character> txt=new ArrayList<Character>();
		for(char c:s.toCharArray()) {
			txt.add(c);
		}
		ListIterator<Character> it=txt.listIterator(txt.size());
		StringBuilder sb=new StringBuilder();
		while(it.hasPrevious()) {
			sb.append(it.previous());
		}
		System.out.println(sb);
		

	}

}
