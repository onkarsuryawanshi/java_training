package collections.idea.Q3.Mapper;

import collections.idea.Q2.Model.CustomerDetail;
import collections.idea.Q3.Model.Library;

//Rajan Patil, Aundh, 1, Phone Cover, Rs 170, Cash
public class LibraryMapper {
    public static Library map(String data){
        String[] arr = data.split(",");
        String productName = arr[0];
        String libraryName = arr[1];
        Integer libraryVersion = Integer.valueOf(arr[2].replace("v","").trim());

        Library library = new Library(productName,libraryName,libraryVersion);

        return  library;
    }
}
