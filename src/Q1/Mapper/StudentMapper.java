package Q1.Mapper;

import Q1.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentMapper {
    public static Student map(String data){
        String[] arr = data.split(", ");
        Integer studentId = Integer.parseInt(arr[0]);
        String studentName = arr[1];

        Student student = new Student(studentId,studentName);
        return student;
    }
}
