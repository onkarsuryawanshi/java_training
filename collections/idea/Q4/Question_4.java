package collections.idea.Q4;

import java.util.ArrayList;
import java.util.List;

public class Question_4 {
    public static void main(String[] args) {
        String[] input = {"22, Data Structures,45",
                "23, English,52",
                "22, English,51",
                "26, Data Structures,72",
                "23, Data Structures,61",
                "24, English,81"};
        ///converting string into array of Student Objects
        List<Student> studentList = parsing_input(input);


        //finding lowest StudentID
        int lowestId = findLowestId(studentList);

        ///finding Average of lowest studentId
        findingAverage(lowestId,studentList);
    }

    private static void findingAverage(int lowestId, List<Student> studentList) {
        int sum =0;
        for (Student s:
                studentList) {
            if(s.getStudentId()==lowestId){
                sum += s.getMarks();
            }
        }
        System.out.println("Lowest Student id is >>"+lowestId);
        System.out.println("sum of marks of Lowest Student id >>>"+sum);
        System.out.println("Average of marks of Lowest Student id >>>"+sum/studentList.size());
    }

    private static int findLowestId(List<Student> studentList) {
        int lowestId = Integer.MAX_VALUE;
        for (Student s:
             studentList) {
            if (s.getStudentId()<lowestId) lowestId = s.getStudentId();
        }
        return lowestId;
    }

    static List<Student> parsing_input(String[] input){
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            String[] currArr = input[i].split(",");
           int studentId = Integer.parseInt(currArr[0]);
           int mark = Integer.parseInt(currArr[2]);
           String name = currArr[1];
           Student s = new Student(studentId,name,mark);

           studentList.add(s);
        }

            
        return studentList;
    }
}
