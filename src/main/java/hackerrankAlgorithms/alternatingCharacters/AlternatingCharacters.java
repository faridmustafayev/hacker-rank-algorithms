package hackerrankAlgorithms.alternatingCharacters;

public class AlternatingCharacters {
    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAABBB"));
    }

    public static int alternatingCharacters(String s) {
        int count = 0;
        int value = 1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = value++; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && Math.abs(i - j) == 1) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

}
