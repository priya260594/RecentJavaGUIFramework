package IBM_Interview;

public class EmailValidation {

	public static void main(String[] args) {
		String sh=".priya123@gmail.com";
		String s=sh.toLowerCase();
		
		int diff=s.length()-10;
		//username is stored in s1 container
		String s1=s.substring(0,diff);
		char first=s1.charAt(0);System.out.println(first);
		char last=s1.charAt(s1.length()-1);
		
		//check first & last character should be (a-z) or (0-9)
		boolean flag=false;
		if(first=='.' ||first=='#' || first=='@') {
			flag=false;
			System.out.println("invalid");
			
		}else if((first>='a' && first<='z' )||(first>='0' && first<='9') && (last>='a' && last<='z') || (last>='0' && last<='9')){
			flag=true;
		}else {System.out.println("invalid");}
		
		int ans=1;
		if(flag==true) {
			for(int i=1;i<s1.length();i++) {
				char ch=s1.charAt(i);
				if((ch>='a'&& ch<='z') ||(ch>='0' && ch<='9')||(ch=='.' && s1.charAt(i+1)!='.')){
					
				}else {
					ans=0;
					break;
				}
			}
		}
		String domain=sh.substring(diff);
		String mainSer="@gmail.com";
		if(ans==1 && domain.equals(mainSer) ) {
			System.out.println("Valid Email");
		}else {
		System.out.println("invalid Email");}

	}

}
