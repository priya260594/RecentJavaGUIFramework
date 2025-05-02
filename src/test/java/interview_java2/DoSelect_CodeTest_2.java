package interview_java2;

public class DoSelect_CodeTest_2 {

	public static void main(String[] args) {
		 int num=135789;  //logic:1st num-2nd num .... and adding all and print +ve value in end
	        int sum=calculate(num);
	        System.out.println(Math.abs(sum));
	    }
	    public static int calculate(int num){
	        String s=String.valueOf(num);
	        int sum=0;
	        if(s.length()>1){
	        for(int i=0;i<s.length()-1;i++){
	            int currentnum=Character.getNumericValue(s.charAt(i));
	            int recentnum=Character.getNumericValue(s.charAt(i+1));
	            sum+=currentnum-recentnum;
	        }
	            return sum;
	        }
	        else{
	            return num;}
	    }
	}