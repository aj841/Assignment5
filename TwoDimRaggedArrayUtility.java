/*
 * Class: CMSC203 22502
 * Instructor: Dr. Kuijt
 * Description: TwoDimRaggedArrayUtility
 * Due: 11/16/2024
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Alex Kim
*/

import java.io.*;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {

	//Constructor Stuff
	public TwoDimRaggedArrayUtility() {
		
	}

	//Column Stuff
	static double getColumnTotal(double[][] data, int col) {
		//Returns the total of the selected column in the two dimensional array index 0 refers to the first column.
		double columnTotal = 0.0;
		
		for (int i = 0; i < data.length; i++) {
	        if (data[i].length > col) {
	            columnTotal += data[i][col];
	        }
		}
		
		return columnTotal;
	}

	//Returns the largest element of the selected column in the two dimensional array index 0 refers to the first column.
	static double getHighestInColumn(double[][] data, int col) {
		double highestValue = -99999999999999999999999999999999.9;
			
		for (int i = 0; i < data.length; i++) {
			if (col < data[i].length && highestValue < data[i][col])
			{
				highestValue = data[i][col];
			}
		}
		
		return highestValue;
	}
	
	//Returns index of the largest element of the selected column in the two dimensional array index 0 refers to the first column.
	static int getHighestInColumnIndex(double[][] data, int col) {
		double highestValue = -99999999999999999999999999999999.9;;
		int highestIndex = 0;
		
		for (int i = 0; i < data.length; i++) {
			if (col < data[i].length && highestValue < data[i][col])
			{
				highestIndex = i;
			}
		}
		
		return highestIndex;
	}
	
	//Returns the smallest element of the selected column in the two dimensional array index 0 refers to the first column.
	static double getLowestInColumn(double[][] data, int col) {
		double lowestValue = 99999999999999999999999999999999.9;
		
		for (int i = 0; i < data.length; i++) {
			if (col < data[i].length && lowestValue > data[i][col])
			{
				lowestValue = data[i][col];
			}
		}
		return lowestValue;
	}
	
	//Returns the index of the smallest element of the selected column in the two dimensional array index 0 refers to the first column.
	static int getLowestInColumnIndex(double[][] data, int col) {
		double lowestValue = 99999999999999999999999999999999.9;
		int lowestIndex = 0;
		
		for (int i = 0; i < data.length; i++) {
			if (col < data[i].length && lowestValue > data[i][col])
			{
				lowestIndex = i;
			}
		}
		
		return lowestIndex;
	}
	
	//Row Stuff
	//Returns the total of the selected row in the two dimensional array index 0 refers to the first row.
	static double getRowTotal(double[][] data, int row) {
		double rowTotal = 0;
		
		for (int i = 0; i < data[row].length; i++) {
			rowTotal += data[row][i];
		}
		
		return rowTotal;
	}
	
	//Returns the largest element of the selected row in the two dimensional array index 0 refers to the first row.=
	static double getHighestInRow(double[][] data, int row) {
		double highestValue = -99999999999999999999999999999999.9;
		
		for (int i = 0; i < data[row].length; i++) {
			if (row < data.length && highestValue < data[row][i])
			{
				highestValue = data[row][i];
			}
		}
		
		return highestValue;
	}
	
	//Returns the largest element of the selected row in the two dimensional array index 0 refers to the first row.
	static int getHighestInRowIndex(double[][] data, int row) {
		double highestValue = -99999999999999999999999999999999.9;
		int highestIndex = 0;
		
		for (int i = 0; i < data[row].length; i++) {
			if (row < data.length && highestValue < data[row][i])
			{
				highestIndex = i;
			}
		}
		
		return highestIndex;
	}

	//Returns the smallest element of the selected row in the two dimensional array index 0 refers to the first row.
	static double getLowestInRow(double[][] data, int row) {
		double lowestValue = 99999999999999999999999999999999.9;
		
		for (int i = 0; i < data[row].length; i++) {
			if (row < data.length && lowestValue > data[row][i])
			{
				lowestValue = data[row][i];
			}
		}
		
		return lowestValue;
	}
	
	//Returns the index of the smallest element of the selected row in the two dimensional array index 0 refers to the first row.
	static int getLowestInRowIndex(double[][] data, int row) {
		double lowestValue = 99999999999999999999999999999999.9;
		int lowestIndex = 0;
		
		for (int i = 0; i < data[row].length; i++) {
			if (row < data.length && lowestValue > data[row][i])
			{
				lowestIndex = i;
			}
		}
		
		return lowestIndex;
	}

	//Whole Array Stuff
	//Returns the total of all the elements of the two dimensional array
	static double getTotal(double[][] data) {
		double total = 0;
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				total += data [i][j];
			}
		}
		return total;
	}
	
	//Returns the average of the elements in the two dimensional array
	static double getAverage(double[][] data) {
		double total = 0;
		int temp = 0;
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				total += data [i][j];
				temp++;
			}
		}
		return total/temp;
	}
	
	//Returns the smallest element in the two dimensional array
	static double getLowestInArray(double[][] data) {
		double lowestInArray = 99999999999999999999999999999999.9;
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (lowestInArray > data[i][j]) {
					lowestInArray = data[i][j];
				}
			}
		}
		return lowestInArray;
	}
	
	//Returns the largest element in the two dimensional array
	static double getHighestInArray(double[][] data) {
		double highestInArray = -99999999999999999999999999999999.9;
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (highestInArray < data[i][j]) {
					highestInArray = data[i][j];
				}
			}
		}
		return highestInArray;
	}
	
	//Reads from a file and returns a ragged array of doubles The maximum rows is 10 and the maximum columns for each row is 10 Each row in the file is separated bnew line Each element in the row is separated by a space Suggestion: You need to know how many rows and how many columns there are for each row to create a ragged array.
    static double[][] readFile(File file) throws FileNotFoundException { 
		final int MAX_ROW = 10;
        final int MAX_COLUMN = 10;
        
        double temp[][] = new double[MAX_ROW][MAX_COLUMN];
        
        int rowIndex = 0;
        int[] columnIndex = new int [MAX_ROW];
        
        try (Scanner myScanner = new Scanner(file)) {
	        while (myScanner.hasNextLine() )//&& )
	        {
	        	String[] values = myScanner.nextLine().split(" ");
	        	
	        	for (int i = 0; i < values.length; i++) {
	        		temp[rowIndex][i] = Double.parseDouble(values[i]);
	        	}
	        	columnIndex[rowIndex] = values.length; 
	        	rowIndex++;
	        }
	        myScanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
        
        double[][] ruggedArray = new double [rowIndex][];
        
        for (int i = 0; i < rowIndex; i++) {
        	ruggedArray[i] = new double[columnIndex[i]];
            for (int j = 0; j < columnIndex[i]; j++) {
                ruggedArray[i][j] = temp[i][j];
            }
        }
        return ruggedArray;
	}
	
    //Writes the ragged array of doubles into the file.
	static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {
		try (PrintWriter myWriter = new PrintWriter(outputFile)) {
			for (int i = 0; i < data.length; i++) {
				double[] tempRow = data[i];
				for (int j = 0; j < tempRow.length; i++) {
					myWriter.print(tempRow[j]);
	                if (j < tempRow.length - 1) {
	                    myWriter.print(" ");
	                }
				}
				myWriter.println();
			}
		} catch (FileNotFoundException e) {
	        System.err.println("ERROR: " + e.getMessage());
	        throw e;
		}
	}
	
}
