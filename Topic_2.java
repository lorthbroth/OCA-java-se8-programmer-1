/*
 **** Topic 2: Working with java data types ****
 * OBJECTIVES:
 * 1 Declare and initialize variables (including casting of primitive data types)
 * 2 Differentiate between object reference variables and primitive variables
 * 3 Know how to read or write to object fields
 * 4 Explain an Object's Lifecycle (creation, "dereference by reassignment" and garbage collection)
 * 5 Develop code that uses wrapper classes such as Boolean, Double, and Integer.
 */

package com.company;

/**
 * @author dominic
 */

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            multiple variables of the same type declared on the same line below.
         */
	    byte MONTHS_IN_YEAR = 12, PERCENTAGE = 100;
	    String annualInterestRate = "6.50";

	    /*
	         line below makes a new object and stores the variable input.
	    */
    	Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome this in a loan payment calculator\n");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print(name + " Please enter the loan amount you require: ");
        int loanAmount = scanner.nextInt();

        double monthlyInterest = Double.parseDouble(annualInterestRate) / PERCENTAGE / MONTHS_IN_YEAR;
        /*
            Above line and Double.parseDouble() is casting of variable methods.
         */

        System.out.print("Please enter period of years: ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR; //converting number of years into months.
        //convert numberOfPayments into wrapper objects
        Integer paymentsObject = Integer.valueOf(numberOfPayments);

        double loanToPay = loanAmount //this is the formula for loan repayment.
                * (monthlyInterest * Math.pow(1 + monthlyInterest, paymentsObject))
                / (Math.pow(1 + monthlyInterest, paymentsObject) - 1);

        DecimalFormat df = new DecimalFormat("#.##"); //This line is for converting numbers into two decimal places
        System.out.println(name + "\nYou are required to pay: " + "R" +df.format(loanToPay) + " per month\nfor: " + paymentsObject + " Months\nat "
                + annualInterestRate + "% Annual interest rate."); //Printing Concatenated Strings

        Calendar futureDate = Calendar.getInstance();
        futureDate.add(Calendar.MONTH, numberOfPayments);
        System.out.println("Your loan will be fully paid by: " + futureDate.getTime());
    }
}
