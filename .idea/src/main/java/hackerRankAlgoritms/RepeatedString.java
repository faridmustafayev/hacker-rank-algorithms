package hackerRank;

public class RepeatedString {
    public static void main(String[] args) {

        System.out.println(repeatedString("a", 1000000000000L));

    }

    public static long repeatedString(String s, long n) {

        int counter = 0;

        for (int index = 0; index < n; index++) {

            String value = s;

            s = s.concat(value);

            if (s.length() == n) {
                break;
            }

        }

        s = s.substring(0, 10);

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == 'a') {
                counter++;
            }
        }

        return counter;
    }

}
