package cit130;

//@author ChristopherGonzalez
//@note I pledge my word of honor that I have abided by the CSN Academic Integrity Policy
//while completing this assignment
//@file NaserHeraviCIT130Assignment2.java
//@version 2023-08
//@brief A program that takes inputs for a total principle balance of a loan
//@note Time taken to develop, write, test and debug solution: 30 min






import java.util.Scanner;

public class assignment2Chp2 {

	public static void main(String[] args) {
		// enter the original balance : input
		Scanner scanner = new Scanner(System.in);
		
		double originalBalance;
		int annualIntrestRate; //5
		int compoundYears;
		int intrestInYears;
		double finalBalance; // final output
	
		
		
		System.out.println("Enter the original balance amount ");
		originalBalance = scanner.nextInt();
//System.out.println("Your have entered " + originalBalance);
		System.out.println("Enter the annual intrest ");
		annualIntrestRate = scanner.nextInt();
//System.out.println("annual intrest rate is : "  + annualIntrestRate );
		System.out.println("Enter the number of times per year that the intrest is compounded: " );
		compoundYears = scanner.nextInt();
//System.out.println("number of years  : " + numberOfYears); 		
		System.out.println("Enter the number of years for the account to earn intrest : ");
		intrestInYears= scanner.nextInt();
//System.out.println("You have entered " + intrest + " number of years");

		// times = times per year compounded (ex: 4 times per year) 

///Wrong syntaxs		
finalBalance = originalBalance * Math.pow(1 + (annualIntrestRate /100) /  compoundYears, compoundYears * intrestInYears);
//finalBalance = originalBalance * Math.pow(1 + annualIntrestRate / intrestInYears) ^intrestInYears * intrestInYears);
	//	Math.pow(1 + annualIntrestRate / intrestInYears, intrestInYears * intrestInYears);	
	System.out.println("******************** ACME BANK    ");
	System.out.println("original amount = $" + originalBalance);
	System.out.println("Annual intrest rate : " +annualIntrestRate + "%");
	System.out.println("Intrest compound " + compoundYears + "times per year");
	System.out.println("number of years = " + intrestInYears);

	System.out.println("Final balance after " + intrestInYears + " years at an annual rate of " + annualIntrestRate + "% " + 
				"compounded " + compoundYears +" times per year is : " + finalBalance);
		
	}

}

// declared variables

/*			originaalBalance =	double
 * 			annualIntrest =	int
 * 			compoundYears = 	int				
 * 			intrestYear = 	int
 * 			finalBalance = double
 * 	
 * 
 *  finalBalance = originalBalance * compoundFactor
 * 
 * 
 * 
 *	print finalBalance
 * 			
 * 
 * 
 * 
 * 
 * print finalBalance
 * 
 * 
 * 
 * 
 * 
 * 
 */
