package hackerRank;

import java.util.Arrays;
import java.util.List;

public class NonDivisibleSubset {
    public static void main(String[] args) {

        System.out.println(nonDivisibleSubset(3, Arrays.asList(1, 7, 2, 4)));

    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {

        int count = 0;
        int res = 1;

        for (int counter = 0; counter < s.size(); counter++) {
            for (int counter2 = res; counter2 < s.size(); counter2++) {

                if (s.get(counter) + s.get(counter2) %3 == 0) {
                    count++;
                }

            }
            res++;
        }

        return count;
    }

}