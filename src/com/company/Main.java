package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("start");
        int[] test1 = {1,5,4,3,2};
        double[] test2 = {1.0,5.0,4.0,3.0,2.0};
        String[] test3 = {"d","b","a","c"};
        InPlaceSorts.insertionSort(test1);
        InPlaceSorts.selctionSort(test2);
        InPlaceSorts.bubbleSort(test3);
    }
}
