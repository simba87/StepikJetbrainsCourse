package com.simba87.task;

import java.util.Scanner;

public class Stepik_1_21_FloorSpaceOfTheRoom {
    static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a, b, c, r, p;
        double s = 0;
        double PI = 3.14;

        String type = scanner.next();

        switch (type) {
            case "triangle":
                a = scanner.nextFloat();
                b = scanner.nextFloat();
                c = scanner.nextFloat();

                p = (a + b + c)/2;
                s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                break;
            case "rectangle":
                a = scanner.nextFloat();
                b = scanner.nextFloat();

                s = a * b;

                break;
            case "circle":
                r = scanner.nextFloat();

                s = PI * r * r;

                break;
        }
        System.out.println(s);
    }
}
