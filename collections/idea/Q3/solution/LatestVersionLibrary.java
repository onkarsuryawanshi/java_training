package collections.idea.Q3.solution;

import collections.idea.Q3.Model.Library;

import java.util.*;

public class LatestVersionLibrary {
    private List<Library> customerList;

    public LatestVersionLibrary(List<Library> customerList) {
        this.customerList = customerList;
    }


    ///find the latest version for the libraryName
    public Map<String, Integer> FindingLatestVersion(Set<String> uniqueLibraryName) {
        Map<String, Integer> latestVersionMap = new HashMap<>();
        for (String libraryName : uniqueLibraryName) {
            Integer lastestVersion = 0;
            for (Library customerDetails : customerList) {
                if (libraryName.equals(customerDetails.getLibraryName()) && customerDetails.getLibraryVersion() > lastestVersion) {
                    lastestVersion = customerDetails.getLibraryVersion();
                }
            }
            latestVersionMap.put(libraryName, lastestVersion);
        }
        return latestVersionMap;
    }

    //Unique element of the libraryName
    public Set<String> findUniqueLibraryName() {
        Set<String> uniqueLibraryName = new HashSet<>();
        for (Library customerDetail : customerList) {
            uniqueLibraryName.add(customerDetail.getLibraryName());
        }
        return uniqueLibraryName;
    }

    public Set<String> findOutDatedVersion(Map<String, Integer> lastestVersion) {
        Set<String> outDatedVersion = new HashSet<>();
        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String, Integer> entry : lastestVersion.entrySet())
            for (Library library : customerList) {
                if (library.getLibraryName().equals(entry.getKey()) && library.getLibraryVersion() < entry.getValue()) {
                    outDatedVersion.add(library.getProductName());
                }
                ;
            }
        return outDatedVersion;
    }
}
