package com.company;

import java.util.ArrayList;

public class Task31 {
    void run(String str) {
        String[] strings = str.split("\n");
        int i = 0;
        for (String string: strings) {
            i+=countPriority(string);
        }
        System.out.println(i);
    }


    int countPriority(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            for (int j = str.length() / 2; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return getPriority(str.charAt(i));
                }
            }
        }
        return 0;
    }


    int getPriority(char ch) {
        int result = 0;
        if (ch > 96) {
            result = ch - 96;
        } else {
            result = ch - 38;
        }
        return result;
    }
}
