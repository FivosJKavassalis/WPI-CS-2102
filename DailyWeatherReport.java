import java.util.GregorianCalendar;

public class DailyWeatherReport  {

	private GregorianCalendar date;
	//Makes more sense to be a Reading than an int because the time stamp can be stored
	private Reading lowTemp;
	private Reading highTemp;

	DailyWeatherReport(GregorianCalendar date, Reading lowTemp, Reading highTemp){
		this.date = date;
		this.lowTemp = lowTemp;
		this.highTemp = highTemp;
	}

	//Returns a boolean if the month and year are the same
	public boolean isDate(int month, int year) {
		return ((this.date.get(GregorianCalendar.MONTH) == month) 
				&& (this.date.get(GregorianCalendar.YEAR) == year));
	}

	//-----------Getters------------------
	public int getH() {
		return this.highTemp.getTemp();
	}

	public int getL() {
		return this.lowTemp.getTemp();
	}

}
