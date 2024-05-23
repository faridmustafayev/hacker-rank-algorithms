package hackerrankAlgorithms;

import java.util.LinkedList;
import java.util.List;

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
    }

    public static int beautifulDays(int i, int j, int k) {
        int count = 0;

        List<Integer> numbers = new LinkedList<>();

        for (int l = i; l <= j; l++) {
            numbers.add(l);
        }


        for (Integer number : numbers) {
            StringBuilder sb = new StringBuilder();

            StringBuilder append = sb.append(number);
            StringBuilder reverse = append.reverse();
            int i2 = Integer.parseInt(String.valueOf(reverse));

            if ((number - i2) % k == 0) {
                count++;
            }
        }

        return count;
    }

}
