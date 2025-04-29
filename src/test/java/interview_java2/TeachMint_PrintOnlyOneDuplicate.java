package interview_java2;

import java.util.LinkedHashSet;

public class TeachMint_PrintOnlyOneDuplicate {

	public static void main(String[] args) {
        String s1="HELLO TESTER HOWO ERE";
        String[] s2=s1.split(" ");
        StringBuilder sb=new StringBuilder();
        LinkedHashSet<Character> set=new LinkedHashSet();;
        for(int i=0;i<s2.length;i++){
            char[] temp=s2[i].toCharArray();
            for(int j=0;j<temp.length;j++){
                set.add(temp[j]);
            }
            for(Character ch:set){
            System.out.print(ch);}
            System.out.print(" ");
            set.clear();
        }


	}

}
