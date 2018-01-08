import java.util.LinkedList;
import java.util.HashMap;


class ElectionData {
	private LinkedList<String> ballot = new LinkedList<String>();
	private HashMap<String, Integer> votes1stPlace = new HashMap<String, Integer>(); // Votes for first place for a candidate
	private HashMap<String, Integer> votes2ndPlace = new HashMap<String, Integer>(); // Votes for second place for a candidate
	private HashMap<String, Integer> votes3rdPlace = new HashMap<String, Integer>(); // Votes for third place for a candidate

	public ElectionData() {}

	// A method that takes three strings (for the first, second, and third choices, respectively) and returns void.
	// This method stores a single voter's choices in our data structure.
	public void processVote(String firstChoice, String secondChoice, String thirdChoice) throws UnknownCandidateException, DuplicateVotesException {
		if(ballot.contains(firstChoice)
				&& ballot.contains(secondChoice) 
				&& ballot.contains(thirdChoice)
				&&	!(firstChoice.equals(secondChoice)) 
				&& !(secondChoice.equals(thirdChoice)) 
				&& !(firstChoice.equals(thirdChoice))) /* do checks (helpers) here... -2 to be exact..! */{	

			for(String key : votes1stPlace.keySet()) {
				if(key.equals(firstChoice)) {
					votes1stPlace.put(key, votes1stPlace.get(key) + 1 );
				}
			}

			for(String key : votes2ndPlace.keySet()) {
				if(key.equals(secondChoice)) {
					votes2ndPlace.put(key, votes2ndPlace.get(key) + 1 );
				}
			}

			for(String key : votes3rdPlace.keySet()) {
				if(key.equals(thirdChoice)) {
					votes3rdPlace.put(key, votes3rdPlace.get(key) + 1 );
				}
			}
		} else if(!(ballot.contains(firstChoice))) {

			throw new UnknownCandidateException(firstChoice);

		} else if(!(ballot.contains(secondChoice))) {

			throw new UnknownCandidateException(secondChoice);

		} else if(!(ballot.contains(thirdChoice))) {

			throw new UnknownCandidateException(thirdChoice);

		} else if(firstChoice.equals(secondChoice)) {

			throw new DuplicateVotesException(firstChoice);

		} else if(secondChoice.equals(thirdChoice)) {

			throw new DuplicateVotesException(secondChoice);

		} else {

			throw new DuplicateVotesException(thirdChoice);
		}
	} 

	//  A method that takes one string (for the name of a candidate) and adds 
	// the candidate to the ballot, returning void.
	public void addCandidate(String nameCan) throws  CandidateExistsException {
		if(!(ballot.contains(nameCan))) {

			votes1stPlace.put(nameCan, 0);
			votes2ndPlace.put(nameCan, 0);
			votes3rdPlace.put(nameCan, 0);
			this.ballot.add(nameCan);
		} else {

			throw new CandidateExistsException(nameCan);

		} 
	}  

	//-------------------------------PRINTBALLOT----------------------------------------
	public void printBallot() {
		System.out.println("The candidates are ");
		for (String s : ballot) {
			System.out.println(s);
		}
	}


	//------------------------COUNTING VOTES METHODS-----------------------------------

	// A method that returns the sum of all the  
	// first place votes of all the candidates.
	private double helper(LinkedList<String> ballot) {
		double sum;

		sum = 0;
		for (String candidate : ballot) {
			sum = sum + votes1stPlace.get(candidate);
		}
		return sum;
	}


	// A method where winner is the candidate with more than 50% of first place votes. 
	// If there is a tie for the most votes between two or more candidates, or if no 
	// candidate receives more than 50% of the votes, return the string "Runoff required"
	public String findWinnerMostFirstVotes() {
		double percentage;
		double totalSum = helper(ballot);

		percentage = 0;
		for(String candidate : ballot) {
			percentage = votes1stPlace.get(candidate) / totalSum;

			if(percentage > (0.5)) {
				return candidate;
			}

		}
		return "Runoff required";
	}

	// A method that returns the winner, where the winner is the candidate with the most 
	// points gained from 1st, 2nd and 3rd place. If there is a tie between two or more 
	// candidates, it returns the name of any one of the winners.
	public String findWinnerMostPoints() {
		int mostPoints = 0;
		int points = 0; // careful
		String winner = ballot.getFirst();
		for(String candidate : ballot) {
			points = votes1stPlace.get(candidate) * 3 
					+ votes2ndPlace.get(candidate) * 2 
					+ votes3rdPlace.get(candidate);

			if(points > mostPoints) {
				mostPoints = points;
				winner = candidate;
			}
		}
		return winner;
	}	
}