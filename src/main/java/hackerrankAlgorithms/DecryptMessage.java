package hackerrankAlgorithms;

import java.util.Arrays;
import java.util.List;

public class DecryptMessage {
    public static void main(String[] args) {
        System.out.println(decryptMessage("a3b4q2i abcd2 abc"));
    }

    public static String decryptMessage(String encryptedMessage) {
        List<String> list = Arrays.stream(encryptedMessage.split(" ")).toList();
        StringBuilder finalResult = new StringBuilder();

        for (int i = list.size() - 1; i >= 0; i--) {
            String word = list.get(i);
            StringBuilder result = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                char currentChar = word.charAt(j);

                if ((currentChar >= 'a' && currentChar <= 'z') || (currentChar >= 'A' && currentChar <= 'Z')) {
                    if (j + 1 < word.length() && word.charAt(j + 1) >= '0' && word.charAt(j + 1) <= '9') {
                        int count = word.charAt(j + 1) - '0';
                        for (int h = 0; h < count; h++) {
                            result.append(currentChar);
                        }
                    } else {
                        result.append(currentChar);
                    }
                }
            }

            if (finalResult.length() > 0) {
                finalResult.append(" ");
            }
            finalResult.append(result);
        }

        return finalResult.toString();
    }

}
