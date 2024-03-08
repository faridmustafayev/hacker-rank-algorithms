package hackerRank;

public class DrawingBook {
    public static void main(String[] args) {

        System.out.println(pageCount(7, 4));

    }

    public static int pageCount(int n, int p) {

        int count = 0;

        if ((n - p) <= (p - 1)) {

            if (n %2 == 0) {

                if ((n - p) % 2 == 0) {
                    count = (n - p) / 2;
                } else {
                    count = (n - p + 1) / 2;
                }
            }
            else {
                if ((n - p) % 2 == 0) {
                    count = (n - p) / 2;
                } else {
                    count = (n - p - 1) / 2;
                }
            }

        }else {

            if (p == 1) {
                count = 0;
            } else if (p == 2 || p == 3) {
                count = 1;
            }else {

                if ((p - 1) %2 == 0) {
                    count = (p - 1) / 2;
                }
                else {
                    count = (p - 1) / 2 + 1;
                }
            }

        }

        return count;


    }

}