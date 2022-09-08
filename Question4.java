package com.cognologix.collections.micro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MyArrayList<E> extends ArrayList<E> {
	@Override
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("Only Integer, Float, and Double are supported.");
		}
	}
}
public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		List<Object> list = new MyArrayList<>();
		
		try {
		
		System.out.println("1.to enter int");
		System.out.println("2.to enter double ");
		System.out.println("3.to enter float");
		int n = sc.nextInt();
		list.add(1299);
		list.add(123.2123);
		list.add(123456f);
		switch(n) {
		case 1:
			System.out.println("please enter the Int value");
			int input1 = sc.nextInt();
			list.add(input1);
			break;
			
		case 2 : 
			System.out.println("Please enter double value");
			double input2 = sc.nextDouble();
			list.add(input2);
			break;
		case 3:
			System.out.println("Please enter float value");
			float input3 = sc.nextFloat();
			list.add(input3);
			}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(list);

	}
}
