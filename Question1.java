package com.cognologix.collections.micro;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
	public static ArrayList<Integer> printEvenNumbers(ArrayList<Integer> arrList) {
		ArrayList<Integer> Arrlist2 = new ArrayList<>();
		System.out.print("elements in arraylist-2 are :"+"	");
			for(Integer i : arrList) {
				Arrlist2.add(i*2);
				System.out.print(i*2 +"	");
			}
			System.out.println();
			System.out.print("elements in arraylist-1 are :"+"	");
			for(Integer j : arrList) {
				System.out.print(j+"       ");
			}
			System.out.println();
			return Arrlist2;
	}
	
	public static ArrayList<Integer> saveEvenNumber(int N) {
		ArrayList<Integer> Arrlist1 = new ArrayList<>();
		for (int i = 2; i < N; i+=2) {
			Arrlist1.add(i);
		}
		
		return Arrlist1;
		
	}
	public static Integer printEvenNumber(int m, ArrayList<Integer> arrlist1) {
		boolean b = false ;
		for(Integer j : arrlist1) {
				if (j==m) return j ;
				
			}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number N ");
		int N = sc.nextInt();
		ArrayList<Integer> arrlist1 = new ArrayList<>();
		arrlist1= saveEvenNumber(N);
		printEvenNumbers(arrlist1);
		System.out.println("enter the number you want to search in arraylist-1 ");
		int m = sc.nextInt();
		Integer res = printEvenNumber(m,arrlist1);
		if (res==0) System.out.println("entered number is not presented in arraylist-1");
		
		else System.out.println("Entered number is presented in arraylist-1");
	}



}
