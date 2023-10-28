package cit130;
//@author ChristopherGonzalez
//@note I pledge my word of honor that I have abided by the CSN Academic Integrity
//Policy
//while completing this assignment
/*
*
*
* This is a program that allows the user to choose between three options : one where a number is inputed and the outputed with a triangle like formation 
* that counts down with double space . The next option 2, is a count number character when you input a letter followed by a single character the program
* will reply with the amount of times the word comes out in the sentence. Option 3 is an investment calculator input investment amount , rate , and it will accumilate the future 
* value.. finally option 4 which exits the program
*
*
*
*
*/
import java.util.Scanner;

public class chp6HW {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Display a pattern \n");
            System.out.println("2. Count number of characters \n");
            System.out.println("3. Calculate Future value of investment\n");
            System.out.println("4. End the program\n");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Scanner patternScanner = new Scanner(System.in);
                    System.out.println("Please enter the total number of lines you would like in the pattern: ");
                    int nlines = patternScanner.nextInt();
                    pattern(nlines);
                    
                    break;
                case 2:
                	 Scanner countScanner = new Scanner(System.in);
                     System.out.println("Enter a string: ");
                     String str = countScanner.nextLine();
                     System.out.println("Enter a character to count: ");
                     char c = countScanner.nextLine().charAt(0);
                     int charCount = count(str, c);
                     System.out.printf("The character '%c' occurs %d times in the string \"%s\".\n", c, charCount, str);
                     
                    break;
                case 3:
                	 Scanner investmentsScanner = new Scanner(System.in);
                	    System.out.print("Enter investment amount: ");
                	    double investedAmount = investmentsScanner.nextDouble();
                	    System.out.print("Enter yearly interest rate: ");
                	    double yearlyInterestRate = investmentsScanner.nextDouble();
                	    System.out.print("Enter number of years to calculate the future value: ");
                	    int numberOfYears = investmentsScanner.nextInt();
                	    double monthlyInterestRate = yearlyInterestRate / 12;
                	    double futureValue = FutureValue(investedAmount, yearlyInterestRate, numberOfYears); //  double monthlyInterestRate = yearlyInterestRate / 12;
                   // double futureValue = FutureValue(investedAmount, yearlyInterestRate, numberOfYears);
                    System.out.println("After "+ numberOfYears + " years at the intrest rate of "+ yearlyInterestRate + " % , future value is: " + futureValue);             
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 4.");
            }
        }
    }

    public static double pattern(int nlines) {
        int product = 1;
        for (int i = nlines; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                if (j == i) {
                    System.out.print(j);
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
            product *= i;
        }
        return product;
    }
 
      public static void main2(String[] args) {
         Scanner scanner = new Scanner(System.in);
          System.out.println("Please enter the total number of lines you would like in the pattern: ");
         int nlines = scanner.nextInt();
       //  pattern(nlines);
      }
  
public static int count(String str, char c) { 
	  int count = 0;
      for (int i = 0; i < str.length(); i++) {
          if (str.charAt(i) == c) {
              count++;
          }
      }
      return count;
}	
public static double FutureValue(double investedAmount, double yearlyInterestRate, int numberOfYears) {
    double monthlyInterestRate = yearlyInterestRate / 12;
    double futureValue = investedAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
    return futureValue;
}
}

