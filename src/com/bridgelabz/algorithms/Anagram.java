package com.bridgelabz.algorithms;

class Anagram {
    public static void main(String[] args) {
        String a1 = "earth";
        String a2 = "heart3";

        char ch1[] = a1.toCharArray();
        char ch2[] = a2.toCharArray();
        boolean flag = true;


        if (ch1.length != ch2.length) {
            flag = false;
        }

        if (flag) {
            for (int i = 0; i < ch1.length; i++) {
                int count = 0;
                for (int j = 0; j < ch1.length; j++) {
                    if (ch1[i] == ch1[j]) {
                        count++;
                    }
                }
                int keep = 0;
                for (int k = 0; k < ch1.length; k++) {
                    if (ch1[i] == ch2[k]) {
                        keep++;
                    }
                }
                if (count != keep) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}