package com.cognologix.collections.micro;

import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ArrStr = new ArrayList<>();

		boolean b =true;
		while(b){
			System.out.println("do you want to enter the string in arraylist[Y/N]");
			String s = sc.next();
			if (!s.equalsIgnoreCase("Y")) {
				b=false;
				break;
			}

			System.out.println("please enter string input");
			String str = sc.next();
			ArrStr.add(str);
		}
		System.out.print("elements in arraylist are ==>");
		
		for(String str : ArrStr) {
			System.out.print(str + "	");
		}
		System.out.println();
		System.out.println("******************************************************");
		System.out.println("exit.....");
		System.out.println("******************************************************");

	}

}
