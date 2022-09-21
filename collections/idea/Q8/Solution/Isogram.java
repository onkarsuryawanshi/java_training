package collections.idea.Q8.Solution;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Isogram {
    public boolean isIsogramCheckMap(String input) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            if (map.get(input.charAt(i)) == null) {
                map.put(input.charAt(i), 1);
            } else {
                int freq = map.get(input.charAt(i));
                map.put(input.charAt(i), freq += 1);
            }
        }
       // System.out.println(map);
        boolean isIso = true;
        for (Integer n : map.values()) {
            if (n > 1) {
                isIso = false;
                break;
            }
        }

        return isIso;
    }
    public boolean isIsogramCheckSet(String input){
        Set<Character> set  = new HashSet<>();
        boolean isIso = true;

        for (int i = 0; i < input.length(); i++) {
            set.add(input.charAt(i));
        }
        if (input.length()!= set.size()){
            isIso=false;
        }
        return isIso;
    }

}
