/*
 **** Topic 3: Using Operators and Decision Constructs ****
 * OBJECTIVES:
 * 1 Use Java operators; including parentheses to override operator precedence
 * 2 Test equality between Strings and other objects using == and equals ()
 * 3 Create if and if/else and ternary constructs
 * 4 Use a switch statement
 */
package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Topic 3: Using operators and Decision Constructs");
        part1(); // operators, operands and expressions
        part2(); // Using switch statement
    }
    public static void part1() {
         /*
            Three types of operators:
            - infix: expr <op> expr, e.g. 2 + 2
            - prefix: <op> expr, e.g. -5
            - postfix: expr <op>, e.g. i++

            Java has operator overloading predefined
            no programmer-defined
         */
        Scanner scanner = new Scanner(System.in);
        // infix
        System.out.println("Operators, operands and expressions");
        System.out.println("Please enter any two integers to multiply: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int results = number1 * number2;

        // prefix
        System.out.println("results of your numbers turned into a negative number: " + -results); // -4
        System.out.println("Results incremented then added to the results: " + ++results); // 5; increment a, then get value
        System.out.println((results--) + ": number1 * number2 then + 1 then - 1");
        // postfix
        System.out.println(results); // 4

        /*
            arithmetic operators and operator precedence
       */
        System.out.println("arithmetic operators and operator precedence");

        System.out.println("Modulo".toUpperCase());
        System.out.print("Please enter number between 0 and 9: ");
        int number = scanner.nextInt();
        /*
            below are if and else statements constructs plus equality operator
         */
        if(number % 2 == 0) // == is the boolean expression
            System.out.println(number + " is an EVEN number");
        else
            System.out.println(number + " is an ODD number");
    }

    public static void part2(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Using Switch statement to find day of the weeek");
        System.out.print("Please enter a number between 1 and 7 to find out: ");

        int week = scanner.nextInt();
        String day;

        switch (week) {
            case 1:
                day = "Sunday is the 1st day of the week";
                break;
            case 2:
                day = "Monday is the 2nd day of the week";
                break;
            case 3:
                day = "Tuesday is the 3rd day of the week";
                break;
            case 4:
                day = "Wednesday is the 4th day of the week";
                break;
            case 5:
                day = "Thursday is the 5th day of the week";
                break;
            case 6:
                day = "Friday is the 6th day of the week";
                break;
            case 7:
                day = "Saturday is the 7th and last day of the week";
                break;
            default:
                day = "Invalid day";
                break;
        }
        System.out.println(day);
    }
}
