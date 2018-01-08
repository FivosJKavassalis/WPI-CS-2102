// Homework #6 12/11/2017
//Josue Contreras
//Fivos Kavassalis

import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {

	public Examples() {}

	//------------------------------1st election test cases ----------------------------------
	// A method that sets up a ballot and casts votes
	public ElectionData Setup1 () {

		ElectionData ED = new ElectionData();

		try {
			// put candidates on the ballot
			ED.addCandidate("gompei");
			ED.addCandidate("husky");
			ED.addCandidate("ziggy");
			ED.addCandidate("Ziggy");
			ED.addCandidate("Fivos");

			// cast votes
			ED.processVote("gompei", "husky", "ziggy");
			ED.processVote("gompei", "ziggy", "husky");
			ED.processVote("husky", "gompei", "ziggy");
			ED.processVote("gompei", "husky", "Ziggy");
			ED.processVote("husky", "gompei", "ziggy");

		} catch (Exception e) {}
		return(ED);
	}

	@Test
	public void testMostFirstWinner () {
		assertEquals ("gompei", Setup1().findWinnerMostFirstVotes());
	}

	@Test 
	public void testMostPoints () {
		assertEquals ("gompei", Setup1().findWinnerMostPoints());
	}

	@Test(expected=CandidateExistsException.class)
	public void testMostFirstWinnerExc() throws CandidateExistsException {
		Setup1().addCandidate("ziggy");

	}

	@Test(expected=UnknownCandidateException.class)
	public void testMostPointsWinnerFirstUnknownExc() throws UnknownCandidateException, DuplicateVotesException {

		Setup1().processVote("lion", "ziggy", "gompei");

	}

	@Test(expected=UnknownCandidateException.class)
	public void testMostPointsWinnerSecondUnknownExc() throws UnknownCandidateException, DuplicateVotesException {

		Setup1().processVote("husky", "Husky", "gompei");

	}


	@Test(expected=DuplicateVotesException.class)
	public void testDuplicateExep1() throws DuplicateVotesException, UnknownCandidateException
	{
		Setup1().processVote("ziggy", "ziggy", "gompei");
	}


	@Test(expected=DuplicateVotesException.class)
	public void testDuplicateExep2() throws DuplicateVotesException, UnknownCandidateException
	{
		Setup1().processVote("ziggy", "husky", "ziggy");
	}


	@Test(expected=DuplicateVotesException.class)
	public void testDuplicateExep3() throws DuplicateVotesException, UnknownCandidateException
	{
		Setup1().processVote("husky", "ziggy", "ziggy");
	}


	@Test(expected=DuplicateVotesException.class)
	public void testDuplicateExep4() throws DuplicateVotesException, UnknownCandidateException
	{
		Setup1().processVote("husky", "husky", "husky");
	}


	@Test(expected=UnknownCandidateException.class)
	public void testMostPointsWinnerBothExc() throws UnknownCandidateException, DuplicateVotesException {

		Setup1().processVote("tiger", "tiger", "gompei");

	}

	//------------------------------2n election test cases ----------------------------------

	// A method that sets up a ballot and casts votes
	public ElectionData Setup2 () {

		ElectionData ED = new ElectionData();

		try {
			// put candidates on the ballot
			ED.addCandidate("gompei");
			ED.addCandidate("husky");
			ED.addCandidate("ziggy");
			ED.addCandidate("Ziggy");
			ED.addCandidate("Fivos");

			// cast votes
			ED.processVote("Fivos", "husky", "ziggy");
			ED.processVote("Fivos", "husky", "ziggy");
			ED.processVote("husky", "Fivos", "ziggy");
			ED.processVote("husky", "Fivos", "Ziggy");

		} catch (Exception e) {}
		return(ED);
	}

	@Test
	public void testMostFirstWinner2 () {
		assertEquals ("Runoff required", Setup2().findWinnerMostFirstVotes());
	}

	@Test
	public void testMostPoints2 () {
		assertEquals ("husky", Setup2().findWinnerMostPoints());
	}
}
