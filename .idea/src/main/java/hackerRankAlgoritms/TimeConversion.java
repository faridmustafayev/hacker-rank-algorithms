package hackerRank;

public class TimeConversion {
    public static void main(String[] args) {

        System.out.println(timeConversion("12:45:54PM"));

    }

    public static String timeConversion(String s) {

        String substringBefore = s.substring(0, 2);
        Integer value = Integer.valueOf(substringBefore);
        String substringAfter = s.substring(2, 8);

        if (s.endsWith("PM")) {

            if (value == 12) {
                return s.substring(0, 8);
            }
            else {
                value += 12;

                s = value + substringAfter;
            }

        } else if (s.endsWith("AM")) {

            if (value == 12) {
                value -= 12;

                s = value + "0" + substringAfter;
            }
            else {
                return s.substring(0, 8);
            }

        }

        return s;

    }

}