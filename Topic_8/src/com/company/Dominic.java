package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Dominic {
    /*
        right-click => Copy Path to get file location in IDEA
    */
    private static final String FILENAME = "C:\\Users\\dominic\\Documents\\GitHub\\OCA-java-se8-programmer-1\\Topic_8\\src\\com\\company\\FILENAME.txt";

    /*
        Constructors can throw exceptions too.
     */
    public Dominic() throws RuntimeException {

    }

    /*
        First catch block should be more specific than the next otherwise
        compile error with unreachable code.

        Note: If both catch and finally throw an exception, the one from finally
        gets thrown.
     */
    void tryCatchFinally() {
        /*
            try is the happy path
            it requires either or both of catch, finally
         */
        Scanner scanner = null;

        try {
            scanner = new Scanner(new FileReader(FILENAME));
        }
        catch(IOException ioe) { // specific exception first
            /*
                IOException must be possible in try
             */
            System.out.println(ioe);   // print exception class and message
            ioe.printStackTrace();  // print stack trace (duh!)
        }
        catch(Exception e) { // broader exception next
            e.printStackTrace();
        }
        finally {
            // runs after try and/or catch
            System.out.println("Finally");
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    /*
        "throws", not "throw"
     */
    private void throwsException() throws IOException, FileNotFoundException {
        Scanner in = new Scanner(new FileReader(FILENAME));
    }

    /*
        Any Throwable, including RuntimeException and Error can be thrown
     */
    void throwException() {
        try {
            throw new Exception("bad!");
        }
        catch(Exception e) {
            System.out.println("Caught exception thrown above");
            System.out.println(e.toString());
        }
    }

    /*
        Try with resources can be used with class that implement
        auto-closeable. A finally block is inserted by the compiler and the
        resource closed. Both catch and finally are not needed.
    */
    void tryWithResources() throws Exception {

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME)); ) {
            String s = br.readLine();
            System.out.println(s);
        }
        catch (IOException ioe) {
            /*
                Have a catch in case there are problem auto-closing
                Exception with message and 'cause' as ioe
             */
            throw new Exception("An exception occurred",ioe);
        }
    }

    /*
        Sybex (p. 313)
     */
    private String complexExample() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before";
                v.length();
                result += "after";
            } catch (NullPointerException e) {
                result += "catch";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "done";
        }
        return result;

    }

    private static void unreachableCode() {
        try {
            System.out.println("Try");
            return;
        }
        catch(Exception e) {
            System.out.println("Exception");
            return;
        }
        finally {
            System.out.println("Run anyway");
        }
        /*
            The below is unreachable
         */
        //return;
    }
}
