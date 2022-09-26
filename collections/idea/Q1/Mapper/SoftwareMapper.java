package collections.idea.Q1.Mapper;

import collections.idea.Q1.model.Software;
import collections.idea.Q2.Model.CustomerDetail;

public class SoftwareMapper {
    public static Software map(String data){
        String[] arr = data.split(",");
        String server = arr[0];
        String type = arr[1];
        String software = arr[2].trim();
        Integer version = Integer.valueOf(arr[3].replace(".","0").trim());
        Software softW = new Software(server,type,software,version);
        return softW;
    }
}
