package hackerRank;

import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) {

        extraLongFactorials(25);

    }

    public static void extraLongFactorials(int n) {

        BigInteger factorial = BigInteger.ONE;

        for (int index = 1; index <= n; index++) {

            factorial = factorial.multiply(BigInteger.valueOf(index));

        }

        System.out.println(factorial);

    }

}