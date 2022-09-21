package collections.idea.Q5.solution;


import collections.idea.Q5.model.Employee;

import java.util.*;

public class HighestSalaryDept {
    // map input array to list of Student
    public List<Employee> mapInputArrayToListOfStudent(String[] studentData) {
        List<Employee> EmployeeList = new ArrayList<>();
        for (int i = 0; i < studentData.length; i++) {
            String[] currArr = studentData[i].split(",");

            int empId = Integer.parseInt(currArr[0]);
            String name = currArr[1];
            String department = currArr[2];
            int empSalary = Integer.parseInt(currArr[3].trim());


            Employee s = new Employee(empId, name, department, empSalary);
            EmployeeList.add(s);
        }
        return EmployeeList;
    }

    public Set<String> findingUniqueDept(List<Employee> employeeList) {

        Set<String> setOfUniqueDepartment = new HashSet<String>();
        for (Employee e :
                employeeList) {

            setOfUniqueDepartment.add(e.getDepartment());

        }
        return setOfUniqueDepartment;
    }

    public Map<String, Integer> findingHighestSal(List<Employee> empList, Set<String> set) {
        Map<String, Integer> highSalMap = new HashMap<>();
        for (String s :
                set) {
            int max_sal = 0;
            for (Employee e :
                    empList) {
                if (e.getEmpSalary() > max_sal && e.getDepartment() == s) {
                    max_sal = e.getEmpSalary();
                }
            }
            highSalMap.put(s, max_sal);
        }
        return highSalMap;
    }

    public Map<String, Integer> findingIdForHighestSal(List<Employee> employeeList, Map<String, Integer> map) {
        Map<String,Integer> departmentIdMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet())
            for (Employee emp :
                    employeeList) {
                if (emp.getDepartment() == entry.getKey() && emp.getEmpSalary() == entry.getValue()) {
                    departmentIdMap.put(emp.getDepartment(), emp.getEmpId());

                }
            }
        return departmentIdMap;
    }
}
