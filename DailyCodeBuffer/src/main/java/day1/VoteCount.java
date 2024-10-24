package day1;
// Upvotes vs Downvotes
// Given an object containing counts of both upvotes and downvotes, return what vote count should be displayed.
// This is calculated by subtracting the number of downvotes from upvotes.

public class VoteCount {

	public static int getVoteCount(int upvotes, int downvotes) {
        return upvotes - downvotes;
    }

    public static void main(String[] args) {
        System.out.println(getVoteCount(13, 0));  // ➞ 13
        System.out.println(getVoteCount(2, 33));  // ➞ -31
        System.out.println(getVoteCount(132, 132));  // ➞ 0
    }

}
