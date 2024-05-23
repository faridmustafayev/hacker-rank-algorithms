package hackerrankAlgorithms;

import java.util.List;

public class BetweenTwoSets {
    public static void main(String[] args) {
        System.out.println(getTotalX(List.of(2, 4), List.of(16, 32, 96)));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count = 0;

        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        for (Integer integer : a) {
            if (minValue < integer) {
                minValue = integer;
            }
        }

        for (Integer integer : b) {
            if (maxValue > integer) {
                maxValue = integer;
            }
        }

        for (int i = minValue; i <= maxValue; i += minValue) {
            boolean divisibleByAllA = true;
            boolean dividesAllB = true;

            for (int num : a) {
                if (i % num != 0) {
                    divisibleByAllA = false;
                    break;
                }
            }

            if (divisibleByAllA) {
                for (int num : b) {
                    if (num % i != 0) {
                        dividesAllB = false;
                        break;
                    }
                }
            }

            if (divisibleByAllA && dividesAllB) {
                count++;
            }
        }

        return count;
    }

}
