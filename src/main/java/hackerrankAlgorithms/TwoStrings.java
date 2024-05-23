package hackerrankAlgorithms;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
    public static void main(String[] args) {

        System.out.println(twoString("and", "art"));

    }

    public static String twoString(String s1, String s2) {
        Set<Character> chars = new HashSet<>();

        for (char c : s1.toCharArray()) {
            chars.add(c);
        }

        for (char c : s2.toCharArray()) {
            if (chars.contains(c)) {
                return "YES";
            }
        }

        return "NO";
    }

}
