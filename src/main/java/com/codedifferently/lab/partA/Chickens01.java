package com.codedifferently.lab.partA;

public class Chickens01 {
    //Put your code here
    public static void main(String[] args){

        int eggsPerChicken = 5;
        int chickenCount = 3;
        int totalEggs = eggsPerChicken * chickenCount;

        chickenCount++;
        totalEggs = totalEggs + (chickenCount * eggsPerChicken);

        chickenCount = chickenCount / 2;
        totalEggs = totalEggs + (chickenCount * eggsPerChicken);

        System.out.println(totalEggs);

        int eggsPerChicken1 = 4;
        int chickenCount1 = 8;
        int totalEggs1 = eggsPerChicken1 * chickenCount1;

        chickenCount1++;
        totalEggs1 = totalEggs1 + (chickenCount1 * eggsPerChicken1);

        chickenCount1 = chickenCount1 / 2;
        totalEggs1 = totalEggs1 + (chickenCount1 * eggsPerChicken1);

        System.out.println(totalEggs1);
    }
    //System.out.println(totalEggs);
}
