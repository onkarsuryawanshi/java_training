package Q1;

import Q1.Mapper.StudentMapper;
import Q1.Model.Student;
import Q1.Solution.StudentInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] studentsInformation = {
                "22, Rajesh",
                "23, Dinesh",
                "22, Aboli",
                "26, Mayuresh",
                "25, Sarika",
                "24, Ketaki"
        };
        StudentInfo studentInfo = new StudentInfo(studentsInformation);
        ///create list of student
        studentInfo.CreateList();

        // sort list by name
        studentInfo.sortByName();

        // printing sorted ObjectName
        studentInfo.printName();

        //sort by the Id
        studentInfo.sortByStudentId();

        //filter student for id 23
        List<Student> filteredStudent = studentInfo.FilterById();
        System.out.println("List of student whose age is grater than 23 " + filteredStudent);
        //list of student name whose length is greater than 5
        List<Student> studentNames = studentInfo.StudentName();
        System.out.println("student name whose length is greater than 5" + studentNames);

        studentInfo.mapStudentIdStudentObejct();

    }

}