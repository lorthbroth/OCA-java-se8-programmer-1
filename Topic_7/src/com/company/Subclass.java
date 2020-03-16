package com.company;

public class Subclass extends usingSuperAndThis {
    public void sayGreeting(){
        System.out.println(super.getGreeting() + "World");
    }
    /*
        superclass has no default constructor, so
        we need to define one and call super() ourselves
     */

    public Subclass(int num){
        //System.out.println("Creating subclass"); // super must be first
        super(num); //call superclass constructor
        System.out.println("Creating subclass");
    }

    public Subclass(){
        //System.out.println("Creating subclass"); // this or super must be first
        this(0); // call other constructor
        System.out.println("Creating subclass");
    }
}
