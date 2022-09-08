package com.cognologix.collections.micro;

import java.util.LinkedList;
import java.util.Scanner;

public class Question6 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int N = sc.nextInt();
		LinkedList<Integer> l1 = saveEvenNumbers(N);
		LinkedList<Integer> l2 = printEvenNumbers(l1);
		System.out.println("please enter the number you want to search in Linkedlist1");
		int m = sc.nextInt();
		int res = serachInlist1(l1,m);
		if (res!=0) System.out.println("entered element is present in linkedlist1");
		else System.out.println("entered element is not found try with other value");
	}
	private static int serachInlist1(LinkedList<Integer> l1, int m) {
			while(l1.size()>0){
					if (m==l1.pop()) return m;
			}
			return 0;
		
	}
	private static LinkedList<Integer> printEvenNumbers(LinkedList<Integer> l1) {
		LinkedList<Integer> l2 = new LinkedList<>();
		System.out.print("elements in linked-list-1 are==>");
		for(Integer i : l1) {
			System.out.print(i + "		");
			l2.add(i*2);
		}
		System.out.println();
		System.out.print("elements in linked-list-2 are==>");
		for(Integer j : l2) {
			System.out.print(j+ "		");
		}
		System.out.println();
		return l2;
	}
	private static LinkedList<Integer> saveEvenNumbers(int n) {
		LinkedList<Integer> list1 = new LinkedList<>();
		for (int i = 2; i < n; i+=2) {
			list1.add(i);
		}
		return list1;
	}

}
