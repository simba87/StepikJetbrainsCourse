package com.simba87.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeRunLargestProductThreeNumbers implements Task{
    @Override
    public List<String> execute() {
        List<String> result = new ArrayList<>();
//        result.add(Arrays.toString(getLargestProductThreeNumbers(Arrays.stream("3 5 1 7 9 0 9 -3 10".split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray()))
//                .replace(",", "")
//                .replace("[", "")
//                .replace("]", ""));
//
//        result.add(Arrays.toString(getLargestProductThreeNumbers(Arrays.stream("-5 -30000 -12".split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray()))
//                .replace(",", "")
//                .replace("[", "")
//                .replace("]", ""));
//
//        result.add(Arrays.toString(getLargestProductThreeNumbers(Arrays.stream("1 2 3".split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray()))
//                .replace(",", "")
//                .replace("[", "")
//                .replace("]", ""));
//
//        result.add(Arrays.toString(getLargestProductThreeNumbers(Arrays.stream("-1000000 1 2 3 1000000 1000000".split(" "))
//                        .mapToInt(Integer::parseInt)
//                        .toArray()))
//                .replace(",", "")
//                .replace("[", "")
//                .replace("]", ""));

        result.add(Arrays.toString(getLargestProductThreeNumbers(Arrays.stream("-1000000 -1000000 1 2 3 1000000".split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray()))
                .replace(",", "")
                .replace("[", "")
                .replace("]", ""));

        return result;
    }

    @Override
    public List<String> getExpected() {
        return List.of("10 9 9", "-5 -12 -30000", "3 2 1");
    }

    private int[] getLargestProductThreeNumbers(int[] numbers) {
        Arrays.parallelSort(numbers);
        System.out.println(Arrays.toString(numbers));

        if (numbers.length == 3 || (numbers[0] < 0 && numbers[1] > 0) || (numbers[0] > 0 && numbers[1] > 0)) {
            return new int[] {numbers[numbers.length - 1], numbers[numbers.length - 2], numbers[numbers.length - 3]};
        } else {
            long subProductOne = numbers[numbers.length - 2] * numbers[numbers.length - 3];
            long subProductTwo = (long) numbers[0] * (long) numbers[1];

            System.out.printf("One: %d\n", subProductOne);
            System.out.printf("Two: %d\n", subProductTwo);

            if (subProductOne > subProductTwo) {
                return new int[] {numbers[numbers.length - 1], numbers[numbers.length - 2], numbers[numbers.length - 3]};
            } else {
                return new int[] {numbers[numbers.length - 1], numbers[0], numbers[1]};
            }
        }
    }
}
