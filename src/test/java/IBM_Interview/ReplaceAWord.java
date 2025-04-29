package IBM_Interview;

public class ReplaceAWord {

	public static void main(String[] args) {
		   String sh="I am waiting here";
		     String[] s=sh.split(" ");
		     for(int i=0;i<s.length;i++){
		         if(s[i].equals("waiting")){
		             for(int j=s[i].length()-1;j>=0;j--){
		                 String rev="";
		                 rev+=s[i].charAt(j);
		                 System.out.print(rev);  
		             }System.out.print(" ");
		            }
		         else {
		        	 System.out.print(s[i]+" ");
		         }
		     }

	}

}
