package hackerRank;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {

        System.out.println(birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2));

    }

    public static int birthday(List<Integer> s, int d, int m) {

        int count = 1;
        int counter = 0;

        for (int index = 0; index < s.size(); index++) {

            if (s.get(index) + s.get(count) == d) {
                counter++;
            }
            
            count++;

            if (count == s.size()) {
                break;
            }

        }

        return counter;

    }

}
