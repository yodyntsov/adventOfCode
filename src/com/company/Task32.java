package com.company;

public class Task32 {

    void run(String str) {
        int sum = 0;
        String[] strings = str.split("\n");
        for (int i = 0; i < strings.length; i += 3) {
            sum += getPriority(searchCommon(strings[i], strings[i + 1], strings[i + 2]));
        }
        System.out.println(sum);
    }

    char searchCommon(String string, String string1, String string2) {
        for (char i = 'A'; i <= 'z'; i++) {
            if (string.contains(Character.toString(i)) && string1.contains(Character.toString(i)) &&
                    string2.contains(Character.toString(i))) {
                return i;
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
