package interview_Java;

import java.util.ArrayList;
import java.util.Arrays;

class Sample2 {
	public static void main(String[] args) {
		ArrayList li1=new ArrayList<>(Arrays.asList("fss","sfsf","sfsf"));
		ArrayList li2=new ArrayList<>(Arrays.asList("fss","hgger","drdgterr"));
		System.out.println(li1.retainAll(li2));
		
	}
//	void hi() {
//		System.out.println("hi");
//	}
//	static void display() {
//		System.out.println("parent");
//	}
//}
//class Sample3 extends Sample2{
//		 void hi() {
//			System.out.println("child");
//		}
//}
//public class Sample{
//	public static void main(String[] args) {
//		Sample3 s=new Sample3();
//		s.hi();
//
//	}

}
