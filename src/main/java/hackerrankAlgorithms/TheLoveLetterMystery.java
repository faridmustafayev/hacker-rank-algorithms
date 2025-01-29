package hackerrankAlgorithms;

public class TheLoveLetterMystery {
    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("abc"));
    }

    public static int theLoveLetterMystery(String s) {
        int n = s.length();
        int totalOps = 0;

        for (int i = 0; i < n / 2; i++) {
            totalOps += Math.abs(s.charAt(i) - s.charAt(n - 1 - i));
        }

        return totalOps;
    }

}
