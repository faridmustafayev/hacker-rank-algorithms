package hackerRank;

import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {

        miniMaxSum(Arrays.asList(1, 2, 3, 4, 5));

    }

    public static void miniMaxSum(List<Integer> arr) {

        long total = 0;
        long biggest = Long.MIN_VALUE;
        long smallest = Long.MAX_VALUE;

        for (int index = 0; index < arr.size(); index++) {
            total += arr.get(index);

            if (arr.get(index) > biggest) {
                biggest = arr.get(index);
            }

            if (arr.get(index) < smallest) {
                smallest = arr.get(index);
            }
        }

        System.out.println((total - biggest) + " " + (total - smallest));

    }

}
