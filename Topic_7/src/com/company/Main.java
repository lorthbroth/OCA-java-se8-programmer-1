package com.company;
/**
 * Topic 7 : Working with Inheritance
 * Objectives  :
 *
 * 1. Describe inheritance and its benefits
 * 2. Develop code that demonstrates the use of polymorphism; including overriding
 *    and object type versus reference type.
 * 3. Determine when casting is necessary
 * 4. Use super and this to access objects and constructors
 * 5. Use abstract classes and interfaces.
 * **/

public class Main {

    public static void main(String[] args) {
        //simple inheritance method through objects.
        Awesome dominic = new Awesome();
        Awesome2 dominique = new Awesome2();

        dominic.whoAreYou();
        dominique.whoAreYou(); //this method can access the same method as the line above.
        //we can access same methods through the extense
        dominique.whereYoufrom();

        usingSuperAndThis usingSuperAndThis = new usingSuperAndThis(0);
        usingSuperAndThis.addNumbrerPlusOne(2);


        System.out.println("\n");

        english_premier [] teams = {
         //creating arrays to save space of trying to access the classes one by one
                new Liverpool(),
                new ManCity(),
                new leicester()
        };

        for (int i = 0; i < teams.length; i++){
            //teams[i].wins();//with this method you can access all the classes through the interface.
            teams[i].scores();
            //teams[i].rank();
        }

    }
}