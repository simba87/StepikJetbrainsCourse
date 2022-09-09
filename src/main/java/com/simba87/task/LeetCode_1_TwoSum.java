package com.simba87.task;

import java.util.*;

public class LeetCode_1_TwoSum implements Task {

    @Override
    public List<String> execute() {
        List<String> result = new ArrayList<>();

        result.add(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        result.add(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        result.add(Arrays.toString(twoSum(new int[]{3, 3}, 6)));

        return result;
    }

    @Override
    public List<String> getExpected() {
        return Arrays.asList("[0, 1]", "[1, 2]", "[0, 1]");
    }

    private int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if ((nums[i] + nums[j]) == target) {
                        return new int[] {i, j};
                    }
                }
            }
        }

        return new int[] {-1};
    }

    private int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
