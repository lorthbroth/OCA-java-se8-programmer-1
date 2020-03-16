package com.company;

public class ManCity implements english_premier {
    int point = 3;

    @Override
    public void wins() {
        int games = 28;
        int won = 18;
        System.out.println("Man City played "+games + " with "+ won + " wins");
    }

    @Override
    public void scores() {
        System.out.println("Sergio Arguero is the top team score with 16 goals.");
    }

    @Override
    public void rank() {
        int won = 18;
        int draws = 3;
        int totalPoints = draws + (won * point);
        System.out.println("Man city is Ranked #2 with "+ totalPoints + " points");
    }
}
