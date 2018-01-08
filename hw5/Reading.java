
public class Reading {

	private Time time;
	private int temp; //Temperature in degrees Fahrenheit

	Reading(Time time, int temp){
		this.time = time;
		this.temp = temp;
	}

	//Getters:
	public int getTemp() {
		return this.temp;
	}

	public Time getTime() {
		return this.time;
	}

	//Boolean Methods:
	public boolean isHigh(int resultTemp) {
		return this.temp > resultTemp;
	}

	public boolean isLow(int resultTemp) {
		return this.temp < resultTemp;
	}
}
