package Q1.Solution;

import Q1.Mapper.StudentMapper;
import Q1.Model.IdCompare;
import Q1.Model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentInfo {
    private List<Student> studentList = new ArrayList<>();
    private String[] studentData;

    public StudentInfo(String[] studentData) {
        this.studentData = studentData;
    }

    public void CreateList() {
        StudentMapper studentMapper = new StudentMapper();
        for (String student : studentData) {
            studentList.add(studentMapper.map(student));
        }
    }

    public void sortByName() {
        Collections.sort(studentList);
    }

    public void printName() {
        System.out.println(studentList);
    }

    public void sortByStudentId() {
        System.out.println("Sorted by id:--");
        IdCompare idCompare = new IdCompare();
        Collections.sort(studentList, idCompare);
        for (Student student: studentList)
            System.out.println("studentId : " + student.getStudentId()
                    + "StudentName : " + student.getStudentName()
                );
    }

    public List<Student> FilterById() {
//        List<Student> filteredStudent = new ArrayList<>();
//        for (Student s: studentList) {
//            if (s.getStudentId() > 26){
//                filteredStudent.add(s);
//            }
//        }
//        return filteredStudent;

        return studentList.stream().filter(i-> i.getStudentId() > 23).collect(Collectors.toList());
    }

    public List<Student> StudentName() {
//        List<Student> studentName = new ArrayList<>();
//        for (Student student:studentList) {
//            if (student.getStudentName().length() > 5){
//                studentName.add(student);
//            }
//
//        }
//        return studentName;
        return studentList.stream().filter(i->i.getStudentName().length() > 5).collect(Collectors.toList());
    }

    public void mapStudentIdStudentObejct() {
//
//        Map<Integer,Student> map =studentList.stream().collect(Collectors
//                .toMap(p->p.getStudentId(),p->p.getStudentName());

    }
}
