package com.bridgelabz.algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        String[] arr = {"e", "a", "c", "z", "h"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (String x : arr) {
            System.out.print(x + " ");
        }
    }
}
