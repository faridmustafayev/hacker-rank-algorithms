package hackerrankAlgorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
    public static void main(String[] args) {
        System.out.println(lonelyInteger(List.of(1)));
    }

    public static int lonelyInteger(List<Integer> a) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer integer : a) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }

}
