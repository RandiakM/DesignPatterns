package com.Patterns.Observer2;

public class AverageScoreDisplay implements Observer{

    private int predictedScore;
    private float runRate;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runRate =(float)runs/overs;
        this.predictedScore = (int)(this.runRate * 50);
        display();
    }

    public void display(){
        System.out.println("\nAverage Score Display: \n" + "Run Rate: " + runRate + "\nPredictedScore: " + predictedScore);
    }
}
