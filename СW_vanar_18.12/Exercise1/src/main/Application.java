package main;

import arrays.IntegerArrayExample;
import arrays.WeatherArrayExampleChisinauCity;

public class Application {
    public static void main(String[] args) {
        IntegerArrayExample.printData();
        System.out.println();
        IntegerArrayExample.reverseprintData();
        System.out.println();
        System.out.println("Array sum = " + IntegerArrayExample.sum());
        System.out.println();
        int[] newArray = IntegerArrayExample.scanArray();
        System.out.println();
       IntegerArrayExample.printData(newArray);
        System.out.println();
        WeatherArrayExampleChisinauCity.printPositiveValues();
        System.out.println();
        WeatherArrayExampleChisinauCity.printNegativeValues();
    }
}
