package collections.idea.Q1;


import collections.idea.Q1.model.Software;
import collections.idea.Q1.parser.InputParser;
import collections.idea.Q1.solution.SoftwarePackageOutOfDate;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //parse input array to list of Software
        InputParser inputParser = new InputParser();

        List<Software> softwareList = null;
        String filePath = "/home/onkars/Workspace/intellij/java_training/JavaCollectionsCodingExercise2/collections/idea/Q1/inputFile/input.txt";
        softwareList = inputParser.parseCSVFile(filePath);

        SoftwarePackageOutOfDate softwarePackageOutOfDate = new SoftwarePackageOutOfDate(softwareList);


        //find the unique software list
        Set<String> uniqueSoftware = softwarePackageOutOfDate.FindUniqueSoftware();

        //finding latest version of the software
        Map<String, Integer> latestSoftware = softwarePackageOutOfDate.FindLatestSoftware(uniqueSoftware);


        //Find the OutOfDated software which is installed on more than one server
        Set<String> outDatedSoftware = softwarePackageOutOfDate.findOutdatedSoftware(latestSoftware);

        System.out.println(outDatedSoftware);
    }
}
