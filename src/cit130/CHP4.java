package cit130;

import java.util.Scanner;



//@author ChristopherGonzalez
//@note I pledge my word of honor that I have abided by the CSN Academic Integrity Policy
//while completing this assignment
//@file NaserHeraviCIT130Assignment4.java
//@version 2023-09

/* 
* 
* 
* This is a program that allows the user to VALIDATE password , inormation collection of data along with order total 
* , destination
* 
*  
* 
* 
*/

public class CHP4 {

	public static void main(String[] args) {
		double shippingCost = 0;
		String correctPassword = "SeeM$";

		Scanner input = new Scanner(System.in);		
		System.out.println("Hello ,Enter Password : \n");
		String userPassword = input.nextLine(); 

		while (!userPassword.equals(correctPassword)) {
			System.out.println("Try again : \n");
			userPassword = input.nextLine();
		}

		System.out.println("Password accepted.");

		System.out.println("Enter Your first name  : \n");			
		String firstName = input.nextLine();

		while (firstName.length() > 5) {
			System.out.println("TOO LONG ");
			firstName = input.nextLine();
		}

		System.out.println("Enter your last name : \n");
		String lastName = input.nextLine();
		System.out.println("Your full name is :" + firstName + " " +  lastName );

		System.out.println("Enter your email address: \n");
		String emailAddress = input.nextLine();

		if (!emailAddress.contains("@")) {
			emailAddress = "UNKNOWN@edu";
		} else { 
			System.out.println("Email address is : " + emailAddress);
		}

		System.out.println("Email address : " +  emailAddress);

		double orderTotal = 0;

		do {
			System.out.println("Enter the amount for your order: ");
			orderTotal = input.nextDouble();
			if (orderTotal <= 0) {
				System.out.println("Incorrect amount of order - please enter a positive value.");
			} else {
				System.out.println("Order total = $" + orderTotal);
			}
		} while (orderTotal <= 0);

		System.out.println("Enter the destination: \n");
		String destination = input.next().toLowerCase(); 

		while (!destination.equals("usa") && !destination.equals("canada")) {
			System.out.println("Error.Invalid destination. Please enter USA or CANADA \n");
			destination = input.next().toLowerCase();
		}

		final double shippingMethod_usa1  =  6;
		final double shippingMethod_usa2  = 9;
		final double shippingMethod_usa3 = 12;
		final double shippingMethod_usa4 = 0;
		final double shippingMethod_canada1 = 8;
		final double shippingMethod_canada2 = 12;
		final double shippingMethod_canada3 = 15;
		final double shippingMethod_canada4 = 0;

		if (destination.equalsIgnoreCase("usa")) {
			if (orderTotal  <= 50) { 
				shippingCost = shippingMethod_usa1;
			} else if (orderTotal <= 100) {
				shippingCost = shippingMethod_usa2;
			} else if (orderTotal <= 150) { 
				shippingCost = shippingMethod_usa3;
			} else {
				shippingCost = shippingMethod_usa4;
			}
		} else if (destination.equalsIgnoreCase("canada")) {
			if (orderTotal  <= 50) { 
				shippingCost = shippingMethod_canada1;
			} else if (orderTotal <= 100) {
				shippingCost = shippingMethod_canada2;
			} else if (orderTotal <= 150) { 
				shippingCost = shippingMethod_canada3;
			} else {
				shippingCost = shippingMethod_canada4;
			}
		}
		
		System.out.println("S H I P P I N G R E P O R T\n");
		System.out.println("Password : " + correctPassword);
		System.out.println("Name: "+ firstName + " " + lastName );
		System.out.println("Email address: " + emailAddress);
		System.out.println("Total amount: " + orderTotal);
		System.out.println("Shipping destination: " + destination);
		System.out.println("Shipping cost "+ shippingCost);
	}
}
	
		
		//finalTotal =( orderTotal + shippingCost);	

	


	
	
