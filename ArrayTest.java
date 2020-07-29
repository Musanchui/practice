package com.musanchui.contact;
import java.util.Arrays;

public class ArrayTest {
	
	public static void main(String[]args) {
//		int[][] t = new int [][] {{3,5,8},{12,9},{7,0,6,4}} ;
//		int sumArr=0;
//		for (int i=0;i<t.length;i++) {
//			for(int j=0;j<t[i].length;j++) {
//				sumArr += t[i][j]; 
//				
//			}
//		}
//		System.out.println(sumArr);
		int[] a = new int[] {46,65,897,465,12,458,123,455,456};
//		for(int i=0;i<a.length-1;i++) {
//			for(int j=0;j< a.length-1-i;j++) {
//				if (a[j]>a[j+1]) {
//					int temp = a[j];
//					a[j] = a[j+1];
//					a[j+1] = temp;
//				}
//			}
//		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
			
			
			
		}
		int[] a1 = new int[] {1,3,5,7};
		int[] a2 = new int[] {3,1,5,7};
		boolean equalOrNot = Arrays.equals(a1, a2);
		System.out.println(equalOrNot);
		Arrays.fill(a, 3);
		System.out.println(Arrays.toString(a));
	}
}
