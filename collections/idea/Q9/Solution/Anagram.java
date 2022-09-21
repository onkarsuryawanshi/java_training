package collections.idea.Q9.Solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    private Map<Character, Integer> getLetterFreq(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == null) {
                map.put(str.charAt(i), 1);
            } else {
                int freq = map.get(str.charAt(i));
                map.put(str.charAt(i), freq += 1);
            }
        }
        return map;
    }

    public ArrayList<String> getListAnagram(String[] lWord, String gWord) {
        ArrayList<String> list = new ArrayList<>();
        Map<Character, Integer> mapgWord = getLetterFreq(gWord);
        for (String str :
                lWord) {

            if (str.length() == gWord.length()) {
                Map<Character, Integer> mapStr = getLetterFreq(str);
//                System.out.println(mapStr);
                if (isAnagram(mapgWord, mapStr)) {
                    list.add(str);
                }
            }
        }

        return list;

    }

    private boolean isAnagram(Map<Character, Integer> mapG, Map<Character, Integer> mapStr) {

        return (mapG.keySet().equals(mapStr.keySet()));
    }
}
