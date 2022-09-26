package collections.idea.Q3;

import collections.idea.Q3.Model.Library;
import collections.idea.Q3.parser.LibraryInputParser;
import collections.idea.Q3.solution.LatestVersionLibrary;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        //parse input array to list
        LibraryInputParser inputParser = new LibraryInputParser();


        List<Library> libraryList = null;
        String filePath = "/home/onkars/Workspace/intellij/java_training/JavaCollectionsCodingExercise2/collections/idea/Q3/inputFile/input.txt";
        libraryList = inputParser.parseCSVFile(filePath);

        LatestVersionLibrary latestVersionLibrary = new LatestVersionLibrary(libraryList);
        //Unique element of the libraryName
        Set<String> uniqueLibraryName = latestVersionLibrary.findUniqueLibraryName();

        ///find the latest version for the libraryName
        Map<String, Integer> lastestVersion = latestVersionLibrary.FindingLatestVersion(uniqueLibraryName);

        //finding the outdated version
        Set<String> outDatedVersion = latestVersionLibrary.findOutDatedVersion(lastestVersion);

        for (String productName : outDatedVersion) {
            System.out.println(productName);
        }
    }
}