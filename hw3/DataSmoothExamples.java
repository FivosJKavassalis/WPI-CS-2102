import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class DataSmoothExamples 
{  
	LinkedList<Show> shows = new LinkedList<Show>();
	LinkedList<Show> shows1 = new LinkedList<Show>();
	LinkedList<Show> shows2 = new LinkedList<Show>();
	LinkedList<Show> shows3 = new LinkedList<Show>();
	LinkedList<Show> shows4 = new LinkedList<Show>();
	LinkedList<Show> shows5 = new LinkedList<Show>();
	LinkedList<Double> showResults = new LinkedList<Double>();
	LinkedList<Double> showResults1 = new LinkedList<Double>();
	LinkedList<Double> showResults2 = new LinkedList<Double>();
	LinkedList<Double> showResults4 = new LinkedList<Double>();
	LinkedList<Double> showResults5 = new LinkedList<Double>();

	DataSmooth1 D1 = new DataSmooth1();

	public DataSmoothExamples() 
	{
		LinkedList<Episode> eps1 = new LinkedList<Episode>();
		eps1.add(new Episode("Best of Both Worlds", 88));
		eps1.add(new Episode("The Ultimate Computer", 49));
		eps1.add(new Episode("Trials and Tribble-ations", 43));		
		shows.add(new Show("Star Trek", 1800, eps1));
		shows1.add(new Show("Star Trek", 1800, eps1));
		shows2.add(new Show("Star Trek", 1800, eps1));

		LinkedList<Episode> eps2 = new LinkedList<Episode>();
		eps2.add(new Episode("Fear of a Bot Planet", 23));
		eps2.add(new Episode("The Why of Fry", 21));
		eps2.add(new Episode("Roswell that Ends Well", 23));
		eps2.add(new Episode("Meanwhile", 22));
		shows.add(new Show("Futurama", 1900, eps2));
		shows2.add(new Show("Futurama", 1900, eps2));

		LinkedList<Episode> eps3 = new LinkedList<Episode>();
		eps3.add(new Episode("Yakko's World", 4));
		eps3.add(new Episode("Hello Nice Warners", 8));
		eps3.add(new Episode("Where Rodents Dare", 9));
		shows.add(new Show("Animaniacs", 1630, eps3));

		LinkedList<Episode> eps4 = new LinkedList<Episode>();
		eps4.add(new Episode("The Letter W", 59));
		eps4.add(new Episode("The Letter P", 57));
		eps4.add(new Episode("The Letter I", 58));
		shows.add(new Show("Sesame Street", 900, eps4));
		shows1.add(new Show("Sesame Street", 900, eps4));
		shows2.add(new Show("Sesame Street", 900, eps4));

		LinkedList<Episode> eps5 = new LinkedList<Episode>();
		eps5.add(new Episode("A", 8));
		eps5.add(new Episode("B", 10));
		eps5.add(new Episode("C", 12));

		shows4.add(new Show("Star Trek", 1800, eps1));
		shows4.add(new Show("Futurama", 1900, eps2));
		shows4.add(new Show("Animaniacs", 1630, eps3));
		shows4.add(new Show("Sesame Street", 900, eps4));
		shows4.add(new Show("Sesame Street", 900, eps5));

		shows5.add(new Show("Animaniacs", 1630, eps3));
		shows5.add(new Show("Star Trek", 1800, eps1));
		shows5.add(new Show("Sesame Street", 900, eps4));
		shows5.add(new Show("Sesame Street", 900, eps5));
		shows5.add(new Show("Futurama", 1900, eps2));

		showResults.add(60.0);
		showResults.add(29.75);
		showResults.add(29.08333);
		showResults.add(58.0);

		showResults1.add(60.0);
		showResults1.add(58.0);

		showResults2.add(60.0);
		showResults2.add(46.75);
		showResults2.add(58.0);

		showResults4.add(60.0);
		showResults4.add(29.75);
		showResults4.add(29.08333);
		showResults4.add(25.0);
		showResults4.add(10.0);

		showResults5.add(7.0);
		showResults5.add(41.66667);
		showResults5.add(42.66667);
		showResults5.add(30.08333);
		showResults5.add(22.25);	
	}

	@Test
	public void instructorTestDS() 
	{
		LinkedList<Double> runtimes = D1.dataSmooth(shows);

		for(int i = 0; i < runtimes.size(); i++)
		{
			assertEquals(runtimes.get(i), showResults.get(i), .01);
		}
	}

	@Test
	public void checkOnlyFirstAndLastDataSmooth() {

		LinkedList<Double> runtimes = D1.dataSmooth(shows1);

		for(int i = 0; i < runtimes.size(); i++) {
			assertEquals(runtimes.get(i), showResults1.get(i), 0.01);
		}
	}

	@Test 
	public void check3ShowsDataSmooth() {

		LinkedList<Double> runtimes = D1.dataSmooth(shows2);

		for(int i = 0; i < runtimes.size(); i++) {
			assertEquals(runtimes.get(i), showResults2.get(i), 0.01);
		}
	}

	@Test
	public void checkEmptyShowsDataSmooth() {
		assertTrue(D1.dataSmooth(shows3).isEmpty());
	}

	@Test 
	public void checkExtraShowEndDataSmooth() {

		LinkedList<Double> runtimes = D1.dataSmooth(shows4);

		for(int i = 0; i < runtimes.size(); i++) {
			assertEquals(runtimes.get(i), showResults4.get(i), 0.01);
		}
	}

	@Test 
	public void checkhuffleShowsDataSmooth() {

		LinkedList<Double> runtimes = D1.dataSmooth(shows5);

		for(int i = 0; i < runtimes.size(); i++) {
			assertEquals(runtimes.get(i), showResults5.get(i), 0.01);
		}
	}


	// Subtasks:
	// 1. Calculate the average runtime of the episodes of each show (Sum runTime of episodes and count episodes).
	// 2. The first element of the produced list should be the average of the episodes of the first show in the processed list.
	// 3. The last element of the produced list should be the average of the episodes of the last show in the processed list.
	// 4. The elements between the first and last element in the produced list should equal to
	//    the average of the averages of the specific show in that index, the previous, and the next in sequence.
	// 5. Check if the list of shows is empty.
	// 6. Return a List of Doubles
}