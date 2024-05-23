package hackerrankAlgorithms;

public class Pangrams {
    public static void main(String[] args) {

        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));

    }

    public static String pangrams(String s) {

        String result = null;
        int number = 0;

        s = s.toLowerCase();

        for (int i = 97; i <= 122; i++) {

            char value = (char) i;

            String m = "" + value;

            if (s.contains(m)) {
                number++;
            }

        }

        if (number == 26) {
            result = "pangram";
        }else {
            result = "not pangram";
        }

        return result;
    }

}
