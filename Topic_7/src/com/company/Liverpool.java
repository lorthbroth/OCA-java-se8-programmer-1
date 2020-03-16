package com.company;

public class Liverpool implements english_premier {
    int point = 3;

    @Override
    public void wins() {
        int games = 29;
        int won = 27;
        System.out.println("Liverpool played " + games + " games with " + won + " wins");
    }

    @Override
    public void scores() {
        System.out.println("Mohamed Salah is the top team goal score with 16 goals.");
    }

    @Override
    public void rank() {
        int won = 27;
        int draws = 1;
        int totalPoints = draws + (won * point);
        System.out.println("Liverpool is ranked #1 with " + totalPoints  +" points");
    }
}
