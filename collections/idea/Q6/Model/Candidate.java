package collections.idea.Q6.Model;

public class Candidate {
    private int candidateId;
    private String name;
    private String area;
    private int votes;

    public Candidate(int candidateId, String name, String area, int votes) {
        this.candidateId = candidateId;
        this.name = name;
        this.area = area;
        this.votes = votes;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
}
