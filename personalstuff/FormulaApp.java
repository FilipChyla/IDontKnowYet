package com.personalstuff;

public class FormulaApp {
    public static void main(String[] args) {
        FreePractice bahrainFPOne = new FreePractice("14:00", new String[]{"Max Verstappen", "Pierre Gasly", "Sergio Perez"}, new float[]{81.754F, 81.923F, 82.081F}, 12.6F);

        Qualifying bahrainQuali = new Qualifying("17:00", new String[]{"Max Verstappen", "Sergio Perez", "George Russell"},  new float[]{80.530F, 80.623F, 80.981F},
                new String[]{"Lewis Hamilton", "Carlos Sainz", "Sergio Perez"}, new float[]{81.530F, 81.623F, 81.981F} , new String[]{"Max Verstappen", "George Russell", "Charles Leclerc"}, new float[]{81.0F, 81.108F, 81.181F});

        SundayRace bahrainRace = new SundayRace( "17:30", new String[]{"Max Verstappen", "Lewis Hamilton", "Sergio Perez"}, new float[]{5528.754F, 5531.923F, 5532.081F}, "George Russell", 82.581F);

        bahrainFPOne.writeAverageLaps();
        System.out.println("------------------");
        bahrainQuali.getTopQOne();
        bahrainQuali.getTopQTwo();
        bahrainQuali.writePodium();
        bahrainQuali.getPolesitter();
        System.out.println("-------------------");
        bahrainRace.writeSessionStart();
        bahrainRace.writePodium();
        System.out.println();
        bahrainRace.writeFastestLap();


    }
}
