package IBM_Interview;

public class Zopsmart_consecutiveRemove {

	public static void main(String[] args) {
	        String s="bcccbaaa";//==>abddb, abb,a
	        String str=generateCount(s);
	        System.out.println(str);
	        removeDuplicate(str);
	    }
	    public static String generateCount(String s){
	        String str="";
	        int count=1;
	        for(int i=0;i<s.length()-1;i++){
	            if(s.charAt(i)==s.charAt(i+1)){
	                count++;
	            }else{
	                str+=s.charAt(i)+""+count;
	                count=1;
	            }
	        }
	        str+=s.charAt(s.length()-1)+""+count;
	        return str;    
	    }
	    public static String removeDuplicate(String str){
	        String sh="";
	            for(int i=0;i<str.length()-1;i+=2){
	                char ch=str.charAt(i);
	                int co=str.charAt(i+1)-48;
	                if(co==1){
	                    sh+=ch; }
	            }
	        System.out.println(sh);
	        String st=generateCount(sh);
	        if(sh.length()>2) {
	        for(char ch:st.toCharArray()) {
	        	if(ch>='2' && ch<='9') {
	        		removeDuplicate(st);
	        	}
	         }
	        }
	        return sh;
	    }

}
