package com.codedifferently.lab.partA;

public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
        int eggs = 100;
        eggs = eggs + 121;
        eggs = eggs + 117;

        double dailyAverage = eggs / 3.0;
        double monthlyAverage = dailyAverage * 30.0;
        double monthlyProfit = monthlyAverage * 0.18;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
}
