import java.util.LinkedList;

class ShootingResult implements IEvent {

	LinkedList<ShootingRound> rounds;

	ShootingResult(LinkedList<ShootingRound> rounds) {
		this.rounds = rounds;
	}

	// A method which takes no inputs and returns a double representing an athlete's score 
	// for a ShootingResult
	public double pointsEarned() {
		double sum;
		sum = 0;
		for(ShootingRound sr : this.rounds) {
			sum = sum + sr.numTargets;
		}
		return sum;
	}

	// A method that returns the best round in the list
	ShootingRound bestRound() {
		ShootingRound best;
		best = new ShootingRound(0);
		for(ShootingRound s : rounds) {
			if (s.numTargets > best.numTargets) {
				best = s;
			}
		}
		return best;
	}

}