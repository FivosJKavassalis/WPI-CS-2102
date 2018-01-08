import java.util.LinkedList;

class DataSmooth2 {

	DataSmooth2(){}

	//Helper: Consumes a List of Episodes and calculates the average run time of those episodes

	public double average(LinkedList<Episode> episodes) {
		double sum = 0;

		for (int i=0; i < episodes.size(); i++) {
			sum = sum + episodes.get(i).runTime;
		} 
		return sum/episodes.size();
	}

	//Method: Consumes a list of Shows, 
	//calculates the average runtime for each show, and produces a list of 
	//the smoothed runTime values (not the entire records). The average runtime 
	//is the sum of the run times of all episodes in the show divided by the number 
	//of episodes.

	public LinkedList<Double> dataSmooth(LinkedList<Show> shows) {

		LinkedList<Double> smoothList = new LinkedList<Double>();

		if(!(shows.isEmpty())) {
			for(int i=0; i < shows.size(); i++) {
				if(i == 0) {
					smoothList.addFirst(average(shows.getFirst().episodes));
				} else if(i == shows.size() - 1) {
					smoothList.addLast(average(shows.getLast().episodes));
				}
				else {
					double element = (average(shows.get(i-1).episodes) + average(shows.get(i).episodes) + average(shows.get(i+1).episodes)) / 3;
					smoothList.add(element);
				}
			}
			return smoothList;
		} else {
			return smoothList;
		}
	}
}