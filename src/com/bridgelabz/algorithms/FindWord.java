package com.bridgelabz.algorithms;

import java.util.Arrays;

public class FindWord {

    static int find(String search, String[] findWord, int l, int length) {
        if (length >= l) {
            int mid = l + (length - l) / 2;
            if (findWord[mid] == search) {
                return mid;
            } else if (findWord[mid].compareTo(search) > 0) {
                return find(search, findWord, l, mid - 1);
            } else {
                return find(search, findWord, mid + 1, length);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String findWord[] = {"Ramesh", "Rajesh", "Mohit", "Rohit"};
        String search = "Rohit";

        Arrays.sort(findWord);

        for (String x : findWord) {
            System.out.print(x + " ");
        }

        int i = find(search, findWord, 0, findWord.length - 1);
        if (i == -1) {
            System.out.println("Word is not in the Array");
        } else {
            System.out.println("\nWord found at sorted Array of index : " + (i + 1));
        }

    }
}
