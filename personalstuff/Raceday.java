package com.personalstuff;

public class Raceday {
    private String sessionStart;
    private String[] podium = new String[3];
    private float[] topTimes = new float[3];

    Raceday(String sessionStart, String[] podium, float[] topTimes){
        this.podium=podium;
        this.sessionStart=sessionStart;
        this.topTimes=topTimes;
    }

    public void writeSessionStart() {
        System.out.println("Session started at "+sessionStart);
    }

    public void writeTopTimes() {
        System.out.println("Final lap times:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1)+". "+topTimes[i]+"s");
        }
    }

    public void writePodium() {
        System.out.println("Final podium:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1)+". "+podium[i]+"-"+topTimes[i]+"s");
        }
        System.out.println();
    }

    public String getFirst() {
        return podium[0];
    }
    public float getFirstTime(){
        return topTimes[0];
    }
}
