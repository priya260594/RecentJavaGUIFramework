package interview_Java;

public class LogicalJavaProgram {

	public static void main(String[] args) {
		//input=aababbabaabb, output=aabbaabbaabbaa
		// input = aa/babbab/aabb
		//output = aabb/aabb/aabb/aa
		
//		String word = "onetwotwoone";
//				int lenght = word.length(); //Note this should be function.
//				String numbers = word.substring(word.length() - 3);
//				System.out.println(numbers);
		
		String s="aababbabaabb"; //aababbabaa
		String pt1=s.substring(s.length()-4);
		String pt2=s.substring(0,2);
		System.out.println(pt1);
		String result=pt1+""+pt1+""+pt1+""+pt2;
		
		System.out.println(result);
	}

}
