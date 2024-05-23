package hackerrankAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CutTheSticks {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(cutTheSticks(new ArrayList<>(list)));
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> results = new ArrayList<>();

        Collections.sort(arr);

        results.add(arr.size());

        for (int i = 1; i < arr.size(); i++) {
            if (!Objects.equals(arr.get(i), arr.get(i - 1))) {
                results.add(arr.size() - i);
            }
        }

        return results;
    }

}
