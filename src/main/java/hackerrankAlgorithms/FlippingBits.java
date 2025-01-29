package hackerrankAlgorithms;

public class FlippingBits {
    public static void main(String[] args) {
        System.out.println(flippingBits(9));
    }

    public static long flippingBits(long n) {
        int[] binary = new int[32];
        int count = 0;
        int idx = 31;

        while (count < 32) {

            binary[idx--] = (int) (n % 2);
            n = n / 2;
            count++;

        }

        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == 0) {
                binary[i] = 1;
            } else {
                binary[i] = 0;
            }
        }
        long flifResult = 0;
        int p = 0;
        for (int i = 31; i >= 0; i--) {
            flifResult += binary[i] * Math.pow(2, p++);
        }

        return flifResult;
    }

}
