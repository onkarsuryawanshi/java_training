package collections.idea.Q4.model;

public class Student {
    private int StudentId;
    private String Name;
    private int marks;
    public Student() { }

    public Student(int studentId, String name, int marks) {
        StudentId = studentId;
        Name = name;
        this.marks = marks;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getStudentId() {
        return StudentId;
    }

    //    @Override
//    public String toString() {
//        return "Student{" +
//                "StudentId=" + StudentId +
//                ", Name='" + Name + '\'' +
//                ", marks=" + marks +
//                '}';
//    }
}
