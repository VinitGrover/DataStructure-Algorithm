package com.bridgelabz.algorithms;

import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        String findWord[] = {"Ramesh", "Rajesh", "Mohit", "Rohit"};

        System.out.println("Enter the word you want to find ");
        String search = new Scanner(System.in).nextLine();
        boolean flag = false;

        for (String found : findWord) {
            if (found.equals(search)) {
                System.out.println(found + " has been found");
                flag = true;
                break;
            }
        }
        if(flag==false)
            System.out.println(search +" not found");
    }
}
