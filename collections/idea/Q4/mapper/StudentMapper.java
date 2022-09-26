package collections.idea.Q4.mapper;

import collections.idea.Q4.model.Student;

public class StudentMapper {
    public static Student map(String data){
        String[] arr = data.split(",");
        Integer studentId = Integer.parseInt(arr[0]);
        String studentSubject = arr[1];
        Integer studentMarks = Integer.parseInt(arr[2].trim());
        Student student = new Student(studentId,studentSubject,studentMarks);
        return student;
    }
}
