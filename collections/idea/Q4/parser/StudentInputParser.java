package collections.idea.Q4.parser;

import collections.idea.Q4.mapper.StudentMapper;
import collections.idea.Q4.model.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StudentInputParser {
    public List<Student> parseArray(String[] inputData) {
        List<Student> list = new ArrayList<Student>();
        for (String data :
                inputData) {
            Student student = StudentMapper.map(data);
            list.add(student);
        }
        return list;
    }

    public List<Student> parseCSVFile(String filePath) {
        List<Student> list = new ArrayList<>();
        // File path is passed as parameter
        File file = new File(filePath);
        // Creating an object of BufferedReader class
        try {
            BufferedReader br
                    = new BufferedReader(new FileReader(file));
            // Declaring a string variable
            String st;
            // Condition holds true till
            // there is character in a string
            try {
                while ((st = br.readLine()) != null) {
                    Student student = StudentMapper.map(st);
                    list.add(student);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
