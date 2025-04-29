package interview_java2;

import java.util.Collections;
import java.util.LinkedHashMap;

public class Sony_CharNumSeparation {

	public static void main(String[] args) {
		String s="Hi7 893 hello";
		int numIndex=0;
		LinkedHashMap<Character,Character> map=new LinkedHashMap<>();
		String num=s.replaceAll("[^0-9]", "");
		for(char ch:s.toCharArray()) {
			if(Character.isLetter(ch) && numIndex<num.length()) {
				map.put(ch, num.charAt(numIndex));
				numIndex++;
			}
		}                                                                                  
        System.out.println(map);
       
        //replace special characters or Character.isLetterOrDigit
        String s1="Hdfjnff^%&%fnvb^$^#325534";
        String s2=s1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s2);
        
        //Character.isLetter(),isDigit(), isLetterOrDigit(),isUpperCase(), isLowerCase()
        String s3="hsdf342234@W%%#$DFS546@#$@#%@4*";
        String sh="";
        for(char ch:s3.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                sh+=ch; 
            }
        }
        System.out.println(sh);
        
        //ascii values
      //  65-90==>upper case
       // 97-122==> lower case
       // 48-57==> number
        
        String s4="hsdf342234@W%%#$DFS546@#$@#%@4*";
        String sh2="";
        for(char ch:s4.toCharArray()){
        	int ascii=(int)ch;
        	if(!(ascii>=66 && ascii<=90 || ascii>=97 && ascii<=122 || ascii>=48 && ascii<=57)) {
        		sh2+=ch;
        	}
        }
        System.out.println(sh2);
        
        
	}

}
