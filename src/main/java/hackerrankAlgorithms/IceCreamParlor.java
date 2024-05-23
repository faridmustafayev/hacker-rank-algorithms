package hackerrankAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class IceCreamParlor {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(6);
        list.add(8);
        System.out.println(iceCreamParlor(8, list));
    }

    public static List<Integer> iceCreamParlor(int m, List<Integer> arr) {
        List<Integer> lastValue = new ArrayList<>();

        label: for (int i = 0; i < arr.size(); i++) {
            for (int j = 1; j < arr.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (m == (arr.get(i) + arr.get(j))) {
                    lastValue.add(i + 1);
                    lastValue.add(j + 1);
                    break label;
                }
            }
        }

        return lastValue;
    }

}
