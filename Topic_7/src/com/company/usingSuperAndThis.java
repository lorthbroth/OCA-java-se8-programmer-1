package com.company;

public class usingSuperAndThis {
    int num;
    String  greeting = "Hello im from the super class!";
    /*
        Add a number to existing number, plus 1
     */
    public void addNumbrerPlusOne(int num){
        //num += ++num; //this is an incorrect method
        this.num += ++num; //correct
    }

    public String getGreeting(){
        return greeting;
    }

    public usingSuperAndThis(int num){
        this.num = num;
    }
}