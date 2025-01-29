package hackerrankAlgorithms;

public class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        kaprekarNumbers(300, 400);
    }

    public static void kaprekarNumbers(int p, int q) {
        int value;

        boolean flag = false;

        for (int i = p; p <= q; p++) {
            value = p * p;

            String fek = "" + value;
            String def = "" + p;

            int last = fek.length() - def.length();

            String left = fek.substring(0, last);
            String right = fek.substring(last);
            if (p == 1) {
                System.out.print(p + " ");
                flag = true;
            }

            if (p > 3) {
                int i1 = Integer.parseInt(left);
                int i2 = Integer.parseInt(right);

                if ((i1 + i2) == p) {
                    System.out.print(p + " ");
                    flag = true;
                }
            }

        }

        if (!flag) {
            System.out.println("INVALID RANGE");
        }

    }

}
