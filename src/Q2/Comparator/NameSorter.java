package Q2.Comparator;

import Q2.Model.Software;

import java.util.Comparator;

public class NameSorter implements Comparator<Software> {

    @Override
    public int compare(Software s1, Software s2) {
        return  (s1.getServer().compareTo(s2.getServer())) ;
    }
}