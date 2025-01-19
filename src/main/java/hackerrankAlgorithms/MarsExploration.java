package hackerrankAlgorithms;

public class MarsExploration {
    public static void main(String[] args) {
        System.out.println(marsExploration("SOSSOSSOS"));
    }

    public static int marsExploration(String s) {
        int count = 0;
        int length = s.length();

        StringBuilder sb = new StringBuilder();
        sb.append("SOS".repeat(length / 3));

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sb.charAt(i)) {
                count++;
            }
        }

        return count;
    }

}
