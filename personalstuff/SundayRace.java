package com.personalstuff;

public class SundayRace extends Raceday{
    private String fastestLap;
    private float fastestLapTime;

    SundayRace(String sessionStart, String[] podium, float[] topTimes, String fastestLap, float fastestLapTime) {
        super(sessionStart, podium, topTimes);
        this.fastestLap=fastestLap;
        this.fastestLapTime=fastestLapTime;
    }
    public void writeFastestLap(){
        System.out.println(fastestLap+" got 1 point for fastest lap with time: "+fastestLapTime+"s");
    }
}
