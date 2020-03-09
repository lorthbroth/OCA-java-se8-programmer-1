package com.company;

public class lesson1 {
    public static int a = 55;
    private in b = 88;

    //this is a constructor.
    public lesson1(){
        System.out.println("Class scope: " + lesson1.a );
        System.out.println("Object scope: " + this.b);
    }

    public final void doStuff2(){}
    final public void doStuff3(){}

    public final void doStuff(int c){
        int b = 1;
        int d;
        d = 11;
        double e;
        e = 10.0;

        System.out.println("Method scope : " + b);
        System.out.println("Method scope : " + c);
        System.out.println("Method scope : " + d);
        System.out.println("Method scope : " + e);

        if(true){
            String myString = "This variable only has scope of if statement";
        }

        for(int i = 0; i < 3; i++){
            System.out.print("for loop variable " + i + "is in scope\n");
        }

        for(int j = 0; j < 3; j++)
            System.out.print("for loop variable " + j + " is in scope\n");
        public static void main (String[] args){

        }
    }
}
