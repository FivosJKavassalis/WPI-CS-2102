import java.util.GregorianCalendar;
import java.util.LinkedList;

public class weatherSet implements IWeather{
	private LinkedList<DailyWeatherReport> report;

	public weatherSet() {
		this.report = new LinkedList<DailyWeatherReport>();
	}

	//Method: determines if the month and year specified are in the list.
	public int searchHigh(int month, int year) {

		int resultH = 0;
		int count = 0;

		for(DailyWeatherReport rr: report) {
			if(rr.isDate(month, year)) {
				resultH = resultH + rr.getH();
				count++;
			}
		}
		if(count == 0) {
			return 0;
		}
		return resultH/count;
	}

	//Method: determines if month and year specified are in the list.
	public int searchLow(int month, int year) {
		int resultL = 0;
		int count = 0;

		for(DailyWeatherReport rr: report) {
			if(rr.isDate(month, year)) {
				resultL = resultL + rr.getL();
				count++;
			}
		}
		if(count == 0) {
			return 0;
		}
		return resultL/count;
	}

	//Method: for storing DailyWeatherReports
	public void storeReport(GregorianCalendar date, LinkedList<Reading> readings) {

		int max = readings.getFirst().getTemp();
		int min = readings.getFirst().getTemp();
		Time t1 = new Time(0,0);
		Time t2 = new Time(0,0);

		for(Reading rr: readings) {
			if(rr.getTemp() > max) {
				max = rr.getTemp();
				t1 = rr.getTime();
			}
			if(rr.getTemp() < min) {
				min = rr.getTemp();
				t2 = rr.getTime();
			}
		}

		DailyWeatherReport storeData = new DailyWeatherReport(date, new Reading(t2,min),new Reading(t1, max));
		report.add(storeData);
	}

}
