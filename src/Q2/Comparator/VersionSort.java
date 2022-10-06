package Q2.Comparator;

import Q2.Convertor.VersionConverter;
import Q2.Model.Software;

import java.util.Comparator;

public class VersionSort implements Comparator<Software> {
    VersionConverter versionConverter = new VersionConverter();

    @Override
    public int compare(Software software, Software t1) {
        return versionConverter.getConvertedVersion(software.getVersion()).compareTo(versionConverter.getConvertedVersion(t1.getVersion()));
    }
}
