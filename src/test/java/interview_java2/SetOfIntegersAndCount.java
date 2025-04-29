package interview_java2;

public class SetOfIntegersAndCount {

	public static void main(String[] args) {
		String s = "p3r53iya4n25k3a";
		int sum = 0;
		String num = "";
		for (int i = 0; i < s.length() ; i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				num += Character.getNumericValue(ch);
			} else {
				if (!num.isEmpty()) {
					sum += Integer.parseInt(num);
					num = "";
				}
			}
		}
		//sum += Integer.parseInt(num);
		System.out.println(sum);
	}

}
