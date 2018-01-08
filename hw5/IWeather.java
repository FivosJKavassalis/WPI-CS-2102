import java.util.GregorianCalendar;
import java.util.LinkedList;

public interface IWeather {

	//Interface that allows us to implement different data structures
	public int searchHigh(int month, int year);
	public int searchLow(int month, int year);
	public void storeReport(GregorianCalendar date, LinkedList<Reading> readings);
}
