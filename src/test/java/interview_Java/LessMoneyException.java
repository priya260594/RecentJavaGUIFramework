package interview_Java;

public class LessMoneyException extends Exception {
    private String message;
    LessMoneyException(String message){
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
    public static void buyProduct(int price) throws LessMoneyException{
        if(price>=1500){System.out.println("Buy the product");}
         throw new LessMoneyException("No balance");
    }
    public static void main(String[] args) {
     try{ buyProduct(600);}
     catch(LessMoneyException e){System.out.println(e.getMessage());}
     
    }
}
