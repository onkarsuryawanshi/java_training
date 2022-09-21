package collections.idea.Q8;

import collections.idea.Q8.Solution.Isogram;

public class Main {
    public static void main(String[] args) {
        String input = "lumberjacks";

        //defining the function to check whether entered string is an iso-gram or not
        Isogram isIsogram = new Isogram();
        boolean ans =isIsogram.isIsogramCheckSet(input);
        if (ans){
            System.out.println(input+"  is iso-gram ");
        }
        else{
            System.out.println(input+"  is not an iso-gram");
        }
    }
}