package Q2.Solution;

import Q2.Comparator.VersionSort;
import Q2.Convertor.VersionConverter;
import Q2.Mapper.SoftwareMapper;
import Q2.Model.Software;

import java.util.*;
import java.util.stream.Collectors;

public class SoftwareOpeations {
    private List<Software> softwareList = new ArrayList<>();
    private String[] softwareData;

    public SoftwareOpeations(String[] softwareData) {
        this.softwareData = softwareData;
    }

    public void CreateList() {
        SoftwareMapper softwareMapper = new SoftwareMapper();
        for (String software : softwareData) {
            softwareList.add(SoftwareMapper.map(software));
        }
    }


    public List<Software> sortByServerName() {
//        Collections.sort(softwareList, new NameSorter());
//        System.out.println("Sorted by software Name:--");
//        for (Software software: softwareList)
//            System.out.println (software.toString() );
        System.out.println("sorting by the name");
        return softwareList.stream()
                .sorted(Comparator.comparing(Software::getServer)).collect(Collectors.toList());
    }

    public List<Software> sortByNameSoftwareVersion() {
            this.softwareList.sort((server,other)->{
                int res = server.getServer().compareTo(other.getServer());
                        if(res==0){
                            res = server.getSoftware().compareTo(other.getSoftware());
                            if(res==0){
                                res = server.getVersion().compareTo(other.getVersion());
                            }
                        }
                        return res;
            });
            return this.softwareList;
    }

    public void getDistinctServerName() {
        Set distictServerName = softwareList.stream().map(e -> e.getServer()).collect(Collectors.toSet());
        System.out.println(distictServerName);
    }

    public void filterByServer() {
        String inputServerName = "Server1";
        List<Software> filterByServer = softwareList.stream()
                .filter(software -> software.getServer().equals(inputServerName))
                .collect(Collectors.toList());
        System.out.println(filterByServer);

    }

    public void sortByVersion() {
        Collections.sort(softwareList, new VersionSort());
        System.out.println(softwareList);
    }

    public void mapSoftwareSortedsetVersion() {
        Map<String, String> versionUpdatedMap = new HashMap<>();
        Set<String> softwareSet = new HashSet<>();
        for (Software software : softwareList) {
            softwareSet.add(software.getSoftware());
        }
        Map<String, TreeMap<String, String>> mapSoftwareVersion = new HashMap<>();
        for (String softW : softwareSet) {
            Map<String, String> treemap = new TreeMap<>();

            for (Software software : softwareList) {
                if (softW.equals(software.getSoftware())) {
                    String newVersion = new VersionConverter().getConvertedVersion(software.getVersion());
                    versionUpdatedMap.put(newVersion, software.getVersion());
                    treemap.put(newVersion, software.getVersion());
                }
            }
            mapSoftwareVersion.put(softW, (TreeMap<String, String>) treemap);
        }
        // using for-each loop for iteration over Map.entrySet()
        Map<String, List<String>> responseMap = new HashMap<>();
        for (Map.Entry<String, TreeMap<String, String>> entry : mapSoftwareVersion.entrySet()) {
            TreeMap<String, String> treeMap = entry.getValue();
            List<String> list = new ArrayList<>();
            for (Map.Entry<String, String> entry1 : treeMap.entrySet()) {
                list.add(entry1.getValue());
            }
            responseMap.put(entry.getKey(), list);
        }
        System.out.println(responseMap);
    }

}
