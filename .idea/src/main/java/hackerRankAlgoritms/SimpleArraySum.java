package hackerRank;

import java.util.Arrays;
import java.util.List;

public class SimpleArraySum {
    public static void main(String[] args) {

        System.out.println(simpleArraySum(Arrays.asList(1, 2, 3, 4, 10, 11)));

    }

    public static int simpleArraySum(List<Integer> ar) {

        int sum = 0;

        for (int index = 0; index < ar.size(); index++) {
            sum += ar.get(index);
        }

        return sum;
    }

}
