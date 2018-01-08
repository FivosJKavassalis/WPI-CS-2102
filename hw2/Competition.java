import java.util.LinkedList;

class Competition{
	LinkedList<Athlete> athletes; 
	int numShootingRounds; //non-negative number indicating the number of shooting rounds

	Competition(int numShootingRounds, LinkedList<Athlete> athletes){
		this.athletes = athletes;
		this.numShootingRounds = numShootingRounds;
	}

	// Produces a LinkedList of the names of the Athletes in the competition whose list of 
	// ShootingRounds is less than the number of rounds stored in the Competition class
	LinkedList<String> shootingDNF(){
		LinkedList<String> namesOfAthletes;

		namesOfAthletes = new LinkedList<String>();
		for (Athlete a : this.athletes) {
			if (a.shootResult.rounds.size() < numShootingRounds) {
				namesOfAthletes.add(a.name); 
			}
		}	
		return namesOfAthletes;
	}

	// takes the name of an athlete and returns the score that the athlete earned in the skiing race
	double skiingScoreForAthlete(String nameAthlete) {
		double score;

		score = 0;
		for (Athlete ath : athletes) {
			if (nameAthlete == ath.name) {
				score = ath.skiiResult.pointsEarned();
				return score;
			}
		}
		return score;
	}

	// takes another Competition as input and returns true if any of the athletes in 
	// "this" competition had a better Skiing score than they had in the given competition
	boolean anySkiingImprovement(Competition other) {
		boolean improvement;

		improvement = false;
		for (Athlete at : athletes) {
			for (Athlete athl : other.athletes) {
				if ((at.name == athl.name) && (at.skiiResult.pointsEarned() < athl.skiiResult.pointsEarned())) {
					return true ; 
				}
			}
		}	
		return improvement;
	}

	//10. Method skiingScoreForAthlete is a pretty short method and does not require 
	// any simplification or helper function. On the other hand, for the anySkiingImprovement
	// method it could use the skiingScoreForAthletes method, as a helper, instead of the 
	// nested for loop. Apart from that we are pretty happy with how we organized our code.

}