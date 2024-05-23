package hackerrankAlgorithms;

public class XorStrings {
    public static void main(String[] args) {

        System.out.println(stringsXOR("10101", "00101"));
    }

    public static String stringsXOR(String s, String t) {

        String result = "";

        for (int index = 0; index < s.length(); index++) {

            if (s.charAt(index) == t.charAt(index)) {
                result += "0";
            } else {
                result += "1";
            }
        }

        return result;

    }

    protected final int wed = 3;

}
