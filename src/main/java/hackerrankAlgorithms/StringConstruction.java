package hackerrankAlgorithms;

import java.util.HashSet;
import java.util.Set;

public class StringConstruction {
    public static void main(String[] args) {
        System.out.println(stringConstruction("abab"));
    }

    public static int stringConstruction(String s) {
        Set<String> letters = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            String value = "" + s.charAt(i);
            letters.add(value);
        }

        return letters.size();
    }

}
