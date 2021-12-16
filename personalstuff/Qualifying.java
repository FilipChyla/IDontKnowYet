package com.personalstuff;

public class Qualifying extends Raceday {
    private String[] topQOne = new String[3];
    private float[] topQOneTimes = new float[3];
    private String[] topQTwo = new String[3];
    private float[] topQTwoTimes = new float[3];

    Qualifying(String sessionStart, String[] podium, float[] topTimes, String[] topQOne, float[] topQOneTimes, String[] topQTwo, float[] topQTwoTimes) {
        super(sessionStart, podium, topTimes);
        this.topQOne=topQOne;
        this.topQOneTimes=topQOneTimes;
        this.topQTwo=topQTwo;
        this.topQTwoTimes=topQTwoTimes;
    }

    public void getTopQOne() {
        System.out.println("Q1 podium:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1)+". "+topQOne[i]+"-"+topQOneTimes[i]+"s");
        }
        System.out.println();
    }

    public void getTopQTwo() {
        System.out.println("Q2 podium:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1)+". "+topQTwo[i]+"-"+topQTwoTimes[i]+"s");
        }
        System.out.println();
    }

    public void getPolesitter() {
        System.out.println("Polesitter: "+super.getFirst()+" with time: "+super.getFirstTime()+"s");
    }
}