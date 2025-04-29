package testscript;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class JavaProgram {

	public static void main(String[] args) {
		float s=1342.679654f;
//		float f=Float.parseFloat(String.format("%.2f", s));
//		System.out.println(f);
		BigDecimal big=new BigDecimal(s).setScale(3,RoundingMode.HALF_UP);
		System.out.println(big);

	}

}
