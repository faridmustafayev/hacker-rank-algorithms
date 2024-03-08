package hackerRank;

public class SaveThePrisoner {
    public static void main(String[] args) {

        System.out.println(saveThePrisoner(110961316, 653458893, 101526651));

        // 89217647
    }

    public static int saveThePrisoner(int n, int m, int s) {

        int c = 0;

        if ((n - s + 1) >= m) {
            c = s + m - 1;
        }
        else if ((m + 1) % n == 0) {
            int a = n - s + 1;
            int b = m / n;
            b *= n;

            b += a;

            m -= b;

            c = m;
        }
        else {

            int a = n - s + 1;
            int b = m / n - 1;
            b *= n;

            b += a;

            m -= b;

            c = m;

            if (c == 0) {
                c = n;
            }

        }

        return c;

    }

}