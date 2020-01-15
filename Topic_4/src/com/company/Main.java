/*
 **** Topic 4: Creating and using arrays  ****
 * OBJECTIVES:
 * 1 Declare, instantiate and use a one-dimensional array
 * 2 Declare, instantiate and use a multi-dimensional array
 */

package com.company;

/**
 * @author dominic
 */
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        oneDimensional();
        multiDimensional();
    }

    /*
        below is a one-dimensional array
     */
    public static void oneDimensional (){
        System.out.println("One-Dimensional array list: ");
        int [] array = {42, 20, 21, 10, 5};
        // System.out.println(array) wil not compile because the array is stored as a string.
        System.out.println("Here are the original array: " + Arrays.toString(array));

        Arrays.sort(array);// sorting arrays to appear in a numerical order
        System.out.println("Arrays in numerical order: " + Arrays.toString(array));
    }
    /*
        Below is an example of a multi-dimensional array
     */
    public static void multiDimensional () {
        System.out.println("One-Dimensional array list: ");
        int [][] array = {{3, 4, 21, 50, 10},{87, 10, 11, 76, 100}};
        System.out.println("This is a multi-Dimensional array: " + Arrays.deepToString(array));
    }
}
