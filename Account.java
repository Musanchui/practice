package com.musanchui.contact;
class Account{
	public static void main(String [] args){
		boolean conti = true;
		int balance = 10000;
		Utility utility = new Utility();
		int in=0;
		int out=0;
		String ae = "";
		String inExplain = "";
		String outExplain ="";
		while(conti){
			System.out.println("----------Family Account Book----------");
			System.out.println("");
			System.out.println("1Income and expenditure details");
			System.out.println("2Registe income");
			System.out.println("3Registe expenditure");
			System.out.println("4Quit");
			System.out.println("");
			System.out.print("select in 1-4:");
			
			char userInput = utility.readMenuSelection();
			//String users = String.valueOf(userInput);
			switch (userInput) {
			case '1':
				System.out.println("\tbalance\tturnover\texplain");
				System.out.println(ae);
				//System.out.println("income\t"+balance+"\t"+in+"\t"+inExplain);
				//System.out.println("output\t"+balance+"\t"+out+"\t"+outExplain);
				break;
			case '2':
				System.out.println("income number:");
				int inNum = utility.readNumber();
				in = in+inNum;
				balance = balance+in;
				System.out.println("income explaination:");
				inExplain=utility.readString();
				ae += "income\t"+balance+"\t"+inNum+"\t"+inExplain+"\n";
				break;
			case '3':
				System.out.println("output number:");
				int outNum = utility.readNumber();
				out = out+outNum;
				balance = balance-out;
				System.out.println("outcome explaination:");
				outExplain=utility.readString();
				ae += "output\t"+balance+"\t"+outNum+"\t"+outExplain+"\n";
				break;
			case'4':
				System.out.println("Are you sure to quit? Y/N");
				char anwser = utility.readConfirmSelection();
				String a = String.valueOf(anwser);
				if(a.equals("Y"))conti = false;
				break;
			}
			/*if(users.equals("1")){
				System.out.println("\tbalance\tturnover\texplain");
				System.out.println("income\t"+balance+"\t"+in+"\t"+inExplain);
				System.out.println("output\t"+balance+"\t"+out+"\t"+outExplain);
				//break;
			}
			if(users.equals("2")){
				System.out.println("income number:");
				int inNum = utility.readNumber();
				in = in+inNum;
				balance = balance+in;
				System.out.println("income explaination:");
				inExplain=utility.readString();
				//break;
			}
			if(users.equals("3")){
				System.out.println("output number:");
				int outNum = utility.readNumber();
				out = out+outNum;
				balance = balance-out;
				System.out.println("outcome explaination:");
				outExplain=utility.readString();
				//break;
			}
			if(users.equals("4")){
				System.out.println("Are you sure to quit? Y/N");
				char anwser = utility.readConfirmSelection();
				String a = String.valueOf(anwser);
				if(a.equals("Y"))conti = false;*/
			}
		}		
	}
