import java.util.LinkedList;

class ShowManager2 {

	ShowManager2() {}

	//Method: Consumes a list of Shows and produces a report containing daytime and prime time shows
	//primeTime is 5pm to 11pm 
	//dayTime is 6am to 5pm
	//Assume no similar names

	public ShowSummary organizeShows(LinkedList<Show> shows)
	{
		LinkedList<Show> result = cleaned(shows);

		LinkedList<Show> dayResult = separateDay(result);
		LinkedList<Show> primeResult = separatePrime(result);

		ShowSummary resultDone = new ShowSummary(dayResult, primeResult);
		return resultDone;
	}

	//Helper cleans list from any other shows beyond prime time and day time
	LinkedList<Show> cleaned(LinkedList<Show> mess){
		LinkedList<Show> clean = new LinkedList<Show>();

		for(Show cc : mess) {
			if((600.0 <= cc.broadcastTime) && (cc.broadcastTime < 2300.0)) {
				clean.add(cc);
			}
		}
		return clean;
	}

	//Helpers that separate prime and day time shows 
	LinkedList <Show> separateDay(LinkedList<Show> sd){
		LinkedList<Show> dayResult = new LinkedList<Show>();

		for(Show d : sd) {
			if((d.broadcastTime >= 600.0) && (d.broadcastTime < 1700.0)) {
				dayResult.add(d);
			}
		}
		return dayResult;
	}

	LinkedList <Show> separatePrime(LinkedList<Show> sp){
		LinkedList<Show> primeResult = new LinkedList<Show>();

		for(Show p : sp) {
			if((p.broadcastTime >= 1700.0) && (p.broadcastTime < 2300.0)) {
				primeResult.add(p);
			}
		}
		return primeResult;
	}


}
