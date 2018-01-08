import java.util.LinkedList;

class DataSmooth1 {

	DataSmooth1(){}

	//Helper: Consumes a Show and calculates the average run time of its List of Episodes

	public double average(Show ashow) {
		double count;
		double sum;
		double average;

		count = 0;
		sum = 0;
		average = 0;

		for (Episode e : ashow.episodes) {
			sum = sum + e.runTime;
			count = count + 1;
			average = sum / count;
		} 
		return average;
	}

	//Method: Consumes a list of Shows, 
	//calculates the average runtime for each show, and produces a list of 
	//the smoothed runTime values (not the entire records). The average runtime 
	//is the sum of the run times of all episodes in the show divided by the number 
	//of episodes.

	public LinkedList<Double> dataSmooth(LinkedList<Show> shows) {

		LinkedList<Double> smoothList = new LinkedList<Double>();

		if(!(shows.isEmpty())) {
			for(int i=1; i < shows.size()-1; i++) {
				double element = (average(shows.get(i-1)) + average(shows.get(i)) + average(shows.get(i+1))) / 3;
				smoothList.add(element);
			}
			smoothList.addFirst(average(shows.getFirst()));
			smoothList.addLast(average(shows.getLast()));
			return smoothList;
		} else {
			return smoothList;
		}
	}
}
