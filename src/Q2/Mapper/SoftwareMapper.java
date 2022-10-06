package Q2.Mapper;

import Q2.Model.Software;

public class SoftwareMapper {
    public static Software map(String data) {
        String[] arr = data.split(",");
        String server = arr[0];
        String type = arr[1];
        String software = arr[2];
        String version = arr[3];
        Software softWare = new Software(server, type, software, version);
        return softWare;
    }
}
