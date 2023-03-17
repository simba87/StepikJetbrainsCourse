package com.simba87.task;

import java.util.*;

public class Stepik_3_112_QueuesAndStacksDifferentOperations {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));
        queue.addLast(5);
        queue.removeFirst();
        queue.removeFirst();
        System.out.println(queue);
    }
}
