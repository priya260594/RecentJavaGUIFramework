package interview_Java;

public class ReverseAString {

	public static void main(String[] args) {
		String s="java is wonderful language";
		//Reverse entire string
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println();
		//reverse each string
	String[] st=s.split(" ");
		for(int j=0;j<st.length;j++) {
		for(int i=st[j].length()-1;i>=0;i--) {
			System.out.print(st[j].charAt(i));
		}
		System.out.print(" ");
		}
		
		System.out.println();
		System.out.println();
		
		//reverse each string
		for(int i=0;i<st.length;i++) {
		StringBuilder sb=new StringBuilder(st[i]);
		sb.reverse().append(" ");
		System.out.print(sb);
		}
		

	}

}
