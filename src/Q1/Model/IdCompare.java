package Q1.Model;

import java.util.Comparator;

public class IdCompare implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if ((s1.getStudentId()) < s2.getStudentId()) return 1;
        if (s1.getStudentId() > s2.getStudentId()) return -1;
        else return 0;
    }
}
