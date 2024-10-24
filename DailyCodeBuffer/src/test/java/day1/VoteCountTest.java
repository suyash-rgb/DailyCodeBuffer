package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VoteCountTest {

	@Test
    void testGetVoteCount_positiveVotes() {
        assertEquals(13, VoteCount.getVoteCount(13, 0));
    }

    @Test
    void testGetVoteCount_moreDownvotes() {
        assertEquals(-31, VoteCount.getVoteCount(2, 33));
    }

    @Test
    void testGetVoteCount_equalVotes() {
        assertEquals(0, VoteCount.getVoteCount(132, 132));
    }

}
