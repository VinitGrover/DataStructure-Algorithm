package com.bridgelabz.algorithms;

class PrimeNumbers {
    public static void main(String[] args) {
        System.out.print("Prime numbers between 0 to 1000 are : ");
        for (int i = 0; i <= 1000; i++) {
            int j = 1, count = 0;
            while (j <= i / 2) {
                if (i % j == 0) {
                    count++;
                    if (count == 2) {
                        break;
                    }
                }
                j++;
            }
            if (count == 1) {
                System.out.print(i + " ");
            }
        }
    }
}