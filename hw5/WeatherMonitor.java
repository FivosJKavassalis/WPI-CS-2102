import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {

	private IWeather weather;

	public WeatherMonitor(IWeather weather) {
		this.weather = weather;	
	}

	//Note: GregorianCalendar discrepancy is fixed with subtracting a one in methods

	//Method1: takes month (1 for Jan, 2 for Feb, etc.) and a 
	//year and produces the average high temp over all that month 

	public int averageHighForMonth(int month, int year) {
		return weather.searchHigh(month-1, year);	
	}

	//Method2:takes in month (1 for Jan, 2 for Feb, etc.) and a 
	//year and produces the average low temp over all that month 
	public int averageLowForMonth(int month, int year) {
		return weather.searchLow(month-1, year);
	}

	//Method3: Consumes a date and list of readings and stores a 
	//daily report for the given date(computing high and low temps
	//for the given list of readings for the date)
	//GregorianCalendar(year,month,day)
	public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings){
		weather.storeReport(date,readings);
	}
}
