package hackerrankAlgorithms;

public class BalancedBrackets {
    public static void main(String[] args) {

        System.out.println(isBalanced("{(([])[])[]}")); // 123, 91, 40, 41, 93, 125

    }

    public static String isBalanced(String s) {

        String result = null;
        int counter = 0;
        int f = s.length() - 1;

        for (int i = 0; i < s.length() / 2; i++) {
            int res1 = s.charAt(i);

            int j = f;
            for (; j >= s.length() / 2; j--) {
                int res2 = s.charAt(j);

                if ((res1 + res2 == 248 && res1 - res2 == -2) || (res1 + res2 == 184 && res1 - res2 == -2) || (res1 + res2 == 81 && res1 - res2 == -1)) {
                    counter++;
                    break;
                }

            }

            f--;


        }

        System.out.println(counter);

        if (counter == s.length() / 2) {
            result = "YES";
        }else {
            result = "NO";
        }


        return result;

    }

}
