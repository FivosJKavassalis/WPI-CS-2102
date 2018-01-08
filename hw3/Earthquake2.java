import java.util.LinkedList;

class Earthquake2 {
	Earthquake2(){}

	// checks whether a datum is a date
	boolean isDate(double anum) { return (int)anum > 10000000; }
	// extracts the month from an 8-digit date
	int extractMonth(double dateNum) { return ((int)dateNum % 10000) / 100; }

	//Method: consumes a list of sensor data (doubles) and a month (represented 
	//by a number between 1 and 12) and produces a list of reports (maxHzReport) 
	//indicating the highest frequency reading for each day in that month.

	public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month) {

		LinkedList<MaxHzReport> result = new LinkedList<MaxHzReport>();
		int currMonth = 0;
		Double currMax = 0.0;
		Double currDate = 0.0;

		if(data.size() == 0) {
			return result;
		}else {
			currDate = data.getFirst();
			currMonth = extractMonth(currDate);
		}

		for(int i = 1; i < data.size()  ; i++) {
			double find = data.get(i); 
			if (!isDate(find)) {
				if(find > currMax) {
					currMax = find;
				}
			}else { 
				if(month == currMonth) {
					MaxHzReport finished = new MaxHzReport(currDate, currMax);
					result.add(finished);
					currMax = 0.0;
					currDate = find;
					currMonth = extractMonth(find);
				}else {
					if(isDate(find)) {
						currMax = 0.0;
						currDate = find;
						currMonth = extractMonth(find);
					}
				}
			}

			//Check if it's the end of the list
			//Return the result List if both statements are true

			if((i == data.size()-1) && (month == currMonth)){
				if(find > currMax) {
					currMax = find;
				}
				MaxHzReport finishedLast = new MaxHzReport(currDate,currMax);
				result.add(finishedLast);
				return result;
			}
		}
		return result;
	}
}  