package hackerRank;

public class CamelCase {
    public static void main(String[] args) {

        System.out.println(camelCase("saveChangesInTheEditor"));

    }

    public static int camelCase(String s) {

        int counter = 1;

        for (int index = 0; index < s.length(); index++) {

            if (s.charAt(index) >= 41 && s.charAt(index) <= 90) {
                counter++;
            }

        }

        return counter;
    }

}
