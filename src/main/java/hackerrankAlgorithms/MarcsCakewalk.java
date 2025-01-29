package hackerrankAlgorithms;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MarcsCakewalk {
    public static void main(String[] args) {
        System.out.println(marcsCakewalk(List.of(819, 701, 578, 403, 50, 400, 983, 665, 510, 523, 696, 532, 51, 449, 333,
                234, 958, 460, 277, 347, 950, 53, 123, 227, 646, 190, 938, 61, 409, 110, 61, 178, 659,
                989, 625, 237, 944, 550, 954, 439)));
    }

    public static long marcsCakewalk(List<Integer> calorie) {
        long sum = 0;

        List<Integer> collect = calorie.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for (int i = 0; i < calorie.size(); i++) {
            double pow = Math.pow(2, i);
            Integer value = collect.get(i);

            sum += (pow * value);
        }

        return sum;
    }

}
