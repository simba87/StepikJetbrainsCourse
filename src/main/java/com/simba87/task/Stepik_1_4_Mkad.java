package com.simba87.task;

import java.util.Scanner;

public class Stepik_1_4_Mkad {
    private static final int MKAD_LENGTH = 109;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = scanner.nextInt();
        int t = scanner.nextInt();

        int mark = (v * t) % MKAD_LENGTH;

        if (mark < 0) {
            mark = (mark + MKAD_LENGTH) % MKAD_LENGTH;
        }

        System.out.println(mark);
    }
}
