package interview_Java;

public class SegregateNoAndString {

	public static void main(String[] args) {
		String s="s24ycd5y98vd9";
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		for(char c:s.toCharArray()) {
			if(c>='0' && c<='9') {
			//if(Character.isDigit(c)){
				sb1.append(c);
			}
			else if(c>='a' && c<='z') {
				//else if(Character.isAlphabetic(c)) {
				sb2.append(c);
			}
		}
System.out.println(sb1);
System.out.println(sb2);
	}

}
