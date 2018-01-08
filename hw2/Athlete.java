class Athlete {
	ShootingResult shootResult;
	SkiingResult skiiResult;
	String name;

	Athlete (ShootingResult shootresult, SkiingResult skiiresult, String name){
		this.shootResult = shootresult;
		this.skiiResult = skiiresult;
		this.name = name; 
	}


	// A method that takes another Athlete as input and produces the athlete 
	// with the better (lower) Skiier score. Assumed there are no ties.
	Athlete betterSkiier(Athlete other) {
		if (this.skiiResult.pointsEarned() > other.skiiResult.pointsEarned()) {
			return other;
		} else  {
			return this;
		}
	}

	// A method that takes another Athlete as input and returns a boolean indicating whether 
	// the athlete has either a higher Shooting score or a lower skiing score
	// than the given (input) Athlete (True, if the athlete has at least one 
	// better score than the given Athlete)
	boolean hasBeaten(Athlete another) {
		return ((this.shootResult.pointsEarned() > another.shootResult.pointsEarned()) || (this.skiiResult.pointsEarned() < another.skiiResult.pointsEarned()));
	}
}