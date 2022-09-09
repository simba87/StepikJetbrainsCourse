package com.simba87.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_9_PalindromeNumber implements Task {

    @Override
    public List<String> execute() {
        List<String> result = new ArrayList<>();

        result.add(String.valueOf(isPalindrome(121)));
        result.add(String.valueOf(isPalindrome(-121)));
        result.add(String.valueOf(isPalindrome(10)));

        return result;
    }

    @Override
    public List<String> getExpected() {
        return Arrays.asList("true", "false", "false");
    }

    private boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x == 0) {
            return true;
        }


        int y = 0;
        int counter = x;
        while (counter != 0) {
            int a = counter%10;
            counter = counter/10;
            y = y * 10;
            y = y + a;
        }

        return (x == y);
    }

    private boolean isPalindrome2(int x) {
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also, if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palindrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber/10;
    }
}
