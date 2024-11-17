/*
 * Class: CMSC203 22502
 * Instructor: Dr. Kuijt
 * Description: HolidayBonus JUnit Test
 * Due: 11/16/2024
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Alex Kim
*/
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class HolidayBonusTestStudent {

	private double[][] dataSet1 = { { 10, 20, 30 }, { 40, 50 }, { 60, 70, 80 } };

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateHolidayBonusA() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1);
			assertEquals(1000.0, result[0], .001);
			assertEquals(2000.0, result[1], .001);
			assertEquals(5000.0, result[2], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}

	}

	@Test
	public void testCalculateTotalHolidayBonusA() {
		assertEquals(8000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet1), .001);
	}

}
