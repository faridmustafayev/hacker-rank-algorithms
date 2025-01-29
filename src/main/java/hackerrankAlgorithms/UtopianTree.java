package hackerrankAlgorithms;

public class UtopianTree {
    public static void main(String[] args) {
        System.out.println(utopianTree(9));
    }

    public static int utopianTree(int n) {
        int value = n;

        if (n == 0) {
            value = 1;
        }

        if (n % 2 == 0) {
            value = (value / 2) + 1;
            value = (int) Math.pow(2, value) - 1;
        } else {
            n = n / 2;
            value = value - n + 1;
            value = (int) Math.pow(2, value) - 2;
        }

        return value;
    }

}
