package hackerrankAlgorithms;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    public static void main(String[] args) {
        System.out.println(migratoryBirds(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
    }

    public static int migratoryBirds(List<Integer> arr) {
        int count = 0;

        Map<Integer, Long> map = new HashMap<>();

        int minValue = Integer.MIN_VALUE;

        for (Integer integer : arr) {
            if (minValue < integer) {
                minValue = integer;
            }
        }

        for (int i = 1; i <= minValue; i++) {
            int finalI = i;
            map.put(i, arr.stream()
                    .filter(num -> num == finalI)
                    .count());
        }

        long maxValue = Collections.max(map.values());

        count = map.entrySet().stream()
                .filter(entry -> entry.getValue() == maxValue)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(-1);

        return count;
    }

}
