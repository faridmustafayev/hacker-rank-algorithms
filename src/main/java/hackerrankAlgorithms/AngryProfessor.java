package hackerrankAlgorithms;

import java.util.List;

public class AngryProfessor {
    public static void main(String[] args) {
        System.out.println(angryProfessor(3, List.of(-1, -3, 4, 2)));
    }

    public static String angryProfessor(int k, List<Integer> a) {
        String value = null;
        int count = 0;

        for (Integer integer : a) {
            if (integer <= 0) {
                count++;
            }
        }

        if (count >= k) {
            value = "NO";
        }else {
            value = "YES";
        }

        return value;
    }

}
