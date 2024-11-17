/*
 * Class: CMSC203 22502
 * Instructor: Dr. Kuijt
 * Description: HolidayBonus
 * Due: 11/16/2024
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Alex Kim
*/

public class HolidayBonus {
    private static final double HIGHEST_BONUS = 5000.0;
    private static final double LOWEST_BONUS = 1000.0;
    private static final double OTHER_BONUS = 2000.0;
	
	public HolidayBonus() {
		
	}
	
	static double[] calculateHolidayBonus(double[][] data) {
		//Calculates the holiday bonus for each store
		 double[] bonusArray = new double[data.length];
		 double highestSales = -99999999999999999999999999999999.9;
		 double lowestSales =   99999999999999999999999999999999.9;
		
		 for (int i = 0; i < data.length; i++) {
			 double rowTotal = TwoDimRaggedArrayUtility.getRowTotal(data, i);
			
			 if (rowTotal > highestSales) {
				 highestSales = rowTotal;
			 }
			 
			 if (rowTotal > 0.0 && rowTotal < lowestSales) {
				 lowestSales = rowTotal;
			 }
		 }
		 
		 for (int i = 0; i < data.length; i++) {
			 double rowTotal = TwoDimRaggedArrayUtility.getRowTotal(data,  i);
			 
			 if (rowTotal <= 0.0) {
				 bonusArray[i] = 0.0;
			 }
			 else if (rowTotal == highestSales) {
				 bonusArray[i] = HIGHEST_BONUS;
			 }
			 else if (rowTotal == lowestSales) {
				 bonusArray[i] = LOWEST_BONUS;
			 }
			 else {
				 bonusArray[i] = OTHER_BONUS;
			 }
		 }
		 return bonusArray;
	}
	
	static double calculateTotalHolidayBonus(double[][] data) {
		//Calculates the total holiday bonuses
		double[] bonus = calculateHolidayBonus(data);
		double totalBonus = 0.0;
		
		for (int i = 0; i < bonus.length; i++) {
			totalBonus += bonus[i];
		}
		
		return totalBonus;
	}
	
}
