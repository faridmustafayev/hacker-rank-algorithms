package hackerRank;

import java.util.Arrays;
import java.util.List;

public class Pairs {
    public static void main(String[] args) {

        System.out.println(pairs(1, Arrays.asList(1, 2, 3, 4)));

    }
                       // [1, 3], [5, 3], [3, 1], [4, 2], [2, 4]
    public static int pairs(int k, List<Integer> arr) {

        int counter = 0;

        for (int index = 0; index < arr.size(); index++) {

            for (int index2 = 0; index2 < arr.size() ; index2++) {

                if ((arr.get(index) - arr.get(index2)) == k) {

                    counter++;
                    break;

                }


                if ((arr.get(index) == arr.size() - 1) && (arr.get(index2) == arr.size() - 1) && counter ==0) {
                    break;
                }


            }

        }


        return counter;
    }

}
