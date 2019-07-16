/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simba87.task;

import java.util.Arrays;

/**
 *
 * @author simba87
 */
public class TheMaximumPairwiseProduct_1_120 {
    public static void main(String[] args) {
        System.out.println("Task: 1.120 The maximum pairwise product");
        
        int[] array = {100000, 90000, 2};
        Arrays.parallelSort(array);
        
        System.out.println((long)array[array.length - 1] * (long)array[array.length - 2]);
    }
}
