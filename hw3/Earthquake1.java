import java.util.LinkedList;

class Earthquake1 {
	Earthquake1(){}


	// checks whether a datum is a date
	boolean isDate(double anum) { return (int)anum > 10000000; }
	// extracts the month from an 8-digit date
	int extractMonth(double dateNum) { return ((int)dateNum % 10000) / 100; }

	//Method: consumes a list of sensor data (doubles) and a month (represented 
	//by a number between 1 and 12) and produces a list of reports (maxHzReport) 
	//indicating the highest frequency reading for each day in that month.

	public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month) {

		LinkedList<MaxHzReport> result = new LinkedList<MaxHzReport>();

		for(int i=0; i < data.size(); i++) {
			if(isDate(data.get(i)) && extractMonth(data.get(i)) == month) {
				double maxFrequency = 0;

				label1:for(int j=i+1; j < data.size(); j++) {
					if(j == data.size()-1) {
						if(maxFrequency < data.get(j)) {
							maxFrequency = data.get(j);
						}
						MaxHzReport element = new MaxHzReport(data.get(i), maxFrequency);
						result.add(element);
						break label1;

					} else if(isDate(data.get(j))) {
						MaxHzReport element = new MaxHzReport(data.get(i), maxFrequency);
						result.add(element);
						maxFrequency = 0;
						break label1;

					} else if(!isDate(data.get(j)) && !isDate(data.get(j+1))) {
						if(maxFrequency < data.get(j)) {
							maxFrequency = data.get(j);
						}
					} else if (!isDate(data.get(j)) && isDate(data.get(j+1))){
						if(maxFrequency < data.get(j)) {
							maxFrequency = data.get(j);
						}
						MaxHzReport element = new MaxHzReport(data.get(i), maxFrequency);
						result.add(element);
						maxFrequency = 0;
						break label1;
					} 
				}
			}
		}
		return result;	
	}
}