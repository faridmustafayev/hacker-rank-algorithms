package hackerRank;

import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {
    public static void main(String[] args) {

        System.out.println(breakingRecords(Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)));

    }

    public static List<Integer> breakingRecords(List<Integer> scores) {

        int counter1 = 0;
        int counter2 = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int index = 0; index < scores.size(); index++) {

            if (scores.get(index) > max) {
                max = scores.get(index);
                counter1++;
            }

            if (scores.get(index) < min) {
                min = scores.get(index);
                counter2++;
            }

        }

        return Arrays.asList(counter1 - 1, counter2 - 1);

    }

}