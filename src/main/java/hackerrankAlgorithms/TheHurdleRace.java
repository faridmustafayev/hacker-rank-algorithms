package hackerrankAlgorithms;

import java.util.List;

public class TheHurdleRace {
    public static void main(String[] args) {
        System.out.println(hurdleRace(7, List.of(2, 5, 4, 5, 2)));
    }

    public static int hurdleRace(int k, List<Integer> height) {
        int minValue = Integer.MIN_VALUE;

        for (Integer integer : height) {
            if (minValue < integer) {
                minValue = integer;
            }
        }

        if (k < minValue) {
            minValue -= k;
        } else {
            minValue = 0;
        }

        return minValue;
    }

}
