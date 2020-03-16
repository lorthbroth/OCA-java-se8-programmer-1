package com.company;

public class leicester implements english_premier {
    int point = 3;
    int won = 16;
    int games = 29;

    @Override
    public void wins() {
        System.out.println("Leicester city played " + games + " games with "+ won+ " wins");
    }

    @Override
    public void scores() {
        System.out.println("Jamie Vardy is the top team goal scorer with 19 goals");
    }

    @Override
    public void rank() {
        int won = 16;
        int draws = 5;
        int totalPoints = draws + won * point;

        System.out.println("Liecester city is rank #3 with "+ totalPoints+ " points");
    }
}
