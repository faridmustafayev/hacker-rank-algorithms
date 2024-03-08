package hackerRank;

import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {

        System.out.println(birthdayCakeCandles(Arrays.asList(44, 53, 31, 27, 77, 60, 66, 77, 26, 36)));

    }

    public static int birthdayCakeCandles(List<Integer> candles) {

        int random = -1;
        int count = 1;

        for (int index = 0; index < candles.size(); index++) {

            if (candles.get(index) > random) {

                random = candles.get(index);

            }
            else if (candles.get(index) == random) {
                count++;
            }

        }

        return count;
    }

}