package interview_Java;

public class ProductException extends Exception {
	String message;
	ProductException(String message){
	this.message=message;}
	public String getMessage(){
	return message;}

	public void buyProduct(int price) throws ProductException {
	if(price>=2000){
	System.out.println("Sufficient Balance to buy product");
	}else {
	throw new ProductException("Insufficient Balance");
	}
	}

}
