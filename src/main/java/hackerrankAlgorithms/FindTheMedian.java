package hackerrankAlgorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheMedian {
    public static void main(String[] args) {

        System.out.println(findMedian(Arrays.asList(5, 3, 1, 2, 4)));

    }

    public static int findMedian(List<Integer> arr) {

        Collections.sort(arr);

        return arr.get(arr.size() / 2);

    }

}
