package collections.idea.Q4;

import collections.idea.Q4.model.Student;
import collections.idea.Q4.solution.AverageMarksCalculator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] inputData = {"22, Data Structures, 45", "23, English, 52", "22, English, 51",
                "26, Data Structures, 72", "23, Data Structures, 61", "24, English, 81",};


        AverageMarksCalculator averageMarksCalculator = new AverageMarksCalculator(inputData);

        // map input array to list of Student
        List<Student> studentsList = averageMarksCalculator.mapInputArrayToListOfStudent(inputData);

        // get lowest id from the list of students
        Integer lowestIdFromTheListOfStudents = averageMarksCalculator.getLowestIdFromTheListOfStudents(studentsList);

        // get average marks for the student having lowest id
        Double average = averageMarksCalculator.getAverageMarksForTheStudent(lowestIdFromTheListOfStudents, studentsList);


        //printing the result
        System.out.println("average marks is :  "+ average + "& Id of the student is "+ lowestIdFromTheListOfStudents);
    }
}
