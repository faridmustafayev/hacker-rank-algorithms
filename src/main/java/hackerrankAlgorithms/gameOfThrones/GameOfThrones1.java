package hackerrankAlgorithms.gameOfThrones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GameOfThrones1 {
    public static void main(String[] args) {
        System.out.println(gameOfThrones("aaabbbb"));
    }

    public static String gameOfThrones(String s) {
        Map<String, Integer> letters = new HashMap<>();
        String value = null;

        if (s.length() % 2 != 0) {

            for (int i = 0; i < s.length(); i++) {
                value = "" + s.charAt(i);

                if (letters.containsKey(value)) {
                    letters.put(value, letters.get(value) + 1);
                } else {
                    letters.put(value, 1);
                }

            }

        }

        Set<String> strings = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            String k = "" + s.charAt(i);
            strings.add(k);
        }

        List<String> list = new ArrayList<>(strings);

        int count = 0;
        for (int i = 0; i < strings.size(); i++) {

            value = list.get(i);

            if (letters.get(value) % 2 == 0) {
                count++;
            }
        }

        if (letters.size() - 1 == count) {
            return "YES";
        } else {
            return "NO";
        }

    }

}
