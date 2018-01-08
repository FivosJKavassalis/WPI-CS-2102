// Homework #5 12/5/2017
//Josue Contreras
//Fivos Kavassalis

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Examples {

	public Examples(){} 

	LinkedList<Reading> listR = new LinkedList<Reading>();
	LinkedList<Reading> listR2 = new LinkedList<Reading>();
	LinkedList<Reading> listR3 = new LinkedList<Reading>();

	Reading r1 = new Reading(new Time(1, 20), 2);
	Reading r2 = new Reading(new Time(2, 40), 4);
	Reading r3 = new Reading(new Time(4, 60), 8);
	Reading r4 = new Reading(new Time(10, 60), 10);
	Reading r5 = new Reading(new Time(11, 15), 20);
	Reading r6 = new Reading(new Time(11, 16), 60);

	GregorianCalendar g1 = new GregorianCalendar(1997, 7, 4);
	GregorianCalendar g2 = new GregorianCalendar(1997, 7, 11);
	GregorianCalendar g3 = new GregorianCalendar(1997, 7, 25);
	GregorianCalendar g4 = new GregorianCalendar(2000, 5, 5);
	GregorianCalendar g5 = new GregorianCalendar(2000, 5, 29);
	GregorianCalendar g6 = new GregorianCalendar(2017, 0, 1);
	GregorianCalendar g7 = new GregorianCalendar(2017, 12, 5);

	weatherSet weath = new weatherSet();
	WeatherMonitor monit = new WeatherMonitor(weath);

	//--------------------Average High Test Cases-----------------------
	@Test 
	public void checkAverageHigh1() {

		listR.add(r1);
		monit.addDailyReport(g1, listR);
		int answer = monit.averageHighForMonth(8, 1997);

		assertEquals(2, answer);
	}

	@Test 
	public void checkAverageHigh2() {

		listR.add(r1);
		listR.add(r2);
		listR.add(r3);
		listR.add(r4);
		monit.addDailyReport(g1, listR);
		monit.addDailyReport(g4, listR);
		int answer = monit.averageHighForMonth(8, 1997);

		assertEquals(10, answer);
	}

	@Test 
	public void checkAverageHigh3() {

		listR.add(r1);
		listR.add(r2);
		listR.add(r3);
		listR.add(r4);
		listR2.add(r6);
		listR3.add(r5);
		monit.addDailyReport(g1, listR);
		monit.addDailyReport(g3, listR2);
		monit.addDailyReport(g2, listR3);
		int answer = monit.averageHighForMonth(8, 1997);

		assertEquals(30, answer);
	}

	@Test 
	public void checkAverageHigh4() {

		listR.add(r1);
		listR.add(r2);
		listR.add(r3);
		listR.add(r4);
		listR.add(r1);
		listR2.add(r6);
		listR2.add(r2);
		listR2.add(r5);
		monit.addDailyReport(g1, listR);
		monit.addDailyReport(g6, listR);
		monit.addDailyReport(g6, listR2);
		int answer = monit.averageHighForMonth(1, 2017);

		assertEquals(35, answer);
	}

	@Test 
	public void checkAverageHigh5() {

		listR.add(r1);
		listR.add(r2);
		listR.add(r3);
		listR.add(r4);
		listR.add(r1);
		listR2.add(r6);
		listR2.add(r2);
		listR2.add(r5);
		monit.addDailyReport(g1, listR);
		monit.addDailyReport(g6, listR);
		monit.addDailyReport(g6, listR2);
		int answer = monit.averageHighForMonth(9, 2017);

		assertEquals(0, answer);
	}


	//--------------------Average Low Test Cases-----------------------

	@Test
	public void checkAverageLow1() {
		listR.add(r1);
		listR.add(r2);
		monit.addDailyReport(g2, listR);
		int answer =  monit.averageLowForMonth(8, 1997);

		assertEquals(2, answer);
	}

	@Test 
	public void checkAverageLow2() {

		listR.add(r1);
		listR.add(r2);
		listR.add(r3);
		listR.add(r4);
		monit.addDailyReport(g1, listR);
		monit.addDailyReport(g4, listR);
		int answer = monit.averageLowForMonth(8, 1997);

		assertEquals(2, answer);
	}

	@Test 
	public void checkAverageLow3() {

		listR.add(r1);
		listR.add(r2);
		listR.add(r3);
		listR.add(r4);
		listR2.add(r6);
		monit.addDailyReport(g1, listR);
		monit.addDailyReport(g3, listR);
		monit.addDailyReport(g2, listR2);
		int answer = monit.averageLowForMonth(8, 1997);

		assertEquals(21, answer);
	}

	@Test 
	public void checkAverageLow4() {

		listR.add(r1);
		listR.add(r2);
		listR.add(r3);
		listR.add(r4);
		listR.add(r1);
		listR2.add(r6);
		listR2.add(r2);
		listR2.add(r5);
		monit.addDailyReport(g1, listR);
		monit.addDailyReport(g6, listR);
		monit.addDailyReport(g6, listR2);
		int answer = monit.averageLowForMonth(1, 2017);

		assertEquals(3, answer);
	}

	@Test 
	public void checkAverageLow5() {

		listR.add(r1);
		listR.add(r2);
		listR.add(r3);
		listR.add(r4);
		listR.add(r1);
		listR2.add(r6);
		listR2.add(r2);
		listR2.add(r5);
		monit.addDailyReport(g1, listR);
		monit.addDailyReport(g6, listR);
		monit.addDailyReport(g6, listR2);
		int answer = monit.averageLowForMonth(9, 2017);

		assertEquals(0, answer);
	}

}