package hackerrankAlgorithms.gameOfThrones;

public class GameOfThrones2 {
    public static void main(String[] args) {
        System.out.println(gameOfThrones("cdcdcdcdeeeef"));
    }

    public static String gameOfThrones(String s) {
        int[] array = new int[26];
        for (char c : s.toCharArray()) {
            array[c - 'a']++;
        }
        int oddCounter = 0;

        for (int occurrence : array) {
            if (occurrence % 2 == 1) oddCounter++;
        }
        return oddCounter > 1 ? "NO" : "YES";
    }

}
