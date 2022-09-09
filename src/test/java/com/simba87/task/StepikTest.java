package com.simba87.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class StepikTest {

    @Test
    @DisplayName("Dummy test")
    void dummyTest() {
        assertEquals(1, 1, "failed");
    }

    @Test
    @DisplayName("1.6 Digital Watches")
    void digitalWatches_1_6_test() {
        Task task = new DigitalWatches_1_6();
        assertTrue(true);
    }

    @Test
    @DisplayName("LeetCode. 1. Two Sum")
    void leetCode_1_TwoSum_test() {
        Task task = new LeetCode_1_TwoSum();
        assertLinesMatch(task.getExpected(), task.execute(), "Results are not as expected");
    }
}
