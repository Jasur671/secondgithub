package org.example.problem1;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) throws Exception {
        Long[] numbers = {1l, 2l, 3l, 4l, 5l};

        Arrays.sort(numbers);
        Long minsum = numbers[0] + numbers[1] + numbers[2] + numbers[3];
        Long maxsum = numbers[1] + numbers[2] + numbers[3] + numbers[4];
        StringBuilder sum = new StringBuilder();
        sum.append(minsum);
        sum.append(" ");
        sum.append(maxsum);
        String result = sum.toString();
        System.out.println(result);
    }
}
