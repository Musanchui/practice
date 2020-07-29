package com.musanchui.contact;

public class Test1 {
	public static void main(String[]args) {
		int []a = new int[] {35,5,-98,76,20,36};
		for(int i=0;i<a.length;i++) {     //冒泡算法排序
			for(int j=1;j<a.length - i;j++) {
				if(a[j]<a[j-1]) {
					int temp = a[j-1];
					a[j-1] = a[j] ;
					a[j] = temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		for(int i=0;i<a.length/2;i++) {
			
			int p = a.length - i - 1;
			int temp = a[i];
			a[i] = a[p];
			a[p] = temp;
			
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+"\t");
		}
	}
}
