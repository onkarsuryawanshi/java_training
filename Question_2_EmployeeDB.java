package com.cognologix.collections.micro.Question2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Question_2_EmployeeDB {
	static Set<Question_2_Employee> empTreeSet = new TreeSet<Question_2_Employee>();

	public boolean addEmployee(Question_2_Employee e) {
		return empTreeSet.add(e);
	}

	public boolean deleteEmployee(Integer empId) {
		Iterator<Question_2_Employee> it = empTreeSet.iterator();

		while (it.hasNext()) {
			Question_2_Employee e = it.next();
			if (e.getEmpId() == empId) {
				return empTreeSet.remove(e);
			}
		}
		return false;
	}

	public String showPaySlip(Integer empId) {
		Iterator<Question_2_Employee> it = empTreeSet.iterator();
		String paySlip;
		while (it.hasNext()) {
			Question_2_Employee e = it.next();
			if (e.getEmpId() == empId) {
				paySlip = "Name: " + e.getEmpName() + "\nEmail: " + e.getEmpEmail() + "\nGender: " + e.getEmpGender()
						+ "\nSalary: " + e.getEmpSalary();
				return paySlip;
			}
		}
		return null;
	}

	Question_2_Employee[] listAll() {
		int index = 0;
		Question_2_Employee[] emp = new Question_2_Employee[empTreeSet.size()];
		Iterator it = empTreeSet.iterator();
		while (it.hasNext()) {
			Question_2_Employee e = (Question_2_Employee) it.next();
			emp[index++] = e;
		}
		return emp;
	}
}
