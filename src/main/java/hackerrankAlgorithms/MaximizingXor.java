package hackerrankAlgorithms;

public class MaximizingXor {
    public static void main(String[] args) {

        System.out.println(maximizingXor(11, 100));

    }

    public static int maximizingXor(int l, int r) {

        int min = -1;

        for (int i = l; i <= r; i++) {
            for (int j = l; j <= r; j++) {

                int a = i ^ j;

                if (a > min) {
                    min = a;
                }

            }
        }

        return min;

    }

}