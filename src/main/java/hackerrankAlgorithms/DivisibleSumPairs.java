package hackerrankAlgorithms;

import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 3, List.of(1, 3, 2, 6, 1, 2)));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int count = 0;

        if (n == ar.size()) {
            for (int i = 0; i < ar.size(); i++) {
                for (int j = i + 1; j < ar.size(); j++) {
                    if ((ar.get(i) + ar.get(j)) % k == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

}
