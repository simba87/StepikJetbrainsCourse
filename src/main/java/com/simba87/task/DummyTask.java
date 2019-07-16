/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simba87.task;

import java.util.Scanner;
/**
 *
 * @author simba87
 */
public class DummyTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("Dummy task");
        System.out.println("Most of tasks are verified with stdin. Use java.util.Scanner. Your input: " + input);
    }
}
