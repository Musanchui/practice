package com.musanchui.contact;
import java.util.Arrays;

public class Homework {
	public static void main(String[] args) {
		int a1 = 10;
		int a2 = 8;
		Homework square = new Homework();
		square.method(a1, a2);
	}
	public void method(int m,int n){
		char[] lon = new char[m];
		char[] wid = new char[m];
		Arrays.fill(lon, '*');
		for(int i=0;i< m;i++) {
//			lon [i] = '*';
			if(i==0||i==m-1) {
				wid[i]='*';
			}else {
				wid[i]=' ';
			}
		}
		
		  for(int j = 0;j<m;j++) { 
			  System.out.print(lon[j]); 
			  } 
		  System.out.println();
		 
//		System.out.println(Arrays.toString(lon));
		for(int i=0;i<n-2;i++) {
//			System.out.println(Arrays.toString(wid));
			  for(int j = 0;j<m;j++) { 
				  System.out.print(wid[j]); 
				  } 
			  System.out.println();
		}
//		System.out.println(Arrays.toString(lon));
		
		  for(int j = 0;j<m;j++) { System.out.print(lon[j]); }
		 

	}
}


