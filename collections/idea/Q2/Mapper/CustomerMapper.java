package collections.idea.Q2.Mapper;

import collections.idea.Q2.Model.CustomerDetail;
import collections.idea.Q4.model.Student;
//Rajan Patil, Aundh, 1, Phone Cover, Rs 170, Cash
public class CustomerMapper {
    public static CustomerDetail map(String data){
        String[] arr = data.split(",");
        String customerName = arr[0];
        String customerLocation = arr[1];
        Integer dateOfMonth = Integer.parseInt(arr[2].trim());
        String productName = arr[3].trim();
        Integer price = Integer.parseInt(arr[4].trim());
        String payment = arr[5];
        CustomerDetail customerDetail = new CustomerDetail(customerName,customerLocation,dateOfMonth,productName,price,payment);
        return customerDetail;
    }
}
