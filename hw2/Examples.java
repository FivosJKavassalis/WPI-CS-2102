// Homework #2 11/07/2017
// Josue Contreras/jdcontrerasalbuj
// Fivos Kavassalis/fikavassalis

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class Examples {
	//---------MassResult Objects----------------------------
	MassStartResult player1 = new MassStartResult(5,1);
	MassStartResult player2 = new MassStartResult(50.55, 20);

	//---------Create lists/objects shootingR1---------------
	LinkedList<ShootingRound> shootingR1 = new LinkedList<ShootingRound>();
	ShootingRound round1 = new ShootingRound (3);
	ShootingRound round2 = new ShootingRound (5);
	ShootingRound round3 = new ShootingRound (2);
	ShootingRound round4 = new ShootingRound (4);
	ShootingRound round5 = new ShootingRound (5);

	//---------Create lists/objects shootingR2---------------
	LinkedList<ShootingRound> shootingR2 = new LinkedList<ShootingRound>();
	ShootingRound round6 = new ShootingRound (0);
	ShootingRound round7 = new ShootingRound (2);
	ShootingRound round8 = new ShootingRound (1);
	ShootingRound round9 = new ShootingRound (5);
	ShootingRound round10 = new ShootingRound (4);

	//---------Create lists shootingR3 (1 element)-----------
	LinkedList<ShootingRound> shootingR3 = new LinkedList<ShootingRound>();

	//---------Create empty list-----------------------------
	LinkedList<ShootingRound> emptyList = new LinkedList<ShootingRound>();

	//---------Create objects for ShootingResult-------------
	ShootingResult shootResultOne = new ShootingResult (shootingR1);   //5 Rounds
	ShootingResult shootResultTwo = new ShootingResult (shootingR2);   //4 Rounds
	ShootingResult shootResultThree = new ShootingResult (shootingR3); //1 Round
	ShootingResult shootResultEmpty = new ShootingResult (emptyList);  //empty

	//---------Create list/objects skiingResultR1------------
	LinkedList<SkiingResult> skiingResultR1 = new LinkedList<>();
	SkiingResult skiiResultOne = new SkiingResult (15, 1, shootResultOne);       //5 Rounds
	SkiingResult skiiResultTwo = new SkiingResult (17.2, 2, shootResultTwo);     //4 Rounds
	SkiingResult skiiResultThree = new SkiingResult (18.7, 3, shootResultThree); //4
	SkiingResult skiiResultFour = new SkiingResult (18.9, 4, shootResultOne);    //5
	SkiingResult skiiResultEmpty = new SkiingResult (20.5, 5, shootResultEmpty); //empty

	//----------Create lists athleteSquads-------------------
	LinkedList<Athlete> athleteSquad1 = new LinkedList<>();
	LinkedList<Athlete> athleteSquad2 = new LinkedList<>();
	LinkedList<Athlete> athleteSquad3 = new LinkedList<>();
	LinkedList<Athlete> athleteSquad4 = new LinkedList<>();
	LinkedList<Athlete> athleteSquad5 = new LinkedList<>();
	LinkedList<Athlete> athleteSquad6 = new LinkedList<>();
	LinkedList<Athlete> athleteSquad7 = new LinkedList<>();	
	LinkedList<Athlete> athleteSquad8 = new LinkedList<>();		
	LinkedList<Athlete> athleteSquad9 = new LinkedList<>();	
	LinkedList<Athlete> athleteSquad10 = new LinkedList<>();
	LinkedList<Athlete> athleteSquad11 = new LinkedList<>();

	Athlete athlete1 = new Athlete (shootResultOne, skiiResultOne, "Fivos");    //5
	Athlete athlete2 = new Athlete (shootResultTwo, skiiResultTwo, "Josue");    //4
	Athlete athlete3 = new Athlete (shootResultTwo, skiiResultThree, "Richard");//4
	Athlete athlete4 = new Athlete (shootResultOne, skiiResultFour, "Manas");   //5
	Athlete athlete5 = new Athlete (shootResultTwo, skiiResultTwo, "Fivos");    //4
	Athlete athlete6 = new Athlete (shootResultOne, skiiResultOne, "Josue");    //5
	Athlete athlete7 = new Athlete (shootResultOne, skiiResultOne, "Manas");    //5

	//----------Create Competition--------------------------
	Competition competitionR1 = new Competition(5,athleteSquad1);
	Competition competitionR2 = new Competition(5,athleteSquad2);
	Competition competitionR3 = new Competition(5,athleteSquad3);
	Competition competitionR4 = new Competition(5,athleteSquad4);
	Competition competitionR5 = new Competition(5,athleteSquad5);
	Competition competitionR6 = new Competition(5,athleteSquad6);
	Competition competitionR7 = new Competition(5,athleteSquad7);
	Competition competitionR8 = new Competition(5,athleteSquad8);
	Competition competitionR9 = new Competition(5,athleteSquad9);
	Competition competitionR10 = new Competition(5,athleteSquad10);
	Competition competitionR11 = new Competition(5,athleteSquad11);

	//---------ListOfStrings for test cases-----------------
	LinkedList<String> nameAthletes = new LinkedList<>();
	LinkedList<String> nameOneAthlete = new LinkedList<>();

	public Examples() {

		shootingR1.add(round1); //3
		shootingR1.add(round2); //5
		shootingR1.add(round3); //2
		shootingR1.add(round4); //4
		shootingR1.add(round5); //5

		shootingR2.add(round6); //0
		shootingR2.add(round7); //2
		shootingR2.add(round8); //1
		shootingR2.add(round9); //5

		shootingR3.add(round4); 

		athleteSquad1.add(athlete1);
		athleteSquad1.add(athlete2);
		athleteSquad1.add(athlete3);
		athleteSquad1.add(athlete4);

		athleteSquad2.add(athlete3);

		athleteSquad3.add(athlete5);
		athleteSquad3.add(athlete2);
		athleteSquad3.add(athlete3);
		athleteSquad3.add(athlete4);

		athleteSquad4.add(athlete2);
		athleteSquad4.add(athlete4);
		athleteSquad4.add(athlete1);
		athleteSquad4.add(athlete3);

		athleteSquad5.add(athlete6);
		athleteSquad5.add(athlete7);
		athleteSquad5.add(athlete5);

		athleteSquad6.add(athlete1);
		athleteSquad6.add(athlete2);
		athleteSquad6.add(athlete4);

		athleteSquad7.add(athlete5);
		athleteSquad7.add(athlete6);
		athleteSquad7.add(athlete7);

		athleteSquad8.add(athlete4);
		athleteSquad8.add(athlete2);
		athleteSquad8.add(athlete1);

		athleteSquad9.add(athlete1);
		athleteSquad9.add(athlete6);
		athleteSquad9.add(athlete4);

		athleteSquad10.add(athlete5);
		athleteSquad10.add(athlete2);
		athleteSquad10.add(athlete7);

		athleteSquad11.add(athlete2);
		athleteSquad11.add(athlete7);
		athleteSquad11.add(athlete5);

		nameAthletes.add("Josue");
		nameAthletes.add("Manas");

	}


	//------------------------MassStart pointsEarned test cases------------------------------
	@Test
	public void checkMassStartPlayer1PointsEarned() {
		assertEquals(5, player1.pointsEarned(), 0.01);
	}

	@Test 
	public void checkMassStartPlayer2PointsEarned() {
		assertEquals(50.55, player2.pointsEarned(), 0.01);
	}

	//----------------------ShootingResult pointsEarned test cases---------------------------
	@Test
	public void checkShootResultOnePointsEarned() {
		assertEquals(19, shootResultOne.pointsEarned(), 0.01);
	}

	@Test
	public void checkShootResultTwoPointsEarned() {
		assertEquals(8, shootResultTwo.pointsEarned(), 0.01);
	}

	@Test
	public void checkShootResult1RoundPointsEarned() {
		assertEquals(4, shootResultThree.pointsEarned(), 0.01);
	}

	@Test
	public void checkShootResultEmptyPointsEarned() {
		assertEquals(0, shootResultEmpty.pointsEarned(), 0.01);
	}

	//-----------------SkiingResult addShootingPenalties test cases--------------------------
	@Test
	public void checkSkiiResultOneAddShootPenalties() {
		assertEquals(135, skiiResultOne.addShootingPenalties(), 0.01);
	}

	@Test 
	public void checkSkiiResultTwoAddShootPenalties() {
		assertEquals(20.5, skiiResultEmpty.addShootingPenalties(), 0.01);

	}

	@Test 
	public void checkSkiiResultThreeOneRoundAddShootPenalties() {
		assertEquals(38.7, skiiResultThree.addShootingPenalties(), 0.01);
	}

	@Test 
	public void checkSkiiResultFourAddShootPenalties() {
		assertEquals(138.9, skiiResultFour.addShootingPenalties(), 0.01);
	}


	//------------------------ShootingResult bestRound test cases----------------------------
	@Test 
	public void checkShootResultOneBestRound() {
		assertEquals(round2, shootResultOne.bestRound());
	}

	@Test
	public void checkShootResultTwoBestRound() {
		assertEquals(round9, shootResultTwo.bestRound());
	}

	@Test
	public void checkShootResultThreeBestRound() {
		assertEquals(round4, shootResultThree.bestRound());
	}

	@Test
	public void checkShootResultThreeExpBestRound() {
		shootingR3.add(round4);
		shootingR3.add(round4);
		shootingR3.add(round4);
		assertEquals(round4, shootResultThree.bestRound());
	}

	@Test
	public void checkShootResultThreeBigFirstBestRound() {
		shootingR3.addFirst(round2); // 5 targets hit
		shootingR3.add(round3); // 2 targets hit
		shootingR3.add(round1); // 3 targets hit
		shootingR3.add(round6); // 0 targets hit
		assertEquals(round2, shootResultThree.bestRound());
	}

	@Test
	public void checkShootResultThreeBigLastBestRound() {
		shootingR3.add(round6); // 0 targets hit 
		shootingR3.add(round7); // 2 targets hit
		shootingR3.add(round9); // 5 targets hit
		assertEquals(round9, shootResultThree.bestRound());
	}


	//---------------------Competition shootingDNF test cases--------------------------------
	@Test
	public void checkCompetitionR2ShootingDNFTest1() {
		nameOneAthlete.add("Richard");
		assertEquals(nameOneAthlete, competitionR2.shootingDNF());
	}

	@Test 
	public void checkCompetitionR2ShootingDNFTest2() {
		nameOneAthlete.add("Richard");

		athleteSquad2.add(athlete1);
		athleteSquad2.add(athlete1);
		athleteSquad2.add(athlete1);
		athleteSquad2.add(athlete1);

		assertEquals(nameOneAthlete,competitionR2.shootingDNF());
	}

	@Test 
	public void checkCompatitionR2ShootingDNFTest3() {
		nameOneAthlete.add("Richard");
		nameOneAthlete.add("Richard");
		nameOneAthlete.add("Richard");
		nameOneAthlete.add("Richard");
		nameOneAthlete.add("Richard");

		athleteSquad2.add(athlete3);
		athleteSquad2.add(athlete3);
		athleteSquad2.add(athlete3);
		athleteSquad2.add(athlete3);

		assertEquals(nameOneAthlete,competitionR2.shootingDNF());
	}

	@Test 
	public void checkShootingDNFTest4() {
		nameOneAthlete.add("Richard");
		nameOneAthlete.add("Josue");

		//created in the examples contructor: "Richard" 4
		athleteSquad2.add(athlete2); //"Josue" 4
		athleteSquad2.add(athlete1); //"Fivos" 5
		athleteSquad2.add(athlete1); //"Fivos" 5
		athleteSquad2.add(athlete4); //"Manas" 5

		assertEquals(nameOneAthlete,competitionR2.shootingDNF());
	}


	//----------------Competition skiingscoreForAthlete test cases--------------------------
	@Test
	public void checkAthleteSquad1FirstSkiiScoreForAthlete() {
		assertEquals(125, competitionR1.skiingScoreForAthlete("Fivos"), 0.01);
	}

	@Test
	public void checkAthleteSquad1LastSkiiScoreForAthlete() {
		assertEquals(138.9, competitionR1.skiingScoreForAthlete("Manas"), 0.01);
	}

	@Test
	public void checkAthleteSquad1MiddleSkiiScoreForAthlete() {
		assertEquals(250.2, competitionR1.skiingScoreForAthlete("Josue"), 0.01);
	}

	@Test
	public void checkAthleteSquad1SingleSkiiScoreForAthlete() {
		assertEquals(35.7, competitionR2.skiingScoreForAthlete("Richard"), 0.01);
	}


	//---------------Competition anySkiingImprovement test cases---------------------------
	@Test
	public void checkComp3Comp1AnySkImpr() {
		assertFalse(competitionR3.anySkiingImprovement(competitionR1));
	}

	@Test
	public void checkComp6Comp7AnySkImpr() {
		assertTrue(competitionR6.anySkiingImprovement(competitionR7));
	}

	@Test
	public void checkComp8Comp7AnySkImpr() {
		assertTrue(competitionR8.anySkiingImprovement(competitionR7));
	}

	@Test
	public void checkComp9Comp10AnySkImpr() {
		assertTrue(competitionR9.anySkiingImprovement(competitionR10));
	}

	@Test
	public void checkComp3Comp4AnySkImpr() {
		assertFalse(competitionR3.anySkiingImprovement(competitionR4));
	}

	@Test
	public void checkComp6Comp5AnySkImpr() {
		assertTrue(competitionR6.anySkiingImprovement(competitionR5));
	}


	@Test
	public void checkComp9Comp11AnySkImpr() {
		assertTrue(competitionR9.anySkiingImprovement(competitionR11));
	}
}

