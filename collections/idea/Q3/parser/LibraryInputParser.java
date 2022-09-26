package collections.idea.Q3.parser;

import collections.idea.Q2.Mapper.CustomerMapper;
import collections.idea.Q2.Model.CustomerDetail;
import collections.idea.Q3.Mapper.LibraryMapper;
import collections.idea.Q3.Model.Library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LibraryInputParser {
    public List<Library> parseCSVFile(String filePath) {
        List<Library> list = new ArrayList<>();
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
                    Library library = LibraryMapper.map(st);
                    list.add(library);
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
