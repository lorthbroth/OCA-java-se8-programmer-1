package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    usingWhileLoop();
	    usingForLoops();
	    usingBreak();
    }

    public static void  usingWhileLoop () {
        //In this program we will find the factorial of a number entered
        System.out.println("1. Finding factorial using while loop".toUpperCase());
        int number;
        System.out.print("Enter any integer number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        long fact = 1;
        int i = 1;
        while(i <= number){
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }

    public static void usingForLoops(){
        //this program will help you find sum of the natural numbers
        System.out.println("Now lets use For loops to find sum of the first natural numbers".toUpperCase());
        int number, count, total = 0;

        System.out.println("Enter the value of n:");
        //Scanner is used for reading user input
        Scanner scan = new Scanner(System.in);
        //nextInt() method reads integer entered by user
        number = scan.nextInt();
        //closing scanner after use
        scan.close();
        for(count = 1; count <= number; count++){
            total = total + count;
        }

        System.out.println("Sum of first "+number+" natural numbers is: "+total+ "\n");

        System.out.println("Results of enhanced loop");
        String arr[] = {"now","this","is","the results","of","Enhanced loop\n\n"};
        for (String str : arr){
            System.out.println(str);
        }
    }

    public static void usingBreak(){// Break statement
        System.out.println("Break state");
        int num =4;
        while(num<=5)
        {
            System.out.println("Value of variable is: "+num);
            if (num==2)
            {
                break;
            }
            num++;
        }
        System.out.println("Out of while-loop");
    }
}
