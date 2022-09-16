package collections.idea.Q5;
/////////
import java.util.*;

public class Question5 {


    public static void main(String[] args) {
        String[] input = {"22, Rajan Anand, Engineering, 1600000",
                "23, Swati Patil, Testing, 800000",
                "27, Vijay Chawda, Engineering, 800000",
                "29, Basant Mahapatra, Engineering, 600000",
                "32, Ajay Patel, Testing, 350000",
                "34, Swaraj Birla, Testing, 350000"};

        ///converting string into array of Employee Objects
        List<Employee> employeeList = parsing_input(input);

        ///finding unique department
        Set<String> set = findingUniqueDept(employeeList);
        System.out.println(set);


        ////finding Highest sal
        Map<String, Integer> map = findingHighestSal(employeeList, set);
        System.out.println(map);

        ///finding Emp Id for max sal
        findingIdForHighestSal(employeeList, map);
    }

    private static void findingIdForHighestSal(List<Employee> empList, Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet())
            for (Employee emp :
                    empList) {
                if (emp.getDepartment() == entry.getKey() && emp.getEmpSalary() == entry.getValue()) {
                    System.out.println("department-->" + emp.getDepartment() + "    id-->" + emp.getEmpId());
                }
            }
    }

    private static Map<String, Integer> findingHighestSal(List<Employee> empList, Set<String> set) {
        Map<String, Integer> map = new HashMap<>();
        for (String s :
                set) {
            int max_sal = 0;
            for (Employee e :
                    empList) {
                if (e.getEmpSalary() > max_sal && e.getDepartment() == s) {
                    max_sal = e.getEmpSalary();

                }

            }
            map.put(s, max_sal);

        }
        return map;
    }

    private static Set<String> findingUniqueDept(List<Employee> studentList) {

        Set<String> hash_Set = new HashSet<String>();
        for (Employee e :
                studentList) {

            hash_Set.add(e.getDepartment());

        }
        return hash_Set;
    }

    private static List<Employee> parsing_input(String[] input) {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            String[] currArr = input[i].split(",");
            int empId = Integer.parseInt(currArr[0]);
            String name = currArr[1];
            String department = currArr[2];
            int empSalary = Integer.parseInt(currArr[3].strip());

            Employee e = new Employee(empId, name, department, empSalary);

            employeeList.add(e);
        }


        return employeeList;
    }


}
