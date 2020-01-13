/*
 **** Topic 1: Java Basics ****
 * OBJECTIVES:
 * 1 Define the scope of variables
 * 2 Define the structure of a java class
 * 3 Create executable java applications with a main method; run a java program from the
 * command line; including console output
 * 4 Import other Java packages to make them accessible in your code
 * 5 Compare and contrast the features and components of Java such as:
 * platform independence, object orientation, encapsulation, etc.
 */

package com.company;

/**
 * @author dominic
 */

/*
    import static variables and methods
    so that class prefix is not needed
*/

import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.Console; //Note: on the commandline, you should be outside the package directory

    /*
        example for using console class to run from command line is as follows

        public void printToConsole() {
        Console console = System.console();
        console.writer().write("Hello ");
        console.flush();

        System.out.println("World!");
        }
     */
    /*
        Below The class name is the same as the filename.
        The package and directory names match too. Classes can
        only be public or default (package) access
    */

public class Main { //A class is like a container for functions.

    /*
        Accessibility, from most restrictive to least:
        - private: Accessible only to this class (and inner classes)
        - default: Accessible only to classes in same package
        - protected: Accessible to subclasses and classes in the same package
        - public: Accessible to all lesson4 classes
     */
    public static void main(String[] args) {
	byte MONTHS_IN_YEAR = 12; //using byte type because number of months is a small number.
	byte PERCENTAGE = 100; //using byte here because it is a constant number.
	float annualInterestRate = 6.50F;

	/*
	     line below makes a new object and stores the variable input.
	 */
	Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome this in a loan payment calculator\n");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        /*
            The nextLine() method of the java.util.Scanner class scans from
            the current position until it finds a line separator delimiter.
            The method returns the String from the current position to the end of the line.
         */

        System.out.print(name + " Please enter the loan amount you require: ");
        int loanAmount = scanner.nextInt();

        float monthlyInterest = annualInterestRate / PERCENTAGE / MONTHS_IN_YEAR;

        System.out.print("Please enter period of years: ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR; //converting number of years into months.

        double loanToPay = loanAmount //this is the formula for loan repayment.
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        DecimalFormat df = new DecimalFormat("#.##"); //This line is for converting numbers to two decimal places
        System.out.println(name + "\nYou are required to pay: " + "R" +df.format(loanToPay) + " per month\nfor: " + numberOfPayments + " Months\nat "
                + annualInterestRate + "% Annual interest rate.");
    }
}
