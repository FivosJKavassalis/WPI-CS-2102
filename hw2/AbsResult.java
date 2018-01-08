
abstract class AbsResult implements IEvent {

	//appropriate details shared between SkiingResult and MassStartResult
	double time;
	int position;

	AbsResult(double time, int position){
		this.time = time;
		this.position = position; 
	}

	//the pointsEarned for a mass start race is simply the finishing time (position is irrelevant)
	public double pointsEarned() {
		return time;
	}
}
