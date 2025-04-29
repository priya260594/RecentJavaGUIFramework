package IBM_Interview;

import java.util.Arrays;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OccurrenceWithoutCollections {

	public static void main(String[] args) {
        int[] a={0,1,2,2,2,4,1,0,0,1,2,3};
  
        for(int i=0;i<a.length;i++){
            int c=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]=Integer.MIN_VALUE;
                }
            }
          //  if(c==1 && a[i]!=Integer.MIN_VALUE){
            if(a[i]!=Integer.MIN_VALUE) {
                System.out.print(a[i]+"  ");}
        }

//        Arrays.sort(a);
//        for(int i=0;i<a.length-1;i++) {
//        	if(a[i]!=a[i+1]) {
//        		System.out.print(a[i]+" ");
//        	}
//        }
//        System.out.print(a[a.length-1]);

	}

}
