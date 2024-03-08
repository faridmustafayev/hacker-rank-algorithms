package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class ElectronicsShop {
    public static void main(String[] args) {

        System.out.println(getMoneySpent(new int[]{40, 50, 60}, new int[]{5, 8, 12}, 60));

    }

    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int value = 0;

        if (keyboards.length >= drives.length) {

            List<Integer> numbers = new ArrayList<>();
            int min = Integer.MIN_VALUE;

            for (int i = 0; i < keyboards.length; i++) {
                for (int j = 0; j < drives.length; j++) {

                    int num = (keyboards[i] + drives[j]);

                    if (num < b) {
                        numbers.add(num);
                    }

                    if (num > b) {
                        value = -1;
                    }

                }

            }


            for (int i = 0; i < numbers.size(); i++) {

                value = numbers.get(i);

                if (value > min) {

                    min = value;

                }
            }
        }else {

            List<Integer> numbers = new ArrayList<>();
            int min = Integer.MIN_VALUE;

            for (int i = 0; i < drives.length; i++) {
                for (int j = 0; j < keyboards.length; j++) {

                    int num = (drives[i] + keyboards[j]);

                    if (num < b) {
                        numbers.add(num);
                    }

                    if (num > b) {
                        value = -1;
                    }

                }

            }


            for (int i = 0; i < numbers.size(); i++) {

                value = numbers.get(i);

                if (value > min) {

                    min = value;

                }
            }

        }

        return value;
    }

}