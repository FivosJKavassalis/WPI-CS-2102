
class SkiingResult implements IEvent {

	double time; // the time (in seconds) at which the athlete crossed the finish line in the cross-country race
	int position; // the athlete's position in the finishing order
	ShootingResult shootResult;

	SkiingResult(double time, int position, ShootingResult shootResult){
		this.time = time;
		this.position = position;
		this.shootResult = shootResult;
	}

	// a method that adds 20 seconds for each target (out of five) missed in each round 
	// and returns the modified time as a double

	public double addShootingPenalties(ShootingResult shootResult) {
		double modifiedTime = (this.time + (20 * (20 - (shootResult.round1.numTargets 
				+ shootResult.round2.numTargets 
				+ shootResult.round3.numTargets 
				+ shootResult.round4.numTargets))));

		return modifiedTime;
	}

	// a method which takes no inputs and returns a double representing an athlete's score 
	// for a Skiing Result.

	public double pointsEarned() {
		if (this.position == 1) {
			return addShootingPenalties(this.shootResult) - 10;
		} else if (this.position == 2) {
			return addShootingPenalties(this.shootResult) - 7;
		} else if (this.position == 3) {
			return addShootingPenalties(this.shootResult) - 3;
		} else {
			return addShootingPenalties(this.shootResult); 	  
		}
	}
}
