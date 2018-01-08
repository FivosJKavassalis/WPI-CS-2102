// Homework #1 10/30/2017
// Josue Contreras - jdcontrerasalbuj
// Fivos Kavassalis - fikavassalis

import static org.junit.Assert.*;
import org.junit.Test;


public class Examples {

	public Examples() {}

	// creates objects for ShootingRounds
	ShootingRound roundOne = new ShootingRound (3);
	ShootingRound roundTwo = new ShootingRound (5);
	ShootingRound roundThree = new ShootingRound (2);
	ShootingRound roundFour = new ShootingRound (4);
	ShootingRound roundFive = new ShootingRound (5);

	// creates objects for ShootingResult
	ShootingResult shootResultOne = new ShootingResult (roundTwo, roundThree, roundOne, roundFour);
	ShootingResult shootResultTwo = new ShootingResult (roundOne, roundTwo, roundOne, roundFive);

	// creates objects for SkiingResult
	SkiingResult skiiResultOne = new SkiingResult (15, 1, shootResultOne);
	SkiingResult skiiResultTwo = new SkiingResult (17.2, 2, shootResultTwo);
	SkiingResult skiiResultThree = new SkiingResult (18.7, 3, shootResultTwo);
	SkiingResult skiiResultFour = new SkiingResult (18.9, 4, shootResultOne);

	// creates objects for Athlete
	Athlete athleteOne = new Athlete (shootResultOne, skiiResultOne);
	Athlete athleteTwo = new Athlete (shootResultTwo, skiiResultTwo);
	Athlete athleteThree = new Athlete (shootResultOne, skiiResultTwo);
	Athlete athleteFour = new Athlete (shootResultTwo, skiiResultOne);


	// test cases for method: pointsEarned() for ShootingResult
	@Test
	public void checkShootResultOnePointsEarned() {
		assertEquals(14, shootResultOne.pointsEarned(), 0.01);
	}

	@Test
	public void checkShootResultTwoPointsEarned() {
		assertEquals(16, shootResultTwo.pointsEarned(), 0.01);
	}


	// test cases for method: pointsEarned() for SkiingResult
	@Test
	public void checkSkiiResultOneAddShootPenalties() {
		assertEquals(135, skiiResultOne.addShootingPenalties(shootResultOne), 0.01);
	}

	@Test 
	public void checkSkiiResultTwoAddShootPenalties() {
		assertEquals(97.2, skiiResultTwo.addShootingPenalties(shootResultTwo), 0.01);
	}

	@Test 
	public void checkSkiiResultOnePointsEarned() {
		assertEquals(125, skiiResultOne.pointsEarned(), 0.01);
	}

	@Test 
	public void checkSkiiResultTwoPointsEarned() {
		assertEquals(90.2, skiiResultTwo.pointsEarned(), 0.01);
	}

	@Test 
	public void checkSkiiResultThreePointsEarned() {
		assertEquals(95.7, skiiResultThree.pointsEarned(), 0.01);
	}

	@Test 
	public void checkSkiiResultFourPointsEarned() {
		assertEquals(138.9, skiiResultFour.pointsEarned(), 0.01);
	}


	// test cases for method: betterSkier(Athlete other)
	@Test
	public void checkAthOneAthTwoBetterSkier() {
		assertEquals(athleteTwo, athleteOne.betterSkiier(athleteTwo));
	}

	@Test
	public void checkAthThreeAthOneBetterSkier() {
		assertEquals(athleteThree, athleteThree.betterSkiier(athleteOne));
	}


	// test cases for method: hasBeaten(Athlete another)
	@Test
	public void checkAthTwoAthOneHasBeaten() {
		assertTrue(athleteTwo.hasBeaten(athleteOne));
	}

	@Test
	public void checkAthThreeAthTwoHasBeaten() {
		assertFalse(athleteThree.hasBeaten(athleteTwo));
	}
	@Test

	public void checkAthFourAthThreeHasBeaten() {
		assertTrue(athleteFour.hasBeaten(athleteThree));
	}

	@Test
	public void checkAthOneAthTwoHasBeaten() {
		assertTrue(athleteThree.hasBeaten(athleteFour));
	}
}
