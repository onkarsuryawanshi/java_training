package com.cognologix.collections.micro.Question2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Question2 {

	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	        int opts;
	        String yn;
	        Question_2_EmployeeDB empdb = new Question_2_EmployeeDB();
	        do {
	            System.out.println("Choose one of the operations:" + "1. Add Employee" + "2. Delete Employee"
	                    + "3. Show Pay Slip of an Employee" + "4. List all Employees" + "5. Exit ");
	            opts = sc.nextInt();
	            switch (opts) {
	            case 1:
	                // add employee
	                System.out.println("Enter Employee Id, Name, Email, Gender, Salary:");
	                Integer emp_id = sc.nextInt();
	                String name = sc.nextLine();
	                String email = sc.nextLine();
	                sc.nextLine();
	                char gender = sc.next().charAt(0);
	                sc.nextLine();
	                float salary = sc.nextFloat();
	                Question_2_Employee emp = new Question_2_Employee(emp_id, name, email, gender, salary);
	                boolean addStatus = empdb.addEmployee(emp);
	                if (addStatus) {
	                    System.out.println("Employee record added to db successfully..!");
	                } else {
	                    System.out.println("Failed to add an employee!");
	                }
	                break;
	            case 2:
	                // delete employee
	                System.out.println("Enter the employee id to delete: ");
	                Integer empid = sc.nextInt();
	                boolean deleteStatus = empdb.deleteEmployee(empid);
	                if (deleteStatus) {
	                    System.out.println("Employee record deleted successfully..!");
	                } else {
	                    System.out.println("Failed to delete Employee record");
	                }
	                break;
	            case 3:
	                // show pay slip
	                System.out.println("Enter the employee id to fetch the pay slip: ");
	                Integer id = sc.nextInt();
	                System.out.println("Your Pay Slip is shown below:");
	                String payslip = empdb.showPaySlip(id);
	                if (payslip != null) {
	                    System.out.println(payslip);
	                } else {
	                    System.out.println("Failed to fetch your payslip!");
	                }
	                break;
	            case 4:
	                // list all employees
	                System.out.println("List of all employees: ");
	                Question_2_Employee[] empArr = empdb.listAll();
	                for (int i = 0; i < empArr.length; i++) {
	                    empArr[i].GetEmployeeDetails();
	                }
	                break;
	            }

	            System.out.println("Do you want to continue? [Y/N]");
	            yn = sc.next();
	        } while (yn.equalsIgnoreCase("y"));
	    }

	}