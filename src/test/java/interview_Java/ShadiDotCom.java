package interview_Java;

public class ShadiDotCom extends Exception {
	String msg;
	ShadiDotCom(String msg){
		this.msg=msg;
	}
	public String getMsg() {
		return msg;
	}
public static void buyProduct(int p) throws ShadiDotCom  {
	
	if(p>=1500) {
		System.out.println("u can buy the product");
	}
	throw new ShadiDotCom ("insufficient balance");
}
	public static void main(String[] args) {
		
		try {
			buyProduct(600);
		}catch (ShadiDotCom e) {
			System.out.println(e.getMsg());
		}
		

	}

}

