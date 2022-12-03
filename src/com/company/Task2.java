package com.company;

import java.util.HashMap;

public class Task2 {
    void task1(String str) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("A X", 4);
        hashMap.put("A Y", 8);
        hashMap.put("A Z", 3);
        hashMap.put("B X", 1);
        hashMap.put("B Y", 5);
        hashMap.put("B Z", 9);
        hashMap.put("C X", 7);
        hashMap.put("C Y", 2);
        hashMap.put("C Z", 6);
        int sum = 0;
        for (int i = 0; i < str.length()-1; i+=4) {
            String input = "" + str.charAt(i) + " " + str.charAt(i+2);
            sum+=hashMap.get(input);
        }
        System.out.println(sum);
    }

    void task2(String str) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("A X", 3);
        hashMap.put("A Y", 4);
        hashMap.put("A Z", 8);
        hashMap.put("B X", 1);
        hashMap.put("B Y", 5);
        hashMap.put("B Z", 9);
        hashMap.put("C X", 2);
        hashMap.put("C Y", 6);
        hashMap.put("C Z", 7);
        int sum = 0;
        for (int i = 0; i < str.length()-1; i+=4) {
            String input = "" + str.charAt(i) + " " + str.charAt(i+2);
            sum+=hashMap.get(input);
        }
        System.out.println(sum);
    }

}
