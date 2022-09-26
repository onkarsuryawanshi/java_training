package collections.idea.Q4.solution;


import collections.idea.Q4.model.Student;

import java.util.List;

public class AverageMarksCalculator {
    private List<Student> studentList;

    public AverageMarksCalculator(List<Student> studentList) {
        super();
        this.studentList = studentList;

    }
    // get lowest id from the list of students
    public Integer getLowestIdFromTheListOfStudents() {
        int lowestId = Integer.MAX_VALUE;
        for (Student s : studentList) {
            if (s.getStudentId() < lowestId) lowestId = s.getStudentId();
        }
        return lowestId;
    }

    // get average marks for the student having lowest id
    public Double getAverageMarksForTheStudent(Integer lowestId) {
        int sum = 0;
        int count = 0;
        for (Student s : studentList) {
            if (s.getStudentId() == lowestId) {
                sum += s.getMarks();
                count += 1;
            }
        }
        return (double) sum / count;
    }

}
