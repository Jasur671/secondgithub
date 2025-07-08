package org.example;

import java.util.Arrays;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        int minsum = numbers[0] + numbers[1] + numbers[2] + numbers[3];
        int maxsum = numbers[1] + numbers[2] + numbers[3] + numbers[4];
        System.out.println(minsum + " " + maxsum);
    }
}
