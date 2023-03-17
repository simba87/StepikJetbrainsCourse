package com.simba87.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_13_RomanToInteger implements Task {
    @Override
    public List<String> execute() {
        List<String> result = new ArrayList<>();

        result.add(String.valueOf(romanToInt("III")));
        result.add(String.valueOf(romanToInt("LVIII")));
        result.add(String.valueOf(romanToInt("MCMXCIV")));

        return result;
    }

    @Override
    public List<String> getExpected() {
        return Arrays.asList("3", "58", "1994");
    }

    private int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    try {
                        if (s.charAt(i + 1) == 'V') {
                            result += 4;
                            i++;
                        } else if (s.charAt(i + 1) == 'X') {
                            result += 9;
                            i++;
                        } else {
                            result += 1;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        result += 1;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    try {
                        if (s.charAt(i + 1) == 'L') {
                            result += 40;
                            i++;
                        } else if (s.charAt(i + 1) == 'C') {
                            result += 90;
                            i++;
                        } else {
                            result += 10;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        result += 10;
                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    try {
                        if (s.charAt(i + 1) == 'D') {
                            result += 400;
                            i++;
                        } else if (s.charAt(i + 1) == 'M') {
                            result += 900;
                            i++;
                        } else {
                            result += 100;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        result += 100;
                    }
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + s.charAt(i));
            }
        }

        return result;
    }

}
