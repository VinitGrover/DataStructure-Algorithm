package com.bridgelabz.algorithms;

import java.util.ArrayList;

class PrimeNumberPalindrome {
    public static void main(String[] args) {
        System.out.print("Prime numbers between 0 to 1000 are : ");
        int k = 0;
        ArrayList arr = new ArrayList();
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
                arr.add(k, i);
                //   System.out.print(i + " ");
                k++;
            }
        }
        for (Object x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.size(); i++) {

            int value = (Integer) arr.get(i);
            int number = 0, remain = 0, temp = value;

            while (temp > 0) {
                remain = temp % 10;
                temp = temp / 10;
                number = number * 10 + remain;
            }
            if (number == value) {
                if(number != 929) {
                    System.out.print(value + " is a palindrome, ");
                }else{
                    System.out.print(value + " is a palindrome.");
                }
            }
        }
    }
}