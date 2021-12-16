package com.personalstuff;

public class FreePractice extends Raceday{
    private float averageLaps;

    FreePractice(String sessionStart, String[] podium, float[] topTimes, float averageLaps) {
        super(sessionStart, podium, topTimes);
        this.averageLaps=averageLaps;
    }

    public void writeAverageLaps(){
        System.out.println("Average number of laps: "+averageLaps);
    }
}
