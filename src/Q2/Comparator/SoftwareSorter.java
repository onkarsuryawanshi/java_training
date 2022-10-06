package Q2.Comparator;

import Q2.Model.Software;

import java.util.Comparator;

public class SoftwareSorter implements Comparator<Software> {
    @Override
    public int compare(Software software, Software other) {
        return software.getSoftware().compareTo(other.getSoftware());
    }
}
