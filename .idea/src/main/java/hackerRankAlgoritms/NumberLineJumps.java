package hackerRank;

public class NumberLineJumps {
    public static void main(String[] args) {

        System.out.println(kangaroo(43, 2, 70, 2));

    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        for (int index = 0; index < Integer.MAX_VALUE; index++) {

            x1 += v1;
            x2 += v2;


            if (x1 == x2) {
                return "YES";
            }
            else if ((x2 >= x1 && v2 >= v1) || (x1 >= x2 && v1 >= v2)) {
                return "NO";
            }

        }

        return null;

    }

}
