package hackerrankAlgorithms;

public class StrongPassword2 {

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int count = 0;
        boolean digit = false;
        boolean lower = false;
        boolean upper = false;
        boolean special = false;
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(password.charAt(i))) {
                digit = true;
            } else if (Character.isLowerCase(password.charAt(i))) {
                lower = true;
            } else if (Character.isUpperCase(password.charAt(i))) {
                upper = true;
            } else {
                special = true;
            }
        }
        if (!digit) {
            count++;
        }
        if (!lower) {
            count++;
        }
        if (!upper) {
            count++;
        }
        if (!special) {
            count++;
        }
        if (n + count < 6) {
            count += 6 - (n + count);
        }
        return count;

    }

}

