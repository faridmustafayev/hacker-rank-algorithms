package hackerrankAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MinimumDistances {
    public static void main(String[] args) {

        System.out.println(minimumDistance(Arrays.asList(7, 1, 3, 4, 1, 7)));

    }

    public static int minimumDistance(List<Integer> a) {

        List<Integer> list = new ArrayList<>();
        int count = Integer.MAX_VALUE;

        for (int counter1 = 0; counter1 < a.size(); counter1++) {
            for (int counter2 = 0; counter2 < a.size(); counter2++) {
                if (Objects.equals(a.get(counter1), a.get(counter2)) && counter1 != counter2) {
                    list.add(Math.abs(counter1 - counter2));
                }
            }
        }

        if (list.isEmpty()) {
            count = -1;
        }

        for (Integer integer : list) {

            if (count > integer) {
                count = integer;
            }

        }

        return count;
    }

}