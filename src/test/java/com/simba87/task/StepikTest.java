package com.simba87.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class StepikTest {

    @Test
    @DisplayName("Dummy test")
    void dummyTest() {
        System.out.println(7/2);
        System.out.println(7%2);
        assertEquals(1, 1, "failed");
    }

    @Test
    @DisplayName("1.6 Digital Watches")
    void digitalWatches_1_6_test() {
        Task task = new Stepik_1_6_DigitalWatches();
        assertTrue(true);
    }

    @Test
    @DisplayName("LeetCode. 1. Two Sum")
    void leetCode_1_TwoSum_test() {
        Task task = new LeetCode_1_TwoSum();
        assertLinesMatch(task.getExpected(), task.execute(), "Results are not as expected");
    }

    @Test
    @DisplayName("LeetCode. 9. Palindrome Number")
    void leetCode_1_PalindromeNumber_test() {
        Task task = new LeetCode_9_PalindromeNumber();
        assertLinesMatch(task.getExpected(), task.execute(), "Results are not as expected");
    }

    @Test
    @DisplayName("LeetCode. 13. Roman to Integer")
    void leetCode_13_RomanToInteger_test() {
        Task task = new LeetCode_13_RomanToInteger();
        assertLinesMatch(task.getExpected(), task.execute(), "Results are not as expected");
    }
}
