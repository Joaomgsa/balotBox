package entities;

import java.util.Objects;

public class VoteCount {

    private String candidate;
    private Integer vote;

    public VoteCount(String candidate, Integer vote) {
        this.candidate = candidate;
        this.vote = vote;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public Integer getVote() {
        return vote;
    }

    public void setVote(Integer vote) {
        this.vote = vote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VoteCount voteCount = (VoteCount) o;
        return Objects.equals(candidate, voteCount.candidate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(candidate);
    }
}
