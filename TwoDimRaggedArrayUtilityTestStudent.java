/*
 * Class: CMSC203 22502
 * Instructor: Dr. Kuijt
 * Description: TwoDimRaggedArrayUtility JUnit Test
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

/**
 * This class represents GFA test cases for a TwoDimRaggedArrayUtility object.
 * 
 * @author Farnaz Eivazi
 * @version 7/13/2022
 * 
 */
public class TwoDimRaggedArrayUtilityTestStudent {
	private double[][] dataSet1 = {{3,4,6},{4,2},{3,7,5,4}};
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test getRowTotal method
	 * Returns the total of all the elements of row 1.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
		assertEquals(10.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,0),.001);
	}
}
