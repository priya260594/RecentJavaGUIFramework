 package IBM_Interview;

import java.util.Arrays;

public class MultiplyArray {

	public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};  //o/p={2,12,30}
        int[] a=new int[arr.length/2];
        int index=0;
        for(int i=0;i<arr.length;i+=2){
            a[index++]=arr[i]*arr[i+1];
        }
        System.out.println(Arrays.toString(a));

	}

}
