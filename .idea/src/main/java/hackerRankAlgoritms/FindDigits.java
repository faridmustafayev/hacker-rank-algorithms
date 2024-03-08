package hackerRank;

public class FindDigits {
    public static void main(String[] args) {

        System.out.println(findDigits(1012));

    }

    public static int findDigits(int n) {

        String space = "";
        space += n;

        int counter = 0;

        for (int index = 0; index < space.length(); index++) {

            char c = space.charAt(index);

            String res = Character.toString(c);

            int s = Integer.parseInt(res);

            if (res.contains("0")) {
                continue;
            }

            if (n % s == 0) {
                counter++;
            }

        }

        return counter;

    }

}
