package IBM_Interview;

public class OccurrenceMalayalam {

	public static void main(String[] args) {
		String s1="Malayalam";
		char[] s=s1.toLowerCase().toCharArray();
		char a='\0';
		for(int i=0;i<s.length;i++) {
			int count=1;
			if(s[i]!=a) {
			   for(int j=i+1;j<s.length;j++) {
				  if(s[i]==s[j]) {
					count++;
					s[j]=a;
				   }
				}
			System.out.println(s[i]+" ==>"+count);
			}
		}	

	}

}
