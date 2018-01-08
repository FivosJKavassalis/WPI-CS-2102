import java.util.LinkedList;

class ShowManager1 {

	ShowManager1() {}

	//Method: Consumes a list of Shows and produces a report containing daytime and prime time shows
	//primeTime is 5pm to 11pm 
	//dayTime is 6am to 5pm
	//Assume no similar names

	public ShowSummary organizeShows(LinkedList<Show> shows)
	{
		ShowSummary report = new ShowSummary();

		for(Show ch : shows) {
			if((ch.broadcastTime >= 600.0) && (ch.broadcastTime < 1700.0)) {
				report.daytime.add(ch);
			} else if ((ch.broadcastTime >= 1700.0) && (ch.broadcastTime < 2300.0)) {
				report.primetime.add(ch);
			}
		}
		return report;
	}
}
