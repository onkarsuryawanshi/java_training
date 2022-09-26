package collections.idea.Q1.solution;

import collections.idea.Q1.model.Software;

import java.util.*;

public class SoftwarePackageOutOfDate {
    List<Software> softwareList;

    public SoftwarePackageOutOfDate(List<Software> softwareList) {
        this.softwareList = softwareList;
    }


    public Set<String> FindUniqueSoftware() {
        Set<String> uniqueSoftware = new HashSet<>();
        for (Software software :
                softwareList) {

            uniqueSoftware.add(software.getSoftware());
        }
        return uniqueSoftware;
    }

    public Map<String, Integer> FindLatestSoftware(Set<String> uniqueSoftware) {
        Map<String, Integer> latestSoftware = new HashMap<>();
        for (String unique : uniqueSoftware) {
            Integer maxSotwareVersion = 0;
            for (Software software : softwareList) {
                if (software.getSoftware().equals(unique) && software.getVersion() > maxSotwareVersion) {
                    maxSotwareVersion = software.getVersion();
                }
            }
            latestSoftware.put(unique, maxSotwareVersion);
        }
        return latestSoftware;
    }

    public Set<String> findOutdatedSoftware(Map<String, Integer> latestSoftware) {
        Set<String> outDatedSoftware = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : latestSoftware.entrySet())
            for (Software software : softwareList) {
                if (entry.getValue() < software.getVersion()) {
                    if (!list.contains(software.getServer())) {
                        list.add(software.getServer());
                        if (list.size() > 1) {
                            outDatedSoftware.add(software.getSoftware());
                        }
                    }
                }
            }

        return outDatedSoftware;
    }
}
