package com.cognologix.collections.micro.Question8;

import java.util.Iterator;
import java.util.Vector;

public class Question8 {
	public static void main(String[] args) {
		Question8_Empl e1 = new Question8_Empl(1, "onkar", "Onkar@", 'M', 20000);

		Question8_Empl e2 = new Question8_Empl(1, "onkar", "Onkar@", 'M', 20000);
		
		Question8_Empl e3 = new Question8_Empl(1, "onkar", "Onkar@", 'M', 20000);
		
		Question8_Empl e4 = new Question8_Empl(1, "onkar", "Onkar@", 'M', 20000);
		Vector<Question8_Empl> v = new Vector<>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		v.add(e4);
		printEmplVector(v);
	}

	private static void printEmplVector(Vector<Question8_Empl> v) {
		for (Iterator iterator = v.iterator(); iterator.hasNext();) {
			Question8_Empl empl = (Question8_Empl) iterator.next();
			System.out.println("id :" +empl.getEmpld() + "| Name :" +empl.getEmpName() + "| Eamil:"+ empl.getEmpEmail() + " | Gender :" + empl.getEmpGender() + "| salary :" + empl.getEmpSalary());
			
			
		}
//			System.out.println(v.getClass());
	}

}
