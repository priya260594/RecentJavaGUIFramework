package IBM_Interview;

import java.util.ArrayList;

public class RemoveCharacters {

	public static void main(String[] args) {
		String s="abcddcbaa";//==>abccb,abb,a
	    removeAllCharacter(s);
//		while(s!="") {
//			for(int i=0;i<s.length()-1;i++) {
//					if(s.charAt(i)==s.charAt(i+1)) {
//						s=s.substring(0,i)+s.substring(i+2);
//						System.out.println(s);
//					}
//			   }
//		}
	}
	public static void removeAllCharacter(String s) {
		int length=s.length();
		String sr="";
		if(s.length()>0) {
			for(int i=0;i<s.length()-1;i++) {
					if(s.charAt(i)==s.charAt(i+1)) {
						s=s.substring(0,i)+s.substring(i+2);
						System.out.println(s);
						removeAllCharacter(s);}
						
//					}else {
//					    System.out.print(s.charAt(i));
//					    if(i==length-2) {
//					    	System.out.print(s.charAt(s.length()-1));
					    
					}
					//sr+=s.charAt(s.length()-1);
			  }
		}
		
	}
//		String s1="";
//		ArrayList<Character> li=new ArrayList();
//		for(int i=0;i<s.length();i++) {
//			if(!li.isEmpty() && (s.charAt(i)=='a' && li.get(li.size()-1)=='a') ||
//					            (s.charAt(i)=='b' && li.get(li.size()-1)=='b') ||
//					            (s.charAt(i)=='c' && li.get(li.size()-1)=='c') ) {
//				li.remove(li.size()-1);
//			}else {
//				li.add(s.charAt(i));
//			}
//		}
//if(li.isEmpty()) {
//	System.out.println("balanced");
//	System.out.println(li.toString());
//}else {
//	System.out.println("not balanced");
//}
	
	


