package hackerrankAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MissingNumbers {
    public static void main(String[] args) {
        Integer[] arr = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
        Integer[] brr = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};

        List<Integer> list = Arrays.asList(arr);
        List<Integer> list1 = Arrays.asList(brr);

        List<Integer> def = new ArrayList<>(list);
        List<Integer> def1 = new ArrayList<>(list1);
        System.out.println(missingNumbers(def, def1));
    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Map<Integer, Integer> freqArr = new HashMap<>();
        Map<Integer, Integer> freqBrr = new HashMap<>();

        for (Integer num : arr) {
            freqArr.put(num, freqArr.getOrDefault(num, 0) + 1);
        }

        for (Integer num : brr) {
            freqBrr.put(num, freqBrr.getOrDefault(num, 0) + 1);
        }

        List<Integer> missingNumbers = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : freqBrr.entrySet()) {
            int num = entry.getKey();
            int countBrr = entry.getValue();
            int countArr = freqArr.getOrDefault(num, 0);

            if (countBrr > countArr) {
                missingNumbers.add(num);
            }
        }

        Set<Integer> uniqueMissing = new HashSet<>(missingNumbers);
        List<Integer> result = new ArrayList<>(uniqueMissing);
        Collections.sort(result);

        return result;
    }

}
