package hackerRank;

public class twoStrings {
    public static void main(String[] args) {

        System.out.println(twoString("aardvark", "apple"));

    }

    public static String twoString(String s1, String s2) {

        String s = null;

        label: for (int index = 0; index < s1.length() ; index++) {

            char res = s1.charAt(index);

            for (int index2 = 0; index2 < s2.length(); index2++) {

                char res2 = s2.charAt(index2);

                if (res == res2) {
                    s = "YES";
                    break label;
                }else {
                    s = "NO";
                }

            }
        }

        return s;

    }

}