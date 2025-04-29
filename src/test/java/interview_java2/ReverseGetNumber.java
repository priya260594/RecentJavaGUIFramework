package interview_java2;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseGetNumber {

	public static void main(String[] args) {
		String s = "Aabb1235dd45ee1ff44"; // output:( 44,1,45, 1235)
		ArrayList<String> li = new ArrayList<String>();
		String s1 = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				s1 += s.charAt(i);
			} else {
				if (!s1.isEmpty()) {
					li.add(s1);
					s1 = "";
				}
			}
		}
		li.add(s1);
		Collections.reverse(li);
		System.out.println((li));

	}

}
