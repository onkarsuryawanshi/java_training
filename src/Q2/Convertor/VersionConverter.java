package Q2.Convertor;
import java.util.ArrayList;
import java.util.List;

public class VersionConverter {
    public String getConvertedVersion(String version) {

        List<String> versionList = List.of(version.trim().split("\\."));
        List<String> versionFormates = new ArrayList<>();
        for (String s : versionList) {
            if (s.length() == 1) {
                s = "0" + s;
                versionFormates.add(s);
            } else {
                versionFormates.add(s);
            }
        }
        String newVersion = String.valueOf(versionFormates.stream().reduce((preVersion, currVersion) -> preVersion + "." + currVersion));
        return newVersion;
    }
}
