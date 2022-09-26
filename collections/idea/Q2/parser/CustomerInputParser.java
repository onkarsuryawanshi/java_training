package collections.idea.Q2.parser;

import collections.idea.Q2.Mapper.CustomerMapper;
import collections.idea.Q2.Model.CustomerDetail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CustomerInputParser {
    public List<CustomerDetail> parseCSVFile(String filePath) {
        List<CustomerDetail> list = new ArrayList<>();
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
                    CustomerDetail customer = CustomerMapper.map(st);
                    list.add(customer);
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
