import java.util.Scanner;

class VotingMachine {

	private Scanner keyboard = new Scanner(System.in);	
	private ElectionData ED = new ElectionData();

	VotingMachine(ElectionData ED) {
		this.ED = ED;

	}

	public void screen() {
		ED.printBallot();
		System.out.println("Who do you want to vote for first place?");
		String firstCandidate = keyboard.next();
		System.out.println("Who do you want to vote for second place?");
		String secondCandidate = keyboard.next();
		System.out.println("Who do you want to vote for third place?");
		String thirdCandidate = keyboard.next();
		try {
			ED.processVote(firstCandidate, secondCandidate, thirdCandidate);
			System.out.println("Congratulations! Your vote has been submitted!");

		} catch (UnknownCandidateException e) {
			System.out.println("Try Again. At least one of the candidates that were voted are not included in the ballot.");
			this.screen();

		} catch (DuplicateVotesException e) {
			System.out.println("Try Again. You have voted for one canditate more than once");
			this.screen();
		}
	}
}
