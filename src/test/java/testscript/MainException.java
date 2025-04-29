package testscript;

class InvalidArrayExcep extends Exception{
    public InvalidArrayExcep(String message) {
    	super(message);
    };
}
public class MainException {
    public static void validateException(int[] a)throws InvalidArrayExcep{
        if(a==null){
            throw new InvalidArrayExcep("Array must not be null"); 
        }if(a.length!=4){
            throw new InvalidArrayExcep("Array must not be more");
        }
        System.out.println("Valid Array");
    }
    public static void main(String[] args) {
        try{
            int[] a={2,4,5,2,9};
            validateException(a);
        }catch(Exception e){
            System.out.println("error "+e.getMessage());
        }
       // System.out.println("Try programiz.pro");
    }
}
