package ArrayPrograms;

public class MaximumElementInArray {

	public static void main(String[] args) {
	     int[][] a={{1,5,3},{17,5,3},{7,9,-20}};
	      int temp=0;
	      for(int i=0;i<a.length;i++){
	          for(int j=0;j<a[i].length;j++){
	              if(a[i][j]>temp){
	                  temp=a[i][j];
	              }
	          }
	      }
	        System.out.println(temp);

	}

}
