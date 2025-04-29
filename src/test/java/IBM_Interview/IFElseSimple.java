package IBM_Interview;

public class IFElseSimple {

	public static void main(String[] args) {
	    for(int i=1;i<=20;i++){
            if(i%2==0 && i%3==0){
                System.out.println("WebDriver"+"======>"+i);
            } else if(i%2==0){
                System.out.println("Java"+"======>"+i);
            }
            else if(i%3==0){
                System.out.println("Selenium"+"======>"+i);
            }
        }

	}

}
