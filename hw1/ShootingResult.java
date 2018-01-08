
class ShootingResult implements IEvent{
	ShootingRound round1;
	ShootingRound round2;
	ShootingRound round3;
	ShootingRound round4;

	ShootingResult(ShootingRound round1, ShootingRound round2, ShootingRound round3, ShootingRound round4) {
		this.round1 = round1;
		this.round2 = round2;
		this.round3 = round3;
		this.round4 = round4;
	}

	// a method which takes no inputs and returns a double representing an athlete's score 
	// for a Shooting Result.

	public double pointsEarned() {
		return (this.round1.numTargets 
				+ this.round2.numTargets 
				+ this.round3.numTargets 
				+ this.round4.numTargets);
	}

}
