package com.company;
/*
* Topic 8 : Handling Exceptions
*Objectives  :
*
*1. Differentiate among checked exceptions, unchecked exceptions, and Errors
*2. Create a try-catch block and determine how exceptions alter normal program flow
*3. Describe the advantages of Exception handling
*4. Create and invoke a method that throws an exception
*5. Recognize common exception classes
* (such as NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException, ClassCastException)
* */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Differentiate among checked exceptions, unchecked exceptions, and Errors
        Dominic dominic = new Dominic();
        dominic.tryCatchFinally();

        try {
            dominic.tryWithResources();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        dominic.throwException();
        try {
            dominic.tryWithResources();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
