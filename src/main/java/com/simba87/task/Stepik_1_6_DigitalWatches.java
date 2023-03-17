package com.simba87.task;

import java.util.Scanner;

public class Stepik_1_6_DigitalWatches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secondFromBeginningOfTheDay = scanner.nextInt();
        int hours = (secondFromBeginningOfTheDay / 3600) % 24;
        int minutes = (secondFromBeginningOfTheDay / 60 - hours * 60) % 60;
        int seconds = (secondFromBeginningOfTheDay - hours * 3600 - minutes * 60) % 60;

        System.out.println(String.format("%d:%02d:%02d", hours, minutes, seconds));

    }
}
