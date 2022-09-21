package collections.idea.Q6.solution;

//import collections.idea.Q6.Candidate;
import collections.idea.Q6.Model.Candidate;

import java.util.*;

public class Constituency {
    // map input array to list of Student
    public List<Candidate> mapInputArrayToListOfCandidate(String[] studentData) {
        List<Candidate> CandidateList = new ArrayList<>();
        for (int i = 0; i < studentData.length; i++) {
            String[] currArr = studentData[i].split(",");

            int candidateId = Integer.parseInt(currArr[0]);
            String candidateName = currArr[1];
            String candidateArea = currArr[2];
            int candidatevotes = Integer.parseInt(currArr[3].trim());


            Candidate s = new Candidate(candidateId, candidateName, candidateArea, candidatevotes);
            CandidateList.add(s);
        }
        return CandidateList;
    }

    public Set<String> findingUniqueArea(List<Candidate> candidateList) {
        Set<String> uniqueAreaSet = new HashSet<String>();
        for (Candidate c :
                candidateList) {

            uniqueAreaSet.add(c.getArea());

        }
        return uniqueAreaSet;
    }

    public Map<String, Integer> findingHighestVotes(List<Candidate> candidateList, Set<String> uniqueAreaSet) {

        Map<String, Integer> highestVotesMap = new HashMap<>();
        for (String s :
                uniqueAreaSet) {
            int max_votes= 0;
            for (Candidate c :
                    candidateList) {
                if (c.getVotes() > max_votes && c.getArea() == s) {
                    max_votes = c.getVotes();

                }

            }
            highestVotesMap.put(s, max_votes);

        }
        return highestVotesMap;
    }

    public Map<String, Integer> findingIdForHighestVotes(List<Candidate> candidateList, Map<String, Integer> highestVotesMap) {
        Map<String,Integer> findId = new HashMap<>();
        for (Map.Entry<String, Integer> entry : highestVotesMap.entrySet())
            for (Candidate c :
                    candidateList) {
                if (c.getArea() == entry.getKey() && c.getVotes() == entry.getValue()) {
                    findId.put(c.getArea(),c.getCandidateId());
//                    System.out.println("area-->" + c.getArea() + "    id-->" + c.getCandidateId());
                }
            }
        return findId;
    }
}
