import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
//import java.util.Arrays;

public class ShowExamples 
{
	ShowManager1 sm1 = new ShowManager1();
	LinkedList<Show> shows = new LinkedList<Show>();
	ShowSummary report1 = new ShowSummary();

	//For test cases method 1 (fill out in test cases)
	//Note: if want to check method 2 change to ShowManger2
	ShowManager1 tsm1 = new ShowManager1();
	LinkedList<Show> tshows = new LinkedList<Show>();
	ShowSummary treport1 = new ShowSummary();
	
	public ShowExamples()
	{
		LinkedList<Episode> eps1 = new LinkedList<Episode>();
		eps1.add(new Episode("Best of Both Worlds", 88));
		eps1.add(new Episode("The Ultimate Computer", 49));
		eps1.add(new Episode("Trials and Tribble-ations", 43));		
		Show s1 = new Show("Star Trek", 1800, eps1);
		shows.add(s1);
		report1.primetime.add(s1);

		LinkedList<Episode> eps2 = new LinkedList<Episode>();
		eps2.add(new Episode("Fear of a Bot Planet", 23));
		eps2.add(new Episode("The Why of Fry", 21));
		eps2.add(new Episode("Roswell that Ends Well", 23));
		eps2.add(new Episode("Meanwhile", 22));
		Show s2 = new Show("Futurama", 1900, eps2);
		shows.add(s2);
		report1.primetime.add(s2);

		LinkedList<Episode> eps3 = new LinkedList<Episode>();
		eps3.add(new Episode("Yakko's World", 4));
		eps3.add(new Episode("Hello Nice Warners", 8));
		eps3.add(new Episode("Where Rodents Dare", 9));
		Show s3 = new Show("Animaniacs", 1630, eps3);
		shows.add(s3);
		report1.daytime.add(s3);

		LinkedList<Episode> eps4 = new LinkedList<Episode>();
		eps4.add(new Episode("The Letter W", 59));
		eps4.add(new Episode("The Letter P", 57));
		eps4.add(new Episode("The Letter I", 58));
		Show s4 = new Show("Sesame Street", 900, eps4);
		shows.add(s4);
		report1.daytime.add(s4);

		//Not in prime time or daytime
		eps5.add(new Episode("Better World", 57));
		eps5.add(new Episode("Giant", 58));

		eps6.add(new Episode("Malibu", 57));
		eps6.add(new Episode("Best of Both Worlds", 58));

		//LinkedList<Episode> eps7 = new LinkedList<Episode>();
		eps7.add(new Episode("Yummy", 58));

		//Prime time exact 5pm (1700)
		eps8.add(new Episode("World", 57));
		eps8.add(new Episode("Buddy", 58));

		//Daytime exact before 5pm (1659)
		eps9.add(new Episode("The Last Jagger", 57));
		eps9.add(new Episode("Jagger Return", 58));

		//Prime time exact before 11 (2259)
		eps10.add(new Episode("Epsiode 1", 57));
		eps10.add(new Episode("Episode 2", 58));

		//Daytime exact 6am (600)
		eps11.add(new Episode("Hell", 57));
		eps11.add(new Episode("Finals", 58));
	}


	//---------------------------------All Shows-------------------------------
	//Prime time
	LinkedList<Episode> eps1 = new LinkedList<Episode>();
	Show s1 = new Show("Star Trek", 1800, eps1);

	LinkedList<Episode> eps2 = new LinkedList<Episode>();
	Show s2 = new Show("Futurama", 1900, eps2);

	//Day time
	LinkedList<Episode> eps3 = new LinkedList<Episode>();
	Show s3 = new Show("Animaniacs", 1630, eps3);

	LinkedList<Episode> eps4 = new LinkedList<Episode>();
	Show s4 = new Show("Sesame Street", 900, eps4);

	//Not in prime time or day time
	LinkedList<Episode> eps5 = new LinkedList<Episode>();
	Show s5 = new Show("Max Steel", 2300, eps4); //exactly at 11pm

	LinkedList<Episode> eps6 = new LinkedList<Episode>();
	Show s6 = new Show("Miley Cyrus", 559, eps6); //exactly at 5:59am

	LinkedList<Episode> eps7 = new LinkedList<Episode>();
	Show s7 = new Show("Real Steak", 100, eps7); //Some time at night

	//Prime time exact 5pm (1700)
	LinkedList<Episode> eps8 = new LinkedList<Episode>();
	Show s8 = new Show("Barney", 1700, eps8);

	//Daytime exact before 5pm (1659)
	LinkedList<Episode> eps9 = new LinkedList<Episode>();
	Show s9 = new Show("Pacifc Rim", 1659, eps9);

	//Prime time exact before 11 (2259)
	LinkedList<Episode> eps10 = new LinkedList<Episode>();
	Show s10 = new Show("Naruto", 2259, eps10);

	//Daytime exact 6am (600)
	LinkedList<Episode> eps11 = new LinkedList<Episode>();
	Show s11 = new Show("Master Chef", 600, eps11);	


	@Test
	public void instructorTestOrganizeShowsAllSame() 
	{
		ShowSummary report2 = sm1.organizeShows(shows);
		assertEquals(report1, report2);
	}

	@Test
	public void instructorTestOrganizeShows1Prime0Day() 
	{
		tshows.add(s1);
		tshows.add(s7);

		treport1.primetime.add(s1);

		ShowSummary treport2 = tsm1.organizeShows(tshows);
		assertEquals(treport1, treport2);
	}

	@Test
	public void instructorTestOrganizeShows0Prime2Day() 
	{
		tshows.add(s3);
		tshows.add(s7);
		tshows.add(s4);

		treport1.daytime.add(s3);
		treport1.daytime.add(s4);

		ShowSummary treport2 = tsm1.organizeShows(tshows);
		assertEquals(treport1, treport2);
	}

	@Test
	public void instructorTestOrganizeShows0Prime0Day() 
	{
		tshows.add(s5);
		tshows.add(s6);
		tshows.add(s7);

		ShowSummary treport2 = tsm1.organizeShows(tshows);
		assertEquals(treport1, treport2);
	}

	@Test
	public void instructorTestOrganizeShows3Prime3Day() 
	{
		tshows.add(s5);
		tshows.add(s8);//yes prime time
		tshows.add(s11);//yes day time
		tshows.add(s10);//yes prime time
		tshows.add(s9);//yes day time
		tshows.add(s7);

		treport1.primetime.add(s8);
		treport1.daytime.add(s11);
		treport1.primetime.add(s10);
		treport1.daytime.add(s9);

		ShowSummary treport2 = tsm1.organizeShows(tshows);
		assertEquals(treport1, treport2);
	}

	@Test
	public void instructorTestOrganizeShows2Prime3Day() 
	{
		tshows.add(s9);//day
		tshows.add(s2);//prime 
		tshows.add(s1);//prime
		tshows.add(s3);//prime
		tshows.add(s4);//day

		treport1.daytime.add(s9);
		treport1.primetime.add(s2);
		treport1.primetime.add(s1);
		treport1.daytime.add(s3);
		treport1.daytime.add(s4);

		ShowSummary treport2 = tsm1.organizeShows(tshows);
		assertEquals(treport1, treport2);
	}

	//Subtasks Problem 1
	//Runs through a list of shows and separates prime and day time shows
	//Cleans the list form any other shows that are not specified as day or prime time
	//Return a ShowSummary report
}
