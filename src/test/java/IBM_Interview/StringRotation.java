package IBM_Interview;

public class StringRotation {

	public static void main(String[] args) {
		String s1="ABC xyz";
		String s2=s1.substring(4);    //xyz
		for(int i=0;i<s2.length();i++) {
		s2=s2.substring(1)+s2.charAt(0);  
		System.out.print("abc "+s2+", ");
		}

	}

}
