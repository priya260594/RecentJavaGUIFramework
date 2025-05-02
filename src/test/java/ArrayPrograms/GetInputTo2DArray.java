package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class GetInputTo2DArray {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the row no:");
//		int row = sc.nextInt();
//
//		System.out.print("Enter the column no:");
//		int column = sc.nextInt();
//		int[][] a = new int[row][column];
//
//		System.out.print("Enter the array elements:");
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}
//		// sc.close();
//		// System.out.println(Arrays.deepToString(a));
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + "  ");
//			}
//			System.out.println();
//		}
		int[] c= {2,4,5,67,7,4,2};
		int[] b={2,4,5,67,7,4,2};
		System.out.println(Arrays.equals(c, b));
		int[][] d= {{1,2,4},{5,7,4},{74,83,6}};
		int[][] e= {{1,2,4},{5,7,4},{74,83,6}};
		System.out.println(Arrays.deepEquals(d, e));
		System.out.println();

	}

}
