package collections.idea.Q4.solution;


import collections.idea.Q4.model.Student;

import java.util.ArrayList;
import java.util.List;

public class AverageMarksCalculator {
    private String[] studentData;
    public AverageMarksCalculator(String[] studentData) {
        super();
        this.studentData = studentData;

    }

    // map input array to list of Student
    public List<Student> mapInputArrayToListOfStudent(String[] studentData) {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < studentData.length; i++) {
            String[] currArr = studentData[i].split(",");
            int studentId = Integer.parseInt(currArr[0]);
            int mark = Integer.parseInt(currArr[2].trim());
            String name = currArr[1];
            Student s = new Student(studentId, name, mark);
            studentList.add(s);
        }
        return studentList;
    }

    // get lowest id from the list of students
    public Integer getLowestIdFromTheListOfStudents(List<Student> studentList) {
        int lowestId = Integer.MAX_VALUE;
        for (Student s : studentList) {
            if (s.getStudentId() < lowestId) lowestId = s.getStudentId();
        }
        return lowestId;
    }

    // get average marks for the student having lowest id
    public Double getAverageMarksForTheStudent(Integer lowestId, List<Student> studentList) {
        int sum = 0;
        int count =0;
        for (Student s : studentList) {
            if (s.getStudentId() == lowestId) {
                sum += s.getMarks();
                count+=1;
            }
        }
        return (double) sum /count;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (String studentInfo : studentData) {
//            sb.append(studentInfo);
//            sb.append("\n"); // find what should be the better way for new line character
//        }
//        return sb.toString();
//    }
}
