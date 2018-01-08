import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class EarthquakeExamples {
	Earthquake1 E1 = new Earthquake1();
	LinkedList<Double> noData = new LinkedList<Double>();
	LinkedList<Double> oneDate = new LinkedList<Double>(); 
	LinkedList<Double> threeDates = new LinkedList<Double>(); 
	LinkedList<Double> fourDates = new LinkedList<Double>(); 
	LinkedList<Double> fiveDates = new LinkedList<Double>(); 
	LinkedList<Double> sixDates = new LinkedList<Double>(); 

	LinkedList<MaxHzReport> FebReports = new LinkedList<MaxHzReport>();
	LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
	LinkedList<MaxHzReport> NoReports = new LinkedList<MaxHzReport>();
	LinkedList<MaxHzReport> AugReports = new LinkedList<MaxHzReport>();
	LinkedList<MaxHzReport> JanReports = new LinkedList<MaxHzReport>();
	LinkedList<MaxHzReport> MarReports = new LinkedList<MaxHzReport>();

	public EarthquakeExamples() {

		oneDate.add(20171026.0);
		oneDate.add(0.0);

		threeDates.add(20151013.0);
		threeDates.add(10.0);
		threeDates.add(5.0);
		threeDates.add(20151020.0);
		threeDates.add(40.0);
		threeDates.add(50.0);
		threeDates.add(45.0);
		threeDates.add(20151101.0);
		threeDates.add(6.0);

		fourDates.add(20170214.0);
		fourDates.add(18.0);
		fourDates.add(15.0);
		fourDates.add(200.0);
		fourDates.add(20170220.0);
		fourDates.add(400.0);
		fourDates.add(60.0);
		fourDates.add(345.0);
		fourDates.add(255.0);
		fourDates.add(20170301.0);
		fourDates.add(6.0);
		fourDates.add(20170420.0);
		fourDates.add(400.0);
		fourDates.add(60.0);
		fourDates.add(345.0);

		fiveDates.add(20170713.0);
		fiveDates.add(12.0);
		fiveDates.add(25.0);
		fiveDates.add(20170820.0);
		fiveDates.add(40.0);
		fiveDates.add(50.0);
		fiveDates.add(45.0); 
		fiveDates.add(20170826.0);
		fiveDates.add(10.0);
		fiveDates.add(10.0);
		fiveDates.add(20170830.0);
		fiveDates.add(20.0);
		fiveDates.add(30.0);
		fiveDates.add(100.0);
		fiveDates.add(270.0);
		fiveDates.add(20171101.0);
		fiveDates.add(6.0);
		fiveDates.add(16.0);

		sixDates.add(20170114.0);
		sixDates.add(27.2);
		sixDates.add(394.8);
		sixDates.add(20170119.0);
		sixDates.add(50.7);
		sixDates.add(20170125.0);
		sixDates.add(127.9);
		sixDates.add(20170127.0);
		sixDates.add(14.7);
		sixDates.add(20170129.0);
		sixDates.add(499.9);
		sixDates.add(20170130.0);
		sixDates.add(400.3);

		JanReports.add(new MaxHzReport(20170114.0,394.8));
		JanReports.add(new MaxHzReport(20170119.0,50.7));
		JanReports.add(new MaxHzReport(20170125.0,127.9));
		JanReports.add(new MaxHzReport(20170127.0,14.7));
		JanReports.add(new MaxHzReport(20170129.0,499.9));
		JanReports.add(new MaxHzReport(20170130.0,400.3));

		FebReports.add(new MaxHzReport(20170214.0,200.0));
		FebReports.add(new MaxHzReport(20170220.0,400.0));

		NovReports.add(new MaxHzReport(20151101.0,6.0));

		AugReports.add(new MaxHzReport(20170820.0,50.0));
		AugReports.add(new MaxHzReport(20170826.0,10.0));
		AugReports.add(new MaxHzReport(20170830.0,270.0));

		MarReports.add(new MaxHzReport(20171026.0,0.0));
	}

	@Test
	public void instructorTestEQ() { 
		assertEquals(NovReports, E1.dailyMaxForMonth(threeDates, 11));
	}

	@Test
	public void checkEmptyDataList() {
		assertEquals(NoReports, E1.dailyMaxForMonth(noData, 12));
	}

	@Test
	public void checkWrongMonth() {
		assertEquals(NoReports, E1.dailyMaxForMonth(fiveDates, 1));
	}

	@Test
	public void checkReportInBetween() {
		assertEquals(AugReports, E1.dailyMaxForMonth(fiveDates, 8));
	}

	@Test
	public void checkReportBegin() {
		assertEquals(FebReports, E1.dailyMaxForMonth(fourDates, 2));
	}

	@Test
	public void checkAcceptAll() {
		assertEquals(JanReports, E1.dailyMaxForMonth(sixDates, 1));
	}

	@Test
	public void check() {
		assertEquals(MarReports, E1.dailyMaxForMonth(oneDate, 10));
	}

	//Problem 3 Subtasks
	//Find date (8-digit number) and identify month (match month with input month)
	//Iterate through frequencies and produce the highest one for each date
	//When the iteration is finished return list of reports that denote the date and 
	//the highest frequency of that date (maxHzReport)
}