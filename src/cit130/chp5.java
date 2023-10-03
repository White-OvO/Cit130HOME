package cit130;

import java.util.Scanner;
/*
 * 
 * 
 * Assignment: Write a Java program to display a menu of 3 options/parts. Option 1 processes
travel data. Option 2 processes operations on integers. Option 3 is used to exit the program. Any
other option should result in asking again. You must have a continuous loop allowing the user to
select from the list of options
 * 
 * 
 * 
 */
public class chp5 {
	public static void main(String[] args) { 

		System.out.println(" HElLo : "+ "Enter 1 to process travel data, enter 2 to processes operations on integers, 3 to Exit: \n");
		
		Scanner scanner = new Scanner(System.in);
	// next choice decision
//	int choice = scanner.nextInt();

	int choice;
		do { 
			choice = scanner.nextInt();

// case 1 indidication 
      
	if (choice == 1) { 
		processesTravelData(scanner);
//         break;
	}
// ininilization 2nd option
	
	else if (choice == 2) { 

		operationsOnIntegers(scanner);
        }
//         break;
//	case 3:
          else if (choice != 3) { 
         System.out.println("Not a valid key \n" );
     
          }
 
} while (choice != 3);
scanner.close();
System.out.println("Have a good night");
	}
/* The distance a vehicle travels can be calculated using the following simple formula:
	distance = speed * time
			• Ask the user for the speed of a car and the time (number of hours traveled).
			• Display the distance traveled for every hour (HINT: your loop counter variable can keep
*/ 
	public static void processesTravelData(Scanner scanner) { 
	double speed;
	int hours;	
	double time; 
	
	System.out.println("Car travel data \n");
		System.out.println("How fast is the car going ? (Must be between 1mph to 120mph) \n");
		

		speed = scanner.nextDouble();
		while (speed < 1 || speed > 120) {
            System.out.println("Invalid speed. Please enter a value between 1 and 120.");
            System.out.print("Enter the speed of the car in miles per hour (1-120): ");
            speed = scanner.nextDouble();
		}
		
//		System.out.println(speed);
		
		
		
	
		
//do not allow the user to enter a negative value for hours 
		
		System.out.println("How many hours is it traveling? \n");
		time = scanner.nextInt();
		
		while (time < 0) {
            System.out.println("Invalid time. Please enter a positive value.");
            System.out.print("Enter the time traveled in hours (positive value): ");
            time = scanner.nextInt();
    		
        }
		
		
		
//	System.out.printf("%.2f%nmiles \n",  hours);
		System.out.printf("%.2f%nmph \n", speed );
		
	
		
		System.out.println("Hour\tDistance");
        System.out.println("-----------------");
        for (int hour = 1; hour <= time; hour++) {
// Calculate the distance using the formula
        double distance = speed * hour;
// Display the hour and the distance
            System.out.println(hour + "\t" + distance +" miles ");
        }
        
        
        
	}
	
	
public static void operationsOnIntegers(Scanner scanner) { 
	// Write a program that reads a set of integers and process them according to the following requirements: Use a sentinel value to end the data entry.
	
	
System.out.println("Process a set of Integers: \n");
System.out.println("To end the calculartor, enter -99 \n");




	
}



}

