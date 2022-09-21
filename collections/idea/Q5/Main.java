package collections.idea.Q5;

import collections.idea.Q5.model.Employee;
import collections.idea.Q5.solution.HighestSalaryDept;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] inputData = {"22, Rajan Anand, Engineering, 1600000",
                "23, Swati Patil, Testing, 800000",
                "27, Vijay Chawda, Engineering, 800000",
                "29, Basant Mahapatra, Engineering, 600000",
                "32, Ajay Patel, Testing, 350000",
                "34, Swaraj Birla, Testing, 350000"};

                //creating object
                HighestSalaryDept highestSalaryDept = new HighestSalaryDept();
                // map input array to list of Student
                List<Employee> employeeList = highestSalaryDept.mapInputArrayToListOfStudent(inputData);

                //finding unique department
                Set<String> setOfUniqueDepartment = highestSalaryDept.findingUniqueDept(employeeList);


                //finding Highest sal
                Map<String, Integer> highSalMap = highestSalaryDept.findingHighestSal(employeeList, setOfUniqueDepartment);


                ///finding Emp Id for max sal
                Map<String,Integer> departmentIdMap = highestSalaryDept.findingIdForHighestSal(employeeList, highSalMap);

                for (Map.Entry<String, Integer> entry : departmentIdMap.entrySet()){
                    System.out.println("department==>" + entry.getKey()+ "    Id==>"+entry.getValue());
                }
    }
}
