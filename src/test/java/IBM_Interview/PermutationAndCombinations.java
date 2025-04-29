package IBM_Interview;

public class PermutationAndCombinations {

	public static void main(String[] args) {
		String s = "abcd";
		permute(s, "");
	}

	public static void permute(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String remainingString = s.substring(0, i) + s.substring(i + 1);
			permute(remainingString, ans + ch);
		}
	}

}
