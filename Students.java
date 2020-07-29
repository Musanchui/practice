package com.musanchui.contact;

public class Students {
	public static void main(String[] args) {
		
		StudentsInfo[] arr = new StudentsInfo[20] ;
		for(int i=0;i< arr.length ;i++) {
			arr[i] = new StudentsInfo();
			arr[i].num = (i+1) ;
			arr[i].state = (int)(Math.random()*6+1);
			arr[i].score = (int)(Math.random()*100);
		}
	System.out.println("****************************");
		for(int i = 0;i<arr.length;i++) {
			if(arr[i].state == 3) {
				System.out.println("學號"+arr[i].num+",年級"+arr[i].state+"，成績"+arr[i].score);
			}
		}
	}
//	public void thirdState(){
//		
//	}
}

class StudentsInfo{
	int num;
	int state;
	int score;
	
}