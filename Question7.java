package com.cognologix.collections.micro;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Question7 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the value of N ");
		int N = sc.nextInt();
		Vector<Integer> l1 = saveEvenNumbers(N);
		Vector<Integer> l2 = printEvenNumbers(l1);
		System.out.println("please enter the number you want to search in Linkedlist1");
		int m = sc.nextInt();
		int res = serachInvector1(l1, m);
		if (res != 0)
			System.out.println(res + "  element is present in linkedlist1");
		else
			System.out.println("entered element is not found try with other value");
	}

	private static int serachInvector1(Vector<Integer> v1, int m) {
		for (Integer x : v1) {
			if(x==m) return m ;
		}

		return 0;
	}

	private static Vector<Integer> printEvenNumbers(Vector<Integer> v1) {
		Vector<Integer> v2 = new Vector<>();
		System.out.print("elements in linked-list-1 are==>");
		for (Integer i : v1) {
			System.out.print(i + "		");
			v2.add(i * 2);
		}
		System.out.println();
		System.out.print("elements in linked-list-2 are==>");
		for (Integer j : v2) {
			System.out.print(j + "		");
		}
		System.out.println();
		return v2;
	}

	private static Vector<Integer> saveEvenNumbers(int n) {
		Vector<Integer> vect1 = new Vector<>();
		for (int i = 2; i < n; i += 2) {
			vect1.add(i);
		}
		return vect1;
	}
}
