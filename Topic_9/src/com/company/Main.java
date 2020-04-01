/*
* Topic 9 : Working with Selected classes from the Java API

Objectives:

    1. Manipulate data using the StringBuilder class and its methods
    2. Creating and manipulating Strings
    3. Create and manipulate calendar data using classes from java.time.LocalDateTime,
      java.time.LocalDate, java.time.LocalTime, java.time.format.DateTimeFormatter, java.time.Period
    4. Declare and use an ArrayList of a given type
    5. Write a simple Lambda expression that consumes a Lambda Predicate expression

* */
package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        /*
           Manipulate data using the Stringbuilder class and its methods
         */
        StringBuilder sb = new StringBuilder();
        StringBuilder sbString = new StringBuilder(" fc");

        /*
            StringBuilder, unlike String, does NOT actually implement equals().
            If you call equals it will actually check reference equality, like ==
         */
        StringBuilder sbString1 = new StringBuilder("best");
        StringBuilder sbString2 = new StringBuilder("best");
        System.out.println("StringBuilder equal: " + sbString1.equals(sbString2));

        sb.append("Liverpool");
        sb.append(sbString, 0, sbString.length());
        System.out.println("appended and inserted: " + sb);

        /*
            Updating and deleting
         */
        sb.delete(0,sb.length());
        System.out.println("delete: " + sb);
        sb.append("Hello");
        sb.reverse();
        System.out.println("reverse: " + sb);
        sb.reverse(); // reverse back
        sb.setCharAt(0,'h');
        sb.replace(0,6,"howdy");
        System.out.println("replace: " + sb);

        /*
             Creating and manipulating strings
         */

        String a = "Liverpool";
        String b = a.concat(" deservers");
        b.concat(" EPL tittle");
        System.out.println(b);

        System.out.println(new Date().toString());

        String answer = String.format("The answer to the meaning of life is %d", 42);
        System.out.println(answer);

        /*
            Other comparison methods:
            .contentEquals(CharSequence cs)
            .contentEquals(StringBuilder sb)
            int .compareTo(String s) // positive, negative or zero result
            // positive if left string is greater
            int .compareToIgnoreCase(String s)
         */

        int index = "Liverpool".indexOf("p");
        System.out.println("indexOf(): " + index);

        System.out.println("------------------------------------------\n Create and manipulate calendar data \n ------------------------------------------");

        creatingDatesAndTimes();
        parsing();
        formatting();
        dateArithmetic();

        System.out.println("------------------------------------------\n Declare and using an ArrayList of a givin type \n -----------------");

        ArrayList myList = new ArrayList();

        List<String> myListImpl = new ArrayList<String>();

        myList.add("Java");
        int size = myList.size();
        System.out.println("Size of my arraylist: " + size);
        myList.remove("Java");
        myList.add("HTML");
        myList.add("CSS");
        myList.add("JavaScript");
        myList.add("Python");
        myList.add("Java");
        myList.add("C");
        myList.add("ASP.NET");
        System.out.println("Number of Languages is know: " + myList.size());
        System.out.println(myList);

        System.out.println(myList.get(4) + " is my favourite");
        myList.set(0, "Hyper Text Markup Language");
        System.out.println("basic web dev you need: " + myList.toString());

        if (myList.contains("Java")){
            int num = myList.indexOf("Java");
            System.out.println("Java is in index: " + num);
        }

        myList.clear();
        System.out.println("The list now empty?: " + myList.isEmpty());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.removeIf((Integer i) -> { return i >= 3; } );
        System.out.println(numbers);

        System.out.println("------------------------------------------\n Lambda expression that consumes a Lambda Predicate expression \n -----------------");

        List<Person> people = Arrays.asList(
                new Person("Dominic", 28, "Full Stack-Developer"),
                new Person("Bokang", 24, "UI and UX designer"),
                new Person("Palesa", 29, "Business Admin"),
                new Person("Bheki", 21, "Talent Scout")
        );

        OlderThan25 olderThan25 = new OlderThan25();
        List<Person> results = getMatching(people,olderThan25);
        System.out.println(results);

        /*
            Lambda expressions for Predicates
         */
        results = getMatching(people,(Person p) -> { return p.age > 25; }  );
        System.out.println(results);
        results = getMatching(people,p -> p.age < 25); // shorthand
        System.out.println(results);

    }

    public static List<Person> getMatching(List<Person> ls, Predicate<Person> ps){
        List<Person> results = new ArrayList<Person>();
        for (Person p : ls){
            if (ps.test(p)){
                results.add(p);
            }
        }
        return results;
    }

    public static void creatingDatesAndTimes(){
        System.out.println("The time now is: " + LocalDateTime.now());

        int year = 1992;
        int month = 3;
        int day = 21;

        LocalDate date = LocalDate.of(year, month, day);
        date = LocalDate.of(year, Month.MARCH, day);

        System.out.println("my date of birth: " + date);
    }

    public static void parsing(){
        String dt = "2010-06-04T11:59:59";
        LocalDateTime pdt = LocalDateTime.parse(dt, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("South Africa had worldcup: " + pdt);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 08 2020", f);
        LocalTime time = LocalTime.parse("08:00");
        System.out.println("Started jumpCo: " + date +  " at: " + time);
    }

    public static void formatting(){

    }

    public static void dateArithmetic(){
        Duration tenMinutes = Duration.ofMinutes(10);

        int hour = 11;
        int minute = 00;
        int second = 00;
        LocalTime time = LocalTime.of(hour, minute, second);

        LocalTime time2 = time.plusHours(2);
        System.out.println(time2);          // 13:00

        LocalTime time3 = time2.minus(tenMinutes);
        System.out.println(time3);          // 12:50

        /*
            runtime exception as using minutes with date
         */
        LocalDate date = LocalDate.of(2016,1,1);
        //date.plus(tenMinutes);

        /*
            Comparing dates and times
         */
        LocalDate date1 = LocalDate.of(2016, Month.JANUARY,01);
        LocalDate date2 = LocalDate.of(2016, Month.JANUARY,02);
        int result = date1.compareTo(date2);
        if(result == 1) {
            System.out.println("date1 is larger");
        }
        else if(result == -1) {
            System.out.println("date2 is larger");
        }
        else { // 0
            System.out.println("dates are equal");
        }

        Period period = Period.ofYears(1);
        period = Period.of(1,0,0); // alternatively


    }

}

class OlderThan25 implements Predicate<Person> {

    @Override
    public boolean test(Person person) {
        return person.age > 25;
    }
}

class YoungerThan25 implements Predicate<Person> {

    @Override
    public boolean test(Person person) {
        return person.age < 25;
    }
}

class Person {
    String name;
    int age;
    String position;

    Person(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + position;
    }
}
