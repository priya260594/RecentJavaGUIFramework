package ArrayPrograms;

import java.util.Arrays;

public class ZigZagAddingInArrays {

	public static void main(String[] args) {
        int[] a={1,4,6,8};
        int[] b={5,9,2,8,6,8};
        int[] c=new int[a.length+b.length];
        int index=0;
        int a1=Math.max(a.length,b.length);
        for(int i=0;i<a1;i++){
                if(i<a.length) {c[index++]=a[i];}
                if(i<b.length) {c[index++]=b[i];}
            }
        System.out.println(Arrays.toString(c));

	}

}
