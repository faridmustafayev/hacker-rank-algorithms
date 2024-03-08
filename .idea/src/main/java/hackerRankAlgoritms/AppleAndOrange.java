package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleAndOrange {
    public static void main(String[] args) {

        countApplesAndOranges(7, 10,4, 12, Arrays.asList(2, 3, -4), Arrays.asList(3, -2, -4));

    }

    public static void countApplesAndOranges(int s, int t, int a, int b,
                                             List<Integer> apples, List<Integer> oranges) {

        List<Integer> listApple = new ArrayList<>();
        List<Integer> listOrange = new ArrayList<>();

        for (int index = 0; index < apples.size(); index++) {
            int change = a;
            change += apples.get(index);
            listApple.add(change);
        }


        for (int index = 0; index < oranges.size(); index++) {
            int change = b;
            change += oranges.get(index);
            listOrange.add(change);
        }

        int count1 = 0;
        int count2 = 0;

        for (int index = s; s <= t; s++) {

            boolean res = listApple.contains(s);
            boolean res2 = listOrange.contains(s);

            if (res) {
                count1++;
            }

            if (res2) {
                count2++;
            }
        }


        System.out.println(count1);
        System.out.println(count2);

    }

}
