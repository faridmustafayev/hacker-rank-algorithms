package hackerrankAlgorithms;

public class HackerRankInString {
    public static void main(String[] args) {
        System.out.println(hackerrankInString("hhaacckkekraraannk"));
    }

    public static String hackerrankInString(String s) {
        String word = "hackerrank";
        int current = 0;

        for (int i = 0; i < s.length(); i++) {
            if (current < word.length() && s.charAt(i) == word.charAt(current)) {
                current++;
            }
        }
        if (current == word.length()) {
            return "YES";
        } else {
            return "NO";
        }
    }

}
