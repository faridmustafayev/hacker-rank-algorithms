package hackerrankAlgorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualizeTheArray {
    public static void main(String[] args) {
        System.out.println(equalizeArray(List.of(
                51, 51, 51, 51, 51, 51, 51, 51, 51, 51,
                51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51
        )));
    }

    public static int equalizeArray(List<Integer> arr) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (Integer integer : arr) {
            numbers.put(integer, numbers.getOrDefault(integer, 0) + 1);
        }

        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> map : numbers.entrySet()) {
            if (maxValue < map.getValue()) {
                maxValue = map.getValue();
            }
        }

        return arr.size() - maxValue;
    }

}
