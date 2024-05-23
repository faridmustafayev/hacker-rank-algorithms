package hackerrankAlgorithms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {
    public static void main(String[] args) {
        System.out.println(sockMerchant(15, Arrays.asList(6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5)));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> numbers = new LinkedHashMap<>();
        int count = 0;

        for (int i = 0; i < ar.size(); i++) {
            int currentNumber = ar.get(i);
            numbers.put(currentNumber, numbers.getOrDefault(currentNumber, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            int sockCount = entry.getValue();
            count += sockCount / 2;
        }

        return count;

    }

}
