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
            System.out.println("Your number is EVEN");
        else
            System.out.println("Number is ODD");
    }
}
