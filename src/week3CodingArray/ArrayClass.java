package week3CodingArray;

import java.util.Arrays;

public class ArrayClass {
	public static void main(String[] args) {
		// Instruction 1:
		int[] ages = new int[8];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		//Instruction 1,a:
		int ageLen = ages.length;
		
		ages[ageLen - 1] -= ages[0];
		System.out.println("Difference of last and first numbers: " + (ages[ageLen-1]+ ages[0]) + " - " + ages[0] + " = " + ages[ageLen - 1] + ".");
		
		//Instruction 1,b:	
		int[] newAges = new int[ageLen + 1];
		for(int i = 0; i < ageLen; i++) {
			newAges[i] = ages[i];
		}
		newAges[8] = 26;
		
		newAges[newAges.length - 1] -= newAges[0];
		System.out.println("Updated Difference of last and first numbers: " + (newAges[newAges.length-1] + newAges[0]) + " - " + newAges[0] + " = " + newAges[newAges.length - 1] + ".");
		
		//Instruction 1,c:
		int sumNewAges = 0;
		
		for(int i = 0; i < newAges.length; i++) {
			sumNewAges += newAges[i];
		}
		double newAgesAvg = Double.valueOf(sumNewAges) / Double.valueOf(newAges.length);
		System.out.println("The average age in the array is " + String.format("%.2f", newAgesAvg) + ".");
		
		
		
		//Instruction 2:
		String[] names = new String[6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		//Instruction 2,a:
		int sumNames = 0;
		for(String name : names) {
			sumNames += name.length();
		}
		double namesAvg = Double.valueOf(sumNames) / Double.valueOf(names.length);
		System.out.println("The average number of letters per name is " + String.format("%.2f", namesAvg) + ".");
		
		//Instruction 2,b:
		String namesCombined = "";
		for(String name : names) {
			namesCombined += name + " ";
		}
		System.out.println("All names: " + namesCombined);
		
		

		//Instruction 5:
		int[] nameLengths = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		//Instruction 6:
		int sumNameLengths = 0;
		for(int nameLength : nameLengths) {
			sumNameLengths += nameLength;
		}
		System.out.println("The total number of letters is " + sumNameLengths + ".");
	}
	
	//Instruction 7:
	public static String stringConcatenation(String word, int n) {
		String stringTotal = "";
		for(int i = 0; i < n; i++) {
			stringTotal += word;
		}
		return stringTotal;
	}
	//Instruction 8:
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//Instruction 9:
	public static boolean greaterThanHundred(int[] arrayNumbers) {
		int sumAllNumbers = 0;
		for(int i = 0; i < arrayNumbers.length;i++) {
			sumAllNumbers += arrayNumbers[i];
		}
		return sumAllNumbers > 100;
	}
	
	//Instruction 10:
	public static double averageOfArray(double[] array) {
		double sumDoubles = 0;
		for(double arr : array) {
			sumDoubles += arr;
		}
		return sumDoubles / array.length;
	}
	
	//Instruction 11:
	public static boolean isGreater(double[] array1, double[] array2) {
		double sumArray1 = 0;
		double sumArray2 = 0;
		
		for(int i = 0; i < array1.length; i++) {
			sumArray1 += array1[i];
		}
		for(int i = 0; i < array2.length; i++) {
			sumArray2 += array2[i];	
		}
		double array1Avg = sumArray1 / array1.length;
		double array2Avg = sumArray2 / array2.length;
		
		return array1Avg > array2Avg;
	}
	
	//Instruction 12:
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside) && (moneyInPocket > 10.50);
	}
	
	//Instruction 13:
	//This method sorts an array and finds the median of the sorted array. I created it because I don't
	//think that java has a similar method pre-written in the compiler.
	public static double medianMethod(double[] medianArray) {
		double medianNumber = 0;
		int arrLength = medianArray.length;
		Arrays.sort(medianArray);
		
		if(medianArray.length % 2 == 1) {
			medianNumber = medianArray[arrLength / 2];
		}else {
			medianNumber = (medianArray[arrLength / 2] + medianArray[(arrLength / 2)- 1]) / 2 ;
		}
		return medianNumber;
	}
}