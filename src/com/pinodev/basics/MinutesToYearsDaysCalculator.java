package com.pinodev.basics;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes<0){
            System.out.println("Invalid Value");
        }else
        {
            int year= (int)minutes/525600;
            int remainder=(int)minutes%525600;
            int days=remainder/1440;

            System.out.println(minutes+" min = "+year+" y and "+days+" d");
        }
    }
}