package com.tree;

import java.util.Random;
import java.util.Scanner;

public class TreeBuilder {
    private static int treeHeight;
    private static int ballsChance;
    private static boolean hasChristmasBalls;

    public static void getInfo(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("First, I need to know height of your tree(integer): ");
        do {
            try {
                String height = userInput.nextLine();
                TreeBuilder.setTreeHeight(Integer.parseInt(height));
                break;
            } catch (Exception e) {
                System.out.print("Please input an integer: ");
            }

        } while (true);

        System.out.print("Do you want some christmas balls?(true/false): ");
        do {
            String input = userInput.nextLine();
            if ("true".equalsIgnoreCase(input) || "false".equalsIgnoreCase(input)) {
                TreeBuilder.setHasChristmasBalls(Boolean.parseBoolean(input.toLowerCase()));
                break;
            } else {
                System.out.println("Please input 'true' or 'false': ");
            }
        } while (true);
        if (TreeBuilder.isHasChristmasBalls()) {
            System.out.print("How frequent balls (1/n chances) do you want: ");
            do {
                try {
                    String balls = userInput.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.print("Please input an integer: ");
                }

            } while (true);
        }
    }

    private static void branches() {
        for (int i = 1; i < treeHeight + 1; i++) {
            for (int j = 0; j < (treeHeight - i); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (i * 2) - 1; j++) {
                if(hasChristmasBalls){
                    Random balls=new Random();
                    if(balls.nextInt(ballsChance+1)==0){
                        System.out.print("o");
                    }else{
                        System.out.print("*");
                    }

                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    private static void trunk() {
        int treeBaseWidth = (treeHeight * 2) - 1;
        int trunkWidth;
        int trunkHeight;
        if (treeBaseWidth != 0 && treeBaseWidth != 1 && treeBaseWidth != 3) {
            if ((treeBaseWidth / 3) % 2 == 0) {
                trunkWidth = (treeBaseWidth / 3) + 1;
            } else {
                trunkWidth = treeBaseWidth / 3;
            }

            if (trunkWidth % 4 == 3) {
                trunkHeight = (trunkWidth / 4) + 1;
            } else {
                trunkHeight = trunkWidth / 4;
            }
            for (int i = 0; i < trunkHeight; i++) {
                for (int j = 0; j < (treeBaseWidth - trunkWidth) / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < trunkWidth; j++) {
                    System.out.print("|");
                }
                System.out.println();
            }
        }
    }
    public static void growTree(){
        branches();
        trunk();
    }

    public static void setTreeHeight(int treeHeight) {
        TreeBuilder.treeHeight = treeHeight;
    }

    public static void setHasChristmasBalls(boolean hasChristmasBalls) {
        TreeBuilder.hasChristmasBalls = hasChristmasBalls;
    }

    public static boolean isHasChristmasBalls() {
        return hasChristmasBalls;
    }

    public static void setBallsChance(int ballsChance) {
        TreeBuilder.ballsChance = ballsChance;
    }
}
