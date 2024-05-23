package hackerrankAlgorithms;

public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    public static int countingValleys(int steps, String path) {
        int start = 0, curr = 0;
        int lastResult = 0;

        for (int i = 0; i < path.length(); i++) {

            if (path.charAt(i) == 'D') {
                curr = start - 1;
            } else {
                curr = start + 1;
            }

            if (start >= 0 && curr < 0) {
                lastResult++;
            }
            start = curr;
        }
        return lastResult;
    }
}
