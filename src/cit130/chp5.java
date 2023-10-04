package cit130;

import java.util.Scanner;

public class chp5 {
	public static void main(String[] args) { 

		System.out.println(" HElLo : "+ "Enter 1 to process travel data, enter 2 to processes operations on integers, 3 to Exit: \n");
		
		Scanner scanner = new Scanner(System.in);
	// next choice decision
//	int choice = scanner.nextInt();

	int choice;
	boolean repeat = true;
	boolean repeat2 = false;
	
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
         
         System.out.println(" HelLo : "+ "Enter 1 to process travel data, enter 2 to processes operations on integers, 3 to Exit: \n");
 		
          }

	

    
 
//    if answer =  !99 { 
    	
//    }
//    
//    if (answer.equalsIgnoreCase("Y")) { // compare the input with the sentinel value
//       repeat = false; // update the loop condition
//    }
//    if (answer.equalsIgnoreCase("N")) { // compare the input with the sentinel value
//        repeat2 = false; // update the loop condition
//    }
    
    
   // System.out.println(" HelLo : "+ "Enter 1 to process travel data, enter 2 to processes operations on integers, 3 to Exit: \n");
	

    
} while (choice != 3);
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
        System.out.println(" HelLo : "+ "Enter 1 to process travel data, enter 2 to processes operations on integers, 3 to Exit: \n");
        
        
	}
	
	
public static void operationsOnIntegers(Scanner scanner) { 
	// Write a program that reads a set of integers and process them according to the following requirements: Use a sentinel value to end the data entry.
//	int integer ;
//	
//System.out.println("Process a set of Integers: \n");
//System.out.println("To end the calculartor, enter -99 \n");
//System.out.println("Please enter an integer \n");
//
//integer = scanner.nextInt();
//while (integer != -99) { 
//    System.out.println("You entered: " + integer + "\n");
//    System.out.println("Please enter another integer or -99 to end \n");
//    integer = scanner.nextInt();
//} 
//
//System.out.println("That is all for today \n");
//} 
//	
//	


int sum = 0;
int count = 0;

int integer ;




int even = 0;
int odd = 0;
int countOdd = 0;
int countEven = 0;
System.out.println("Process a set of Integers\n"
		+ "To end the calculation, enter -99\n"
		+ "Please enter an integer");
//while (integer != -99) { 
//	integer = scanner.nextDouble();
//	if (integer != -99) { 
//		sum += integer;
//		count++;
try {
integer = scanner.nextInt();

while (integer != -99) { 
	  sum += integer;
    count++;
    
    if (integer % 2 == 0) {
        even += integer;
        countEven++;
        System.out.println("Even");
        
        
    } else {
        odd += integer;
        countOdd++;
        System.out.println("Odd");
    }
	  
    System.out.println("Please enter another integer or -99 to end");
    integer = scanner.nextInt();
} 


} catch (Exception e) {
    // print an error message if an exception occurs
    System.out.println("Invalid input. Please enter only integers.");

}



// loop of evens and odds
//sum += integer;
//sum += count_odd;

//double evenAverage = even/countEven;
//int evenAverage = even / countEven;
double evenAverage = (double) even / countEven;
double oddAverage = (double) odd / countOdd;
double allValues = (double ) sum / count;

System.out.printf("sum of all Even values : %d\n", even );
System.out.printf("Sum of all Odd values : %d\n", odd);
System.out.printf("Average of Even values : %.2f \n",evenAverage);
System.out.printf("Average of odd values : %.2f \n", oddAverage);
System.out.printf("Average of All values : %.2f \n", allValues);



System.out.println(" HelLo : "+ "Enter 1 to process travel data, enter 2 to processes operations on integers, 3 to Exit: \n");
	
}

}

