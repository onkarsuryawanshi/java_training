package collections.idea.Q6;

import collections.idea.Q5.Employee;

import java.util.*;

public class Constituency {
    public static void main(String[] args) {
        String [] input= {"22, Ravi Pawar, Aundh, 1603",
                "23, Suvarna Kale, Baner, 803",
                "27, Vinod Chavan, Aundh, 809",
                "29, Vasant Mahajan, Aundh, 617",
                "32, Aarti Patil, Baner, 351",
                "34, Swaran Bijur, Baner, 352"};
        ///converting string into array of Candidate Objects
        List<Candidate> candidateList = parsing_input(input);

        ///finding unique area
        Set<String> set = findingUniqueArea(candidateList);
        System.out.println(set);

        ////finding Highest votes
        Map<String, Integer> map = findingHighestVotes(candidateList, set);
        System.out.println(map);


        ///finding candidate ID
        findingIdForHighestVotes(candidateList, map);

    }

    private static void findingIdForHighestVotes(List<Candidate> candidateList, Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet())
            for (Candidate c :
                    candidateList) {
                if (c.getArea() == entry.getKey() && c.getVotes() == entry.getValue()) {
                    System.out.println("area-->" + c.getArea() + "    id-->" + c.getCandidateId());
                }
            }
    }

    private static Map<String, Integer> findingHighestVotes(List<Candidate> candidateList, Set<String> set) {
        Map<String, Integer> map = new HashMap<>();
        for (String s :
                set) {
            int max_votes= 0;
            for (Candidate c :
                    candidateList) {
                if (c.getVotes() > max_votes && c.getArea() == s) {
                    max_votes = c.getVotes();

                }

            }
            map.put(s, max_votes);

        }
        return map;
    }

    private static Set<String> findingUniqueArea(List<Candidate> candidateList) {
        Set<String> hash_Set = new HashSet<String>();
        for (Candidate c :
                candidateList) {

            hash_Set.add(c.getArea());

        }
        return hash_Set;
    }

    private static List<Candidate> parsing_input(String[] input) {
        List<Candidate> candidateList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            String[] currArr = input[i].split(",");
            int candidateId = Integer.parseInt(currArr[0]);
            String name = currArr[1];
            String area = currArr[2];
            int votes = Integer.parseInt(currArr[3].strip());

            Candidate c = new Candidate(candidateId,name,area,votes);

            candidateList.add(c);
        }
        return candidateList;
    }
}
