
class SkiingResult extends AbsResult{

	ShootingResult shootResult;

	SkiingResult(double time, int position, ShootingResult shootResult){
		super(time, position);
		this.shootResult = shootResult;
	}

	// A method that adds 20 seconds for each target missed in each round 
	// and returns the modified time as a double

	double addShootingPenalties() {
		double modifiedTime;

		modifiedTime = 0;
		for (ShootingRound sr : this.shootResult.rounds) {
			modifiedTime = modifiedTime + ( 5 - sr.numTargets);
		}
		return this.time + 20 * modifiedTime;
	}

	// A method which takes no inputs and returns a double representing an athlete's score 
	// for a Skiing Result (overriding pointsEarned() in AbsResult).
	public double pointsEarned() {
		if (this.position == 1) {
			return addShootingPenalties() - 10;
		} else if (this.position == 2) {
			return addShootingPenalties() - 7;
		} else if (this.position == 3) {
			return addShootingPenalties() - 3;
		} else {
			return addShootingPenalties(); 	  
		}
	}
}