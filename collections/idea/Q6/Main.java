package collections.idea.Q6;


import collections.idea.Q6.Model.Candidate;
import collections.idea.Q6.solution.Constituency;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String [] inputData= {"22, Ravi Pawar, Aundh, 1603",
                "23, Suvarna Kale, Baner, 803",
                "27, Vinod Chavan, Aundh, 809",
                "29, Vasant Mahajan, Aundh, 617",
                "32, Aarti Patil, Baner, 351",
                "34, Swaran Bijur, Baner, 352"};


        Constituency constituency = new Constituency();

        // map input array to list of Student
        List<Candidate> candidateList = constituency.mapInputArrayToListOfCandidate(inputData);

        ///finding unique area
        Set<String> uniqueAreaSet = constituency.findingUniqueArea(candidateList);
//        System.out.println(uniqueAreaSet);


        ////finding Highest votes
        Map<String, Integer> highestVotesMap = constituency.findingHighestVotes(candidateList, uniqueAreaSet);
//        System.out.println(highestVotesMap);


        ///finding candidate ID
        Map<String,Integer> findId = constituency.findingIdForHighestVotes(candidateList, highestVotesMap);
        for (Map.Entry<String, Integer> entry : findId.entrySet()){
            System.out.println("area==>"+ entry.getKey() + "    Votes==>"+ entry.getValue());
        }

    }
}
