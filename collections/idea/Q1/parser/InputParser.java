package collections.idea.Q1.parser;


import collections.idea.Q1.Mapper.SoftwareMapper;
import collections.idea.Q1.model.Software;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class InputParser {
    public List<Software> parseCSVFile(String filePath) {
        List<Software> list = new ArrayList<>();
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
                    Software software = SoftwareMapper.map(st);
                    list.add(software);
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