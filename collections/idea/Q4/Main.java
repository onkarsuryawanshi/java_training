package collections.idea.Q4;

import collections.idea.Q4.model.Student;
import collections.idea.Q4.parser.StudentInputParser;
import collections.idea.Q4.solution.AverageMarksCalculator;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] inputData = {"22, Data Structures, 45", "23, English, 52", "22, English, 51",
                "26, Data Structures, 72", "23, Data Structures, 61", "24, English, 81",};

        //parse input array to list of student
        StudentInputParser inputParser = new StudentInputParser();

        List<Student> studentList = null;
        String filePath = "/home/onkars/Workspace/intellij/java_training/JavaCollectionsCodingExercise2/collections/idea/Q4/Input_file/input.csv";
        studentList = inputParser.parseCSVFile(filePath);

        AverageMarksCalculator averageMarksCalculator = new AverageMarksCalculator(studentList);

        // get lowest id from the list of students
        Integer lowestIdFromTheListOfStudents = averageMarksCalculator.getLowestIdFromTheListOfStudents();

        // get average marks for the student having lowest id
        Double average = averageMarksCalculator.getAverageMarksForTheStudent(lowestIdFromTheListOfStudents);


        //printing the result
        System.out.println("average marks is :  "+ average + "& Id of the student is "+ lowestIdFromTheListOfStudents);
    }
}
