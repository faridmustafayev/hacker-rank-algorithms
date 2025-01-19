package hackerrankAlgorithms.alternatingCharacters;

public class AlternatingCharacters2 {
    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AABAAB"));
    }

    public static int alternatingCharacters(String s) {
        int delete = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            char cur = s.charAt(i);
            if (cur == s.charAt(i + 1)) {
                delete++;
            }
        }
        return delete;
    }

}
