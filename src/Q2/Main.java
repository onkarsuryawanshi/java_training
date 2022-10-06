package Q2;

import Q2.Model.Software;
import Q2.Solution.SoftwareOpeations;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] serversInformation = {
                "Server1, Database, MySQL, 5.5",
                "Server2, Database, MySQL, 5.1",
                "Server3, OS, Ubuntu, 12.04",
                "Server1, OS, Ubuntu, 12.04",
                "Server2, OS, Ubuntu, 18.04",
                "Server3, Language, Python, 2.6.3",
                "Server4, Language, Python, 3.9.14",
                "Server4, Language, Python, 3.10.4"
        };
        SoftwareOpeations softwareOpeations = new SoftwareOpeations(serversInformation);

        //1.create a list of Server from serversInformation.
        softwareOpeations.CreateList();

//        2.Sort the list on Server name.
//        List<Software> sortedByName = softwareOpeations.sortByServerName();

        //3.sort the list on server name and version
        List<Software> sortBynameVersion = softwareOpeations.sortByNameSoftwareVersion();

        //sort the list on version number
//        softwareOpeations.sortByVersion();
        // 4. get distinct server names.
//        softwareOpeations.getDistinctServerName();
//
        //5.filter records for a given server name
//        softwareOpeations.filterByServer();


        //6.
        softwareOpeations.mapSoftwareSortedsetVersion();

//
    }
}
