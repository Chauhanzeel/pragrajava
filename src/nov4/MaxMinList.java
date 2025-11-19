package nov4;

import java.util.ArrayList;
import java.util.List;

public class MaxMinList {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(30);
            numbers.add(5);
            numbers.add(10);

            int max = numbers.get(0);
            int min = numbers.get(0);

            for (int i = 1; i < numbers.size(); i++) {
                int num = numbers.get(i);

                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }

            System.out.println("Maximum number: " + max);
            System.out.println("Minimum number: " + min);
        }
    }
