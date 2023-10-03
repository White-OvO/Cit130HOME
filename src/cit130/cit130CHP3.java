package cit130;


//@author ChristopherGonzalez
//@note I pledge my word of honor that I have abided by the CSN Academic Integrity Policy
//while completing this assignment
//@file NaserHeraviCIT130Assignment3.java
//@version 2023-09

/*
 * 
 * 
 * This is a program that allows the user to choose between two options:  calculating bank fees or body fat percentage.
 * 
 *  
 * 
 * 
 */

import java.util.Scanner;

public class cit130CHP3 {

	public static void main(String[] args) {
		
		
		System.out.println(" HElLo : "
				+ "Enter 1 to run the fee program, enter 2 to run the body fat program, 3 to quit: \n");
		
		
		
		Scanner scanner = new Scanner(System.in);
		// next choice decision
//		
//		int choice = scanner.nextInt();
//		
		int choice;
			do { 
				choice = scanner.nextInt();

			//switch case for the number input
//		 switch (choice) {
//         case 1:
//             // Call the method to calculate bank fees
          
		if (choice == 1) { 
		processBankFee();
//             break;
		}
		else if (choice == 2) { 
//			
//		}
//		case 2:
//             // Call the method to calculate body fat
           
			calculateBodyFat();
			
            }
//             break;
//		case 3:
              else if (choice != 3) { 
             System.out.println("Not a valid key \n" );
         
              }
     
} while (choice != 3);

System.out.println("Thanks for using my program");
}


	  public static void processBankFee() {
	      double monthlyFee = 8;
	      double fee=0;
	      double  checks;
		  double feeBalance;
		  
	   
		  System.out.println("Enter the number of checks : \n");
		  
	      // scanner for checks
		  Scanner scanner = new Scanner(System.in);
		  checks = scanner.nextInt();

		  if (checks <= 0) {
	            System.out.println("Invalid number of checks has been entered - No processing will be performed");
	            feeBalance = -999;
		  }
	            else if (checks > 0 && checks <= 20) {
		        fee = .09;
		    } else if (checks > 20 && checks <= 40) {
		        fee = .07;
		    } else if(checks > 40 && checks <= 60) {
		        fee = .06;
		    } else if(checks > 60) {
		        fee = 0.05;
		    }
	      	
	      	
	      	
		// bank logic to calculate bank fees  
	
		  
		  feeBalance = (monthlyFee )+( checks * fee);
		  
		
	      	
	        System.out.println("Calculating bank fees... total of : \n" + feeBalance);
	        System.out.println("Enter 1 to run the fee program, enter 2 to run the body fat program, 3 to quit: \n");
			
			Scanner scanner2= new Scanner(System.in);
			
			int choice;
	    }

	  
	  
	  
	  
	  
	  
    //option 2:
	public static void calculateBodyFat() {
//		double weight;
//		double wristMeasurement;
//        double waistMesurement ;
//		double hipMeasurement;
//		double forearmMeasurement;
//		double A1;
//		double A2;
//		double A3;
//		double A4;
//		double A5;
//		double B;
//		double bodyFat;
//		double bodyFatPercentage;
	    double weight, wristMeasurement, waistMeasurement, hipMeasurement, forearmMeasurement;

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter gender as M or F : \n");
//		 String gender = scanner.next();
		String gender = scanner.next().toUpperCase();


	//	   Scanner weight = new Scanner(System.in);
	//       int choice = weight.nextInt();
	 System.out.println("Enter weight: \n");
     weight = scanner.nextDouble();
    
     
     
     
     
     
     
    System.out.println("Enter waist measurement: \n");   
    // Scanner waistMeasurement1 = new Scanner(System.in);
    //int choice = waistMeasurement.nextInt();
    //wristMesurement = scanner.nextDouble();
    //Scanner waistMeasurement = new Scanner(System.in);
    waistMeasurement  = scanner.nextDouble();
    
    
    
    ///////// another method ////////
    //////// System.out.println("Enter waist measurement: ");
    ///////    double waistMeasurement = scanner.nextDouble();


    
if (gender.equals("F"))  {
	System.out.println("Enter wrist measurement: \n");
    wristMeasurement = scanner.nextDouble();
    
    System.out.println("Enter hip masurement \n");
    hipMeasurement = scanner.nextDouble();
    
    
    System.out.println("Enter forearm mesurement : \n");
    forearmMeasurement = scanner.nextDouble();
    // if its female
    
       
  double    A1 = (weight * .732)+ 8.987;
  double	A2 = wristMeasurement / 3.14;
  double	A3 = waistMeasurement * .157;
  double	A4 = hipMeasurement * .249;
  double	A5 = forearmMeasurement * .434;
  double	B = A1 + A2 - A3 - A4 + A5;
  double	bodyFat = weight - B;
  double	bodyFatPercentage = bodyFat * 100 / weight;
	
	
	
	System.out.println(" A1 = \n" + A1);

	System.out.println(" A2 = \n" + A2);
	

	System.out.println(" A3 = \n" + A3);
	

	System.out.println(" A4 = \n" + A4);
	

	System.out.println(" A5 = \n" + A5);
	

	System.out.println(" B = \n" + B);
	

	System.out.println(" BodyFat = \n" + bodyFat);
	
	System.out.println("Body Fat percentage = " + bodyFatPercentage);

} else if (gender.equals("M")) {   // if its male 
double	A1 = (weight * 1.082)+ 94.42;
double	A2 = waistMeasurement * 4.15;
double	B = A1 - A2;
double	bodyFat = weight - B;
double	bodyFatPercentage = bodyFat * 100 / weight;


	System.out.println(" A1 = \n" + A1);
System.out.println("\n");

	System.out.println(" A2 = \n" + A2);
	System.out.println("\n");
	


	System.out.println(" B = \n" + B);
	System.out.println("\n");
	

	System.out.println(" BodyFat = \n" + bodyFat);
	System.out.println("\n");
	
	System.out.println("Body Fat percentage = " + bodyFatPercentage);
	System.out.println("\n");
	
	

}
System.out.println("\n");

System.out.println("Enter 1 to run the fee program, enter 2 to run the body fat program, 3 to quit: \n");
System.out.println("\n");

Scanner scanner3= new Scanner(System.in);

int choice;
	

	}

	}
	
