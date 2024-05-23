package hackerrankAlgorithms;

public class SuperReducedString {
    public static void main(String[] args) {
        System.out.println(superReducedString("baab"));
        System.out.println(superReducedString("aaabccddd"));
    }

    public static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }

        if (sb.length() == 0) {
            return "Empty String";
        }

        return sb.toString();
    }

}
