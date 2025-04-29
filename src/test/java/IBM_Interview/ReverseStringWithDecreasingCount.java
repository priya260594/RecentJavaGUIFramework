package IBM_Interview;

public class ReverseStringWithDecreasingCount {

	public static void main(String[] args) {
		String s1 = "hello";
		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev += s1.charAt(i);
		}
		System.out.println(rev);// ==>olleh
		while (rev.length() > 0) {
			rev = rev.substring(0, rev.length() - 1);
			System.out.println(rev);
		}
	}
}
