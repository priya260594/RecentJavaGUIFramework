package interview_java2;

public class IBM_ibmStringCount {

	public static void main(String[] args) {
        String s="ibmfsddfaibmsgfibmfsfibmfjjsdfibmjbmibmib";
     int count=0;
         while(s.contains("ibm")){
             count++;
             s=s.replaceFirst("ibm","");
         }
     
    // int count=0;
    // for(int i=0;i<s.length()-1;i++){
    //     if(s.charAt(i)=='i' && s.charAt(i+1)=='b' && 
    //     s.charAt(i+2)=='m'){
    //         count++;
    //     }
    // }
     System.out.println(count);

	}

}
