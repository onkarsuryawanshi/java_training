package collections.idea.Q9;

import collections.idea.Q9.Solution.Anagram;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] lWord= {"enlists" ,"google" ,"inlets", "banana"};
        String gWord= "listen";
        Anagram anagram = new Anagram();
        ArrayList<String> list = anagram.getListAnagram(lWord,gWord);
        System.out.println(list.toString());
    }
}
