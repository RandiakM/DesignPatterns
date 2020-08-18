package com.Patterns.Observer2;

public class Main {
    public static void main(String[] args) {
        // create objects for testing
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

        // pass the displays to Cricket data
        CricketData cricketdata = new CricketData();

        // register display elements
        cricketdata.addObserver(averageScoreDisplay);
        cricketdata.addObserver(currentScoreDisplay);

        // in real app you would have some logic to
        // call this function when data changes
        cricketdata.dataChanged();

        //remove an observer
        cricketdata.removeObserver(averageScoreDisplay);

        // now only currentScoreDisplay gets the
        // notification
        cricketdata.dataChanged();
    }
}
